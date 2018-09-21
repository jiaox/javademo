package com.jiaox.thread;

public class TwoThreadSleep extends Thread{
	public void run(){
		loop();
	}
	public void loop(){
		String name=Thread.currentThread().getName();
		System.out.println(name+"-------->> 刚进入loop 方法");
		for(int i =0 ;i<10;i++){
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
			}
			System.out.println("name="+name);
		}
		System.out.println(name+"------->>离开loop方法");
	}
	
	public static void main(String[] args) {
		TwoThreadSleep tt =new TwoThreadSleep();
		tt.setName("my worker thread");
		tt.start();//执行线程run方法
		try {
			Thread.sleep(700);
		} catch (Exception e) {
		}
		tt.loop();//执行loop方法
	}
	
}
