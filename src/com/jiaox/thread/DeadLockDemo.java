package com.jiaox.thread;

public class DeadLockDemo implements Runnable{
	A a =new A();
	B b =new B();
	/**
	 * 构造
	 */
	DeadLockDemo(){
		//设置当前线程名称
		Thread.currentThread().setName("Main -->> Thread");
		new Thread(this).start();
		a.funA(b);
		System.out.println("main 线程运行完毕");
	}
	@Override
	public void run() {
		Thread.currentThread().setName("Test-->>Thread");
		b.funB(a);
		System.out.println("其他线程运行完毕");
	}
	
	public static void main(String[] args){
		new DeadLockDemo();
	}

}

class A {
	
	synchronized void funA(B b){
		String name =Thread.currentThread().getName();
		System.out.println(name+" 进入A.foo");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name+" 调用B类中的last()方法");
		b.last();
	}
	synchronized void last(){
		System.out.println("A 类中的last()方法");
	}
}

class B {
	synchronized void funB(A a){
		String name =Thread.currentThread().getName();
		System.out.println(name+" 进入B类中的");
		try {
			Thread.sleep(1000);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		System.out.println(name+" 调用A类中的last()方法");
		a.last();
	}
	
	synchronized void last(){
		System.out.println("B 类中的last()方法");
	}
}
