package com.jiaox.io;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamDemo {
	public static void main(String[] args) throws IOException {
		FileInputStream fis= new FileInputStream("D:\\filedemo\\e.txt");
		
		//使用临时缓冲区，高效
		byte[] buf=new byte[1024];//定义1024因为，1KB是计算机的基本单位，存起来比较方便。可以写1024的倍数。建议直接写，不要写乘号，涉及计算。
		int len=0;
		while((len=fis.read(buf))!=-1){
			System.out.println(new String(buf,0,len));//这么写避免浪费空间，直接将buf里的有效位存到String中，而不是将全部的1024位转换。
		}
		
		/*
		//一个字节一个字节的读
		int ch =0;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
		}
		*/
		fis.close();
	}
}
