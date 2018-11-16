package com.jiaox.thread;

/**
 * 多个生产者消费者之间
 * @author Administrator
 *
 */
public class ProductAndCustomer2 {
	public static void main(String[] args) {
		Resource2 resource =new Resource2();
		Product2 p1 = new Product2(resource);
		Product2 p2 = new Product2(resource);
		Customer2 c1 = new Customer2(resource);
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
class Product2 implements Runnable{
	
	Resource2 resource ;
	public Product2(Resource2 resource) {
		this.resource=resource;
	}
	
	@Override
	public void run() {
		while(true){
			resource.set(Thread.currentThread().getName());
		}
		
	}
	
}

class Customer2 implements Runnable{
	
	Resource2 resource ;
	public Customer2(Resource2 resource) {
		this.resource=resource;
	}
	@Override
	public void run() {
		while(true){
			resource.out();
		}
		
	}
	
}

class Resource2 {
	private String name ;//产品名称
	private int count;
	private boolean flag;//true 生产者等待，false消费者等待
	
	public synchronized void set(String name){
		while(flag){
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
		this.notifyAll();
	}
	
	public synchronized void out(){
		while(!flag){
			try {
				this.wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName()+"----消费者----"+this.name);
		flag=false;
		this.notifyAll();
	}
}