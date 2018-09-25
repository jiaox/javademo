package com.jiaox.io;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class EncodingDemo {
	
	 public static void main(String args[]) throws Exception
	 {
	 // 在这里将字符串通过getBytes()方法，编码成GB2312
	 byte b[] = "大家一起来学Java语言".getBytes("GB2312") ;
	 OutputStream out = new FileOutputStream(new File("d:\\encoding.txt")) ;
	 out.write(b) ;
	 out.close() ;
	 }
}
