package com.jiaox.thread;

public class DemoThread {
	public static void main(String args[]){
		
		new ThreadDemo1().start();
		
		for(int i=0;i<1000;i++){
			System.out.println("main 线程在运行");
		}
		
	}
}

class ThreadDemo1 extends Thread{
	public void run(){
		for(int i=0;i<1000;i++){
			System.out.println("ThreadDemo1 在运行");
		}
	}
}
