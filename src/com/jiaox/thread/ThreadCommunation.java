package com.jiaox.thread;

public class ThreadCommunation {
	public static void main(String[] args) {
		P q = new P();
		new Thread(new Producer(q)).start();
		new Thread(new Consumer(q)).start();
	}
}

class Producer implements Runnable{
	P q = null;
	public Producer(P q){
		this.q=q;
	}
	
	
	@Override
	public void run() {
		int i = 0;
		while(true){
			if(i==0){
				q.set("张三","男");
			}else{
				q.set("李四","女");
			}
			i=(i+1)%2;
		}
	}
	
}

class P {
	String name ="李四";
	String sex ="女";
	boolean bFull = false ;//表示数据存储空间的状态，当Consumer线程取走数据后，bFull值为false，
						   //当Producer线程放入数据后，bFull值为true。只有bFull为true时，
						   //Consumer线程才能取走数据，否则就必须等待Producer线程放入新的数据后的通知；
					       //反之，只有bFull为false，Producer线程才能放入新的数据，否则就必须等待Consumer线程取走数据后的通知。
	public synchronized void set(String name,String sex){
		if(bFull){
			try {
				wait(); //后来的线程要等待
			} catch (InterruptedException e) {
			}
		}
		this.name = name;
		try {
			Thread.sleep(10);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		this.sex = sex;
		bFull = true ;
		notify(); //唤醒最先到达的线程。
	}
	public synchronized void get(){
		if(!bFull){
			try {
				wait();
			} catch (InterruptedException e) {
			}
		}
		System.out.println(name + "---->"+sex);
		bFull =false;
		notify();
	}
	
}

class Consumer implements Runnable{
	P q = null;
	public Consumer (P q){
		this.q = q;
	}
	public void run() {
		while(true){
			q.get();
		}
	}
}

