package com.jiaox.thread;

public class DemoThread2 {
	public static void main(String[] args) {
		ThreadDemo t=new ThreadDemo();
		new Thread(t).start();
		for(int i=0;i<1000;i++){
		  System.out.println("main 线程在运行");
		}
	}
}

class ThreadDemo implements Runnable{
	public void run() {
		for(int i=0;i<1000;i++){
			System.out.println("ThreadDemo 在运行");
		}
	}
}