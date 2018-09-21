package com.jiaox.thread;

public class InterruptCheck {
	public static void main(String[] args) {
		Thread t = Thread.currentThread();
		System.out.println("A: t.isInterrupted()="+t.isInterrupted());
		t.interrupt();
		System.out.println("B: t.isInterrupted()="+t.isInterrupted());
		System.out.println("C: t.isInterrupted()="+t.isInterrupted());
		try {
			Thread.sleep(2000);//因为线程已经中断，所以执行sleep会抛出异常
			System.out.println("线程没有被中断");
		} catch (Exception e) {
			System.out.println("线程被中断！");
		}
		//因为sleep抛出了异常，所以他清除了中断标志
		System.out.println("D: t.isInterrupted()="+t.isInterrupted());
	}
}
