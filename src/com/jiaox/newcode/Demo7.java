package com.jiaox.newcode;

public class Demo7 {
	String str = new String("hello");
	char[] ch={'a','b','c'};
	public void fun(String str,char ch[]){
		str = "world";
		ch[0] ='d';
	}
	public static void main(String[] args) {
		Demo7 test1 = new Demo7();
		test1.fun(test1.str, test1.ch);
		System.out.println(test1.str+" and ");
		System.out.println(test1.ch);
	}
}
