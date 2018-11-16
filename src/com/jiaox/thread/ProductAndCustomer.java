package com.jiaox.thread;

/**
 * 一个生产者对一个消费者
 * @author Administrator
 *
 */

public class ProductAndCustomer {
	public static void main(String[] args) {
		Resource resource =new Resource();
		Product p1 = new Product(resource);
		Customer c1 = new Customer(resource);
		Thread t1 = new Thread(p1);
		Thread t2 = new Thread(c1);
		
		t1.setName("t1");
		t2.setName("t2");
		
		t1.start();
		t2.start();
	}
}

class Product implements Runnable{
	
	Resource resource ;
	public Product(Resource resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		while(true){
			resource.set(Thread.currentThread().getName());
		}
		
	}
	
}

class Customer implements Runnable{
	
	Resource resource ;
	public Customer(Resource resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		while(true){
			resource.out();
		}
		
	}
	
}

class Resource {
	private String name ;//产品名称
	private int count;
	private boolean flag;//true 生产者等待，false消费者等待
	
	public synchronized void set(String name){
		if(flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		this.name=name+"###"+count;//t1：产品0
		count++;
		System.out.println(Thread.currentThread().getName()+"----生产者----"+this.name);
		flag=true;
		this.notify();
	}
	
	public synchronized void out(){
		if(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"----消费者----"+this.name);
		flag=false;
		this.notify();
	}
}
