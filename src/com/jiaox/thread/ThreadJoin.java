package com.jiaox.thread;

public class ThreadJoin {
	public static void main(String[] args) {
		ThreadTest2 t = new ThreadTest2();
		Thread pp = new Thread(t);
		pp.start();
		int i=0;
		for(int x=0;x<10;x++){
			if(i==5){
				try {
					pp.join();
				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			
			System.out.println("main Thread "+ i++);
		}
	}
}

class ThreadTest2 implements Runnable{

	@Override
	public void run() {
		String str = new String ();
		int i=0;
		for(int x= 0; x<10;x++){
			System.out.println(Thread.currentThread().getName()+"---->>"+i++);
		}
	}
	
}
