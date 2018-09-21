package com.jiaox.thread;

public class StartThreadDemo extends Thread{
	public void run(){
		for(int i=0;i<10;i++){
			printMsg();
		}
	}

	private void printMsg() {
		Thread t = Thread.currentThread();
		String name = t.getName();
		System.out.println("name="+name);
	}
	
	public static void main(String[] args) {
		StartThreadDemo t=new StartThreadDemo();
		t.setName("test Thread");
		System.out.println("调用 start()方法之前，t.isAlive="+t.isAlive());
		t.start();
		System.out.println("刚调用start()方法时，t.isAlive()"+t.isAlive());
		for(int i=0;i<10;i++){
			t.printMsg();
		}
		//下面语句的输出结果是不固定的，有时输出false，有时输出true
		System.out.println("main()方法结束时，t.isAlive()="+t.isAlive());
	}
}
