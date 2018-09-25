package com.jiaox.thread.countdownlatch;

import java.lang.reflect.Method;
import java.util.concurrent.CountDownLatch;

/**
 * 对CountDownLatch类进行练习
 * 
 * 下面给出了两个类，其中一组 worker 线程使用了两个倒计数锁存器： 第一个类是一个启动信号，在 driver 为继续执行 worker
 * 做好准备之前，它会阻止所有的 worker 继续执行。 第二个类是一个完成信号，它允许 driver 在完成所有 worker 之前一直等待。
 * 
 * 
 * @author Administrator
 * 
 */
public class Driver {
	public static void main(String[] args) throws InterruptedException {

		int N = 10;
		CountDownLatch startSignal = new CountDownLatch(1);
		CountDownLatch doneSignal = new CountDownLatch(N);

		for (int i = 0; i < N; ++i)
			// create and start threads
			new Thread(new Worker(startSignal, doneSignal)).start();

		method(); // don't let run yet
		startSignal.countDown(); // let all threads proceed
		method2();
		doneSignal.await(); // wait for all to finish

	}

	public static void method() {
		System.out.println(Thread.currentThread().getName()
				+ "....method is running");
	}

	public static void method2() {
		System.out.println(Thread.currentThread().getName()
				+ "....method2 is running");
	}

}

class Worker implements Runnable {
	private final CountDownLatch startSignal;
	private final CountDownLatch doneSignal;

	Worker(CountDownLatch startSignal, CountDownLatch doneSignal) {
		this.startSignal = startSignal;
		this.doneSignal = doneSignal;
	}

	public void run() {
		try {
			startSignal.await();
			doWork();
			doneSignal.countDown();
		} catch (InterruptedException ex) {
		} // return;
	}

	void doWork() {
		System.out.println(Thread.currentThread().getName()
				+ "....doWork is running");
	}
}
