package com.jiaox.newcode;


public class Demo3 {
	public static void main(String[] args) {
		String a= "1234";
		String b = "1234";
		String c = new String("1234");
		System.out.println(a==b);//true
		System.out.println(a==c);//false
		System.out.println(a.equals(c));//true
		
		
	}
}
