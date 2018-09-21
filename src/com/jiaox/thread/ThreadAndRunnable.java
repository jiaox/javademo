package com.jiaox.thread;
/**
 * Thread类子类run方法和Runnable接口run方法都存在到底执行谁
 * @author Administrator
 *
 */
public class ThreadAndRunnable {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			//覆盖runnable接口的run方法
			@Override
			public void run() {
				
				System.out.println("Runnable run");
				
			}
		}){
			//覆盖了Thread类的run方法
			public void run(){
				System.out.println("sub Thread run");
			}
		}.start();
	}
}
