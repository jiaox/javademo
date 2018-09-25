package com.jiaox.io;

import java.io.UnsupportedEncodingException;

/**
 * 凡是涉及到的字符串，都会有编码表
 * 字符串-->字节数组      编码
 * 字节数组-->字符串      解码
 * 
 */
public class EncodeDemo {
	public static void main(String[] args) throws UnsupportedEncodingException {
		String s ="你好";
		byte[] arr = s.getBytes("UTF-8");
		printArr(arr);
		String s1 = new String(arr,"ISO8859-1");
		System.out.println("s1="+s1);
		byte[] arr1=s1.getBytes("ISO8859-1");//获取乱码对应原数值
		String s2 = new String(arr1,"UTF-8");
		System.out.println("s2="+s2);
	}
	
	public static void method_1() throws UnsupportedEncodingException{
		String s ="你好";
//		byte[] arr = s.getBytes("GBK");
		byte[] arr = s.getBytes("UTF-8");
		
//		printArr(arr);
		String s1 = new String(arr,"GBK");
		System.out.println("s1="+s1);
	}
	
	public static  void printArr(byte[] arr){
		for(int x=0;x<arr.length;x++){
			System.out.println(arr[x]);
		}
	}
}
