package com.jiaox.thread.threadpool2;


public class ThreadPoolTest {
	public static void main(String[] args) {
		DefaultThreadPool<MyJob> pool = new DefaultThreadPool<MyJob>();
		for(int i=0;i<9;i++){
			pool.execute(new MyJob(i));
		}
//		pool.shutDown();
	}
}

class MyJob implements Runnable{
	
	private int count = 0;
	
	public MyJob(int count){
		this.count =count;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("MyJob"+count+"任务执行完成!");
	}

	@Override
	public String toString() {
		return "MyJob"+count;
	}
	
	
	
	
}