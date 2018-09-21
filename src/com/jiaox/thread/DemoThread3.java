package com.jiaox.thread;

public class DemoThread3 {
	public static void main(String[] args) {
		new ThreadDemo3().start();
		new ThreadDemo3().start();
		new ThreadDemo3().start();
		new ThreadDemo3().start();
	}
    
}
class ThreadDemo3 extends Thread{
	private int tickets=20;
	public void run (){
		while(true){
			if(tickets>0){
				System.out.println(Thread.currentThread().getName()+"出售票"+tickets--);
			}
		}
	}
}
