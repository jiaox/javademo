package com.jiaox.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class StreamDemo {
	public static void main(String[] args) {
		File f = new File("d:\\temp.txt");
		OutputStream out = null;
		try {
			out = new FileOutputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//将字符串转成字节组
		byte b [] = "Hello World2!!!!".getBytes();
		try {
			//将byte数组写入到文件之中
			out.write(b);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//读文件操作
		InputStream in = null;
		try {
			in = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		//开辟一个控件用于接收文件读进来的数据
		byte b1[] = new byte[1024];
		int i =0;
		try {
			i = in.read(b1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		//将byte数组转换为字符串输出
		System.out.println(new String(b1,0,i));
		
		
	}
}
