package com.jiaox.thread;

/**
 * 写一个简单死锁程序
 * @author Administrator
 *
 */
public class DeadLockDemo2 {
	public static void main(String[] args) {
		DeadLock d1 = new DeadLock(false);
		DeadLock d2 = new DeadLock(true);
		new Thread(d1).start();
		new Thread(d2).start();
	}
}
class DeadLock implements Runnable{
	private boolean flag;
	DeadLock(boolean flag){
		this.flag =flag;
	}
	
	public void run(){
		if(flag){
			while(true){
				synchronized (MyLock.locka) {
					System.out.println(Thread.currentThread().getName()+"...if........locka");
					synchronized (MyLock.lockb) {
						System.out.println(Thread.currentThread().getName()+"...if........lockb");
					}
				}
			}
			
		}else{
			while(true){
				synchronized (MyLock.lockb) {
					System.out.println(Thread.currentThread().getName()+"....else........lockb");
					synchronized (MyLock.locka) {
						System.out.println(Thread.currentThread().getName()+"....else........locka");
					}
				}
			}
			
		}
	}
}

class MyLock {
	static Object locka =new Object();
	static Object lockb =new Object();
}