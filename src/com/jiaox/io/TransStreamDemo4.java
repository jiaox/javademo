package com.jiaox.io;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 需求，按照指定的utf-8的编码形式读取一个文本文件
 * @author Administrator
 *
 */
public class TransStreamDemo4 {
	public static void main(String[] args) throws IOException {
		readFile();
	}
	
	public static void readFile() throws IOException{
		BufferedReader bfr=new BufferedReader(new InputStreamReader(new FileInputStream("E:\\test.txt"), "utf-8"));
//		char[] buf= new char[10];
//		int len = bfr.readLine(buf);
		String len=null;
		while((len=bfr.readLine())!=null){
			System.out.println(len);
		}
		
		bfr.close();
	}
	
}
