package com.jiaox.newcode;


public class Demo9 {
	public static int add(int a,int b){
		try {
			return a+b;
		} catch (Exception e) {
			System.out.println("catch语句块");
		}finally{
			System.out.println("finally 语句块");
		}
		return 0;
	}
	
	public static void main(String[] args) {
		Demo9 test = new Demo9();
		System.out.println("和是："+test.add(9, 34));
	}
}
