package com.jiaox.newcode;

public class Demo2 {
	public static void main(String[] args) {
		int count=0;
		int num =0;
		for(int i =0 ;i<=100;i++){
			num = num +i;
			count = count ++;
		}
		System.out.println("num*count="+(num*count));
	}
}
