package com.jiaox.io;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Reader;
import java.io.Writer;

public class CharDemo {
	public static void main(String[] args) {
		File f = new File("d:\\temp.txt");
		Writer out = null;
		try {
			out=new FileWriter(f);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//声明一个String 类型对象
		String str ="Hello World!";
		try {
			out.write(str);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		//读文件操作
		Reader in = null;
		try {
			in = new FileReader(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//开辟一个空间用于接收文件读进来的数据
		char c1[]=new char[1024];
		int i = 0;
		
		try {
			//将c1的引用传递到read方法中，同时此方法返回读入数据的个数
			i = in.read(c1);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		try {
			in .close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(new String(c1,0,i));
		
	}
}
