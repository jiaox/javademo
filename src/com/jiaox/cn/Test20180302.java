package com.jiaox.cn;

import org.junit.Test;

public class Test20180302 {
	public static void main(String[] args) {
//		test1();
//		test2();
	}
	
	/**
	 * Integer 值比较问题
	 */
	@Test
	public  void test2() {
		Integer a1=40,a2=40,a3=148,a4=148;
		
		System.out.println("a1=a2:"+(a1==a2));//true
		System.out.println("a3=a4:"+(a3==a4));//false;==是比较的地址， 因为超过120
		
	}

	/**
	 * 测试int类型长度
	 */
	@Test
	public  void test1(){
		int a = (int) 2147483648L;
		System.out.println(a);//-2147483648
	}
	
	/**
	 * 测试 sysout 
	 */
	@Test
	public  void test3(){
		System.out.println(3+3+"45"+2+1);//64521
	}
	
}
