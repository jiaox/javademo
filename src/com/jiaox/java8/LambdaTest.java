package com.jiaox.java8;

import org.junit.Test;

public class LambdaTest {
	@Test
	public void test(){
		Runnable r = ()->{
			for(int i=0;i<10;i++){
				System.out.println(i);
			}
		};
		
		Thread t = new Thread(r);
		
		t.start();
		
		
	}
}
