package com.jiaox.thread;

public class SetNameThreadDemo extends Thread {
	public void run(){
		for(int i=0;i<50;i++){
			printMsg();
		}
	}

	private void printMsg() {
		Thread thread=Thread.currentThread();
		String name=thread.getName();
		System.out.println("name="+name);
	}
	
	public static void main(String[] args) {
		SetNameThreadDemo tt=new SetNameThreadDemo();
		//这里设置线程名称
		tt.setName("test thread");
		tt.start();
		for(int i=0;i<50;i++){
			tt.printMsg();
		}
	}
}
