package com.jiaox.thread;

/**
 * interrupt
 * @author Administrator
 *
 */
public class SleepInterrupt implements Runnable{

	@Override
	public void run() {
		try {
			System.out.println("在run()方法中 - 这个线程休眠20秒");
			Thread.sleep(20000);
			System.out.println("在 run()方法中 - 继续运行");
		} catch (InterruptedException x) {
			System.out.println("在run()方法中 - 中断线程");
			return;
		}
		System.out.println("在 run()方法中 - 休眠之后继续完成");
		System.out.println("在run()方法中 - 正常退出");
	}
	
	public static void main(String[] args) {
		SleepInterrupt si =new SleepInterrupt();
		Thread t = new Thread(si);
		t.start();
		//在此休眠是为确保线程能运行一会
		try {
			Thread.sleep(2000);
		} catch (InterruptedException x) {
			x.printStackTrace();
		}
		System.out.println("在main()方法中  - 中断其他线程");
		t.interrupt();//这句注掉之后 则在 run()方法中 - 继续运行  在 run()方法中 - 休眠之后继续完成  在run()方法中 - 正常退出
		System.out.println("在main()方法中 - 退出");
	}

}
