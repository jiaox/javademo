package com.jiaox.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;

import com.sun.istack.internal.FragmentContentHandler;
import com.sun.org.apache.bcel.internal.generic.NEW;

public class TransStreamDemo3 {
	public static void main(String[] args) throws IOException {
//		writeFileByGBK();
//		writeFileByU8();
//		readFileByGBK();
		readFileByU8();
	}
	
	//识别中文的码表，不止GBK还有UTF-8
	//需求，想要用UTF-8存储中文，需要指定码表.需要用FileWriter的父类，转换流来指定具体编码表
	public static void writeFileByU8() throws IOException{
		OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\gbk2.txt"), "utf-8");
		osw.write("你好");
		osw.close();
	}
	
	public static void writeFileByGBK() throws IOException{
		FileWriter fw=new FileWriter("E:\\gbk.txt");//创建对象时，该对象使用了默认的编码GBK
		fw.write("你好");
		fw.close();
	}
	
	/**
	 * OutputStreamWriter osw=new OutputStreamWriter(new FileOutputStream("E:\\gbk2.txt"), "GBK");
	 * FileWriter fw=new FileWriter("E:\\gbk.txt");
	 * 两句代码功能上是等效的。
	 * FileWriter 作为子类，其实就提供了一个方便的应用
	 * 因为本机默认的码表最为常用
	 * 所以就在转派流中进行了子类的扩展，将本机默认的码表进行了对象的封装
	 * 才有了 FileWriter。可以直接操作文本文件的对象。
	 * FileWriter ： GBK + file
	 * 
	 * 转换流：字节流+编码表
	 * @throws IOException 
	 * 
	 */
	
	public static void readFileByGBK() throws IOException{
		FileReader fr = new FileReader("E:\\gbk2.txt");
		char[] buf =new char[10];
		int len = fr.read(buf);
		System.out.println(new String(buf,0,len));
		fr.close();
		
	}
	
	
	public static void readFileByU8() throws IOException{
		InputStreamReader isr = new InputStreamReader(new FileInputStream("E:\\gbk2.txt"),"utf-8");
		char[] buf = new char[10];
		int len = isr.read(buf);
		System.out.println("len="+len);
		System.out.println(new String(buf,0,len));
		isr.close();
				
		
	}
}
