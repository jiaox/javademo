package com.jiaox.thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * 在1.5以后，java提供了新对象
 * 在java.util.concurent.locks包中提供了Lock接口
 * 这个对象的产生替换了synchronized同步
 * 好处在于
 * synchronized对锁的操作都是隐式的，只要执行到同步语句就获取锁，执行完同步语句就释放锁，用起来不明显
 * 
 * Lock是按照面向对象思想将锁操作封装成对象，并提供对锁的显式操作，lock()获取锁，unlock()释放锁
 * 
 * ReentrantLock是Lock的实现类，可重入的互斥锁
 * 
 * 操作监视器的方法wait notify  notifyAll 都是需要关联自己所属的同步锁的
 * 有了新的锁对象以后，应该找到和新锁对象关联的操作监视器的方法
 * 1.5以后，在有了一个java.util.concurent.locks包中提供了一个Condition对象，用它替代Object,并提供了替代wait,notify,notifyAll的方法
 * await,signal,signalAll
 * 
 * Lock的好处是一个lock对象可以绑定多个监视器对象,可以解决生产者消费者用notifyAll唤醒本方线程的问题。
 * 而以前一个锁只能绑定一个监视器。
 * 
 * @author Administrator
 *
 */
public class TestLock {
	public static void main(String[] args) {
		Resource3 resource =new Resource3();
		Product3 p1 = new Product3(resource);
		Product3 p2 = new Product3(resource);
		Customer3 c1 = new Customer3(resource);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		Thread t3 = new Thread(p2);
		
//		t1.setName("t1");
//		t2.setName("t2");
//		t3.setName(name);
		
		t1.start();
		t2.start();
		t3.start();
	}
}

class Resource3 {
	private String name ;//产品名称
	private int count;
	private boolean flag;//true 生产者等待，false消费者等待
	
	//创建一个锁对象
	private Lock lock = new ReentrantLock();
//	private Condition con = lock.newCondition();
	//在一个锁上创建两个监视器
	private Condition proCon = lock.newCondition();
	private Condition cusCon = lock.newCondition();
	
	public  void set(String name){
		lock.lock();
		try{
			while(flag){
				try {
//					this.wait();
//					con.await();
					//生产者等待
					proCon.await();
					
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			this.name=name+"###"+count;//t1：产品0
			count++;
			System.out.println(Thread.currentThread().getName()+"----生产者----"+this.name);
			flag=true;
//			this.notifyAll();
//			con.signalAll();
			//唤醒消费者线程
			cusCon.signal();
		}finally{
			lock.unlock();
		}
		
		
	}
	
	public  void out(){
		lock.lock();
		try{
			while(!flag){
				try {
//					this.wait();
//					con.await();
					//消费者等待
					cusCon.await();
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
			System.out.println(Thread.currentThread().getName()+"----消费者----"+this.name);
			flag=false;
//			this.notifyAll();
//			con.signalAll();
			proCon.signal();
		}finally{
			lock.unlock();
		}
		
		
	}
}

class Product3 implements Runnable{
	
	Resource3 resource ;
	public Product3(Resource3 resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		while(true){
			resource.set(Thread.currentThread().getName());
		}
		
	}
	
}

class Customer3 implements Runnable{
	
	Resource3 resource ;
	public Customer3(Resource3 resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		while(true){
			resource.out();
		}
		
	}
	
}


