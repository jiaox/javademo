package com.jiaox.thread;
/**
 *  多线程，5个线程内部打印hello和word，hello在前，要求提供一种方法使得5个线程先全部打印出hello后再打印5个word。
 * @author Administrator
 *
 */
public class Five {
	//定义一个公共锁对象
	private static CommonLock lock;
	public static void main(String[] args) {
		//初始化该对象，1为条件，为锁初始化status的值，使全部子线程在开始之初仅有thread1能继续运行，
		//而其他线程进入阻塞状态，待thread1打印完hello后，将nextStatus赋值给currentStatue,
		//并通过公共锁lock唤醒所有以lock对象为锁的子线程
		lock =new CommonLock(1);
        Thread thread1 = new Thread(new  MyRunnable(lock,1,2),"线程1");
        Thread thread2 = new Thread(new  MyRunnable(lock,2,3),"线程2");
        Thread thread3 = new Thread(new  MyRunnable(lock,3,4),"线程3");
        Thread thread4 = new Thread(new  MyRunnable(lock,4,5),"线程4");
        Thread thread5 = new Thread(new  MyRunnable(lock,5,1),"线程5");
        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();
        thread5.start();

	}
}

class MyRunnable implements Runnable {
	 
	//公共锁对象
	private CommonLock lock;
	//线程标志，创建线程时初始化该值，并在run()方法中判断lock对象的status变量是否与其相等，是则运行
	private int currentStatuc;
    //若该子线程得以运行并打印完后，将lock对象的status设置为该值，之后唤醒所有使用该锁的子线程
	private int nextStatus;
    
	public MyRunnable(CommonLock lock, int currentStatuc, int nextStatus) {
		this.lock = lock;
		//初始化线程的标志
		this.currentStatuc = currentStatuc;
		//初始化下一个要运行的线程的标志
		this.nextStatus = nextStatus;
	}
 
	@Override
	public void run() {
		for(int j=0;j<2;j++){
            synchronized (lock){
                while(lock.getStatus()!=currentStatuc){
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.setStatus(nextStatus);
                if(j == 0){
                	System.out.print(Thread.currentThread().getName()+"  Hello");
                }else if(j == 1){
                	System.out.print(Thread.currentThread().getName()+"  World");
                }
                lock.notifyAll();
                System.out.println("    lock.getStatus "+lock.getStatus());
            }
        }
	}
 
}

class CommonLock {
	
	//决定哪个子线程运行的条件
	private int status;
	
	
	public CommonLock(int status) {
		this.status = status;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
}
