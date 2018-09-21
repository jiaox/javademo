package com.jiaox.thread;

public class ThreadDemo9_5 {
	public static void main(String[] args) {
		TestThread4 t = new TestThread4();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
		new Thread(t).start();
	}
}

class TestThread4 implements Runnable{
	private int tickets=20;
	@Override
	public void run() {
		while(true){
			synchronized (this) {//设置同步
				if(tickets>0){
					try {
						Thread.sleep(100);
					} catch (Exception e) {
						
					}
					System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
				}
			}
		}
	}
	
}
