package com.jiaox.thread;

/**
 * 演示：如何停止线程
 * stop() 方法已过时
 * 所以停止线程，就只能让线程执行的代码结束，也就是run方法执行完，线程就结束了
 * 
 * 停止线程的思想
 * 让run方法结束
 * 而run方法通常都定义循环。
 * 我们只要控制住循环即可。
 * 1. 定义控制循环的标记
 * 2.定义标记可以解决线程的停止，但是如果线程进入到了冻结状态，那么线程是没有执行权去执行这个标记的。
 * 所以线程还是停不下来。
 * 这时如果没有正确的恢复机制，比如sleep时间到，或者notify
 * 那么就只能用interrupt方法。
 * interrupt():当线程处于冻结状态时，可以强制将线程的冻结状态清除，让线程恢复到具备执行资格，也就是临时阻塞状态。因为只有让线程回复到运行状态，线程才可以读取到标记，才可以结束，才可以循环，才可以停止。
 * 
 * @author Administrator
 *
 */
public class StopThreadDemo {
	public static void main(String[] args) {
		StopThread st = new StopThread();
		Thread t1=new Thread(st);
		Thread t2 = new Thread(st);
		t1.start();
		t2.start();
		int num =1;
		while(true){
			if(++num==50){
//				st.setFlag();
				t1.interrupt();
				t2.interrupt();
				break;
			}
			System.out.println(Thread.currentThread().getName()+"......"+num);
		}
		System.out.println("hello world");
	}
}

class StopThread implements Runnable{
	private boolean  flag =true;
	@Override
	public synchronized void run() {
		while(flag){
			try {
				wait();
			} catch (InterruptedException e) {
				System.out.println(Thread.currentThread().getName()+"----------Exception");
				flag=false;
			}
			System.out.println(Thread.currentThread().getName()+"......");
		}
	}
	public void setFlag(){
		flag=false;
	}
}