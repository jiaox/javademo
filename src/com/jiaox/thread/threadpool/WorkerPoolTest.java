package com.jiaox.thread.threadpool;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/**
 * 下面是使用 ThreadPoolExecutor 的线程池实现示例
 * 请注意：在初始化 ThreadPoolExecutor 时，初始线程池大小设为2、最大值设为4、工作队列大小设为2。
 * 所以，如果当前有4个任务正在运行而此时又有新任务提交，工作队列将只存储2个任务和其他任务将交由RejectedExecutionHandlerImpl 处理。
 * @author Administrator
 *
 */
public class WorkerPoolTest {
	public static void main(String args[]) throws InterruptedException{
        //RejectedExecutionHandler implementation 拒绝策略的实现类
        RejectedExecutionHandlerImpl rejectionHandler = new RejectedExecutionHandlerImpl();
        //Get the ThreadFactory implementation to use
        ThreadFactory threadFactory = Executors.defaultThreadFactory();
        //creating the ThreadPoolExecutor 创建一个线程池，初始线程池大小设为2、最大值设为4、工作队列大小设为2。
        //ThreadPoolExecutor 继承自 AbstractExecutorService
        ThreadPoolExecutor executorPool = new ThreadPoolExecutor(2, 4, 10, TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(2), threadFactory, rejectionHandler);
        //start the monitoring thread 创建监控线程
        MyMonitorThread monitor = new MyMonitorThread(executorPool, 3);
        Thread monitorThread = new Thread(monitor);
        monitorThread.start();
        //submit work to the thread pool 将线程提交给线程池
        for(int i=0; i<10; i++){
            executorPool.execute(new WorkerThread("cmd"+i));
        }
        System.out.println("-----当前线程"+Thread.currentThread().getName());
        Thread.sleep(30000);
        //shut down the pool
        executorPool.shutdown();
        //shut down the monitor thread
        System.out.println("-----当前线程2"+Thread.currentThread().getName());
        Thread.sleep(5000);
        monitor.shutdown();
    }
}
