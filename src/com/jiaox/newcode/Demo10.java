package com.jiaox.newcode;


public class Demo10 {
	public static void main(String[] args) throws InterruptedException {
		final Object obj = new  Object();
		Thread t1 = new Thread(){
			public void run(){
				System.out.println("--------"+Thread.currentThread().getName());
				synchronized (obj) {
					try {
						obj.wait();
						System.out.println("Thread 1 wake up.");
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		};
		t1.setName("TTTTT1");
		t1.start();
		System.out.println("--------"+Thread.currentThread().getName());
		Thread.sleep(1000);//我们设定Thread 1 必须在1s内启动
		System.out.println("--------"+Thread.currentThread().getName());
		Thread t2 = new Thread(){
			public void run(){
				System.out.println("--------"+Thread.currentThread().getName());
				synchronized (obj) {
					obj.notifyAll();
					System.out.println("Thread 2 Sent notify");
				}
			}
		};
		System.out.println("--------"+Thread.currentThread().getName());
		t2.setName("TTTTT2");
		t2.start();
		System.out.println("--------"+Thread.currentThread().getName());
	}
}
