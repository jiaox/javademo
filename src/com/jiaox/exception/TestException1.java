package com.jiaox.exception;

public class TestException1 {
	public static void main(String[] args) {
		test3();
	}
	
	public static void test1(){
		int arr[] = new int[5];
		arr[10] = 7;
		System.out.println("end of main method");
	}
	
	public static void test2(){
		
		try {
			int arr[] = new int[5];
			arr[10] = 7;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("出现异常");
		}finally{
			System.out.println("一定执行");
		}
		
		System.out.println("end of main method");
	}
	
	public static void test3(){
		int a=4,b=0;
		try {
			if(b==0){
				throw new ArithmeticException("一个算术异常");
			}else{
				System.out.println(a+"/"+b+"="+a/b);// 若不抛出异常，则执行此行
			}
		} catch (ArithmeticException e) {
			System.out.println("抛出异常为："+e);
		}
	}
}
