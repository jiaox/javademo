package com.jiaox.cn;

public class DataType {
	public static void main(String[] args) {

		
	}
	
	
	public static void test1(){
		long a =329852547553L;
		int b= 13;
		a+=b;
		System.out.println(a);
	}
	
	public static void test2(){
		int aa=1;
//		aa+=1.1;
		
		double b = aa+1.1;
//		aa=aa+1.1;
		
		System.out.println(b);
	}
	
	public static void test3(){
//		byte b=1,c=2;
//		byte a=b+c;  //这样会报错，b+c变成了int类型
	}
}
