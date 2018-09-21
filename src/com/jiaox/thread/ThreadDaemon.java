package com.jiaox.thread;

public class ThreadDaemon {
	public static void main(String[] args) {
		ThreadTest t = new ThreadTest();
		Thread tt =new Thread(t);
		tt.setDaemon(true);//设置后台运行
		tt.start();
	}
}

class ThreadTest implements Runnable{
	@Override
	public void run() {
		while(true){
			System.out.println(Thread.currentThread().getName()+" is running");
		}
	}
	
}