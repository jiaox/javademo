package com.jiaox.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class TransStreamDemo2 {
	public static void main(String[] args) throws IOException {
		//读取键盘录入，按照一行的形式
		BufferedReader bufr =new BufferedReader(new InputStreamReader(System.in));
		
		//读取一个文本
		bufr = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\source.txt")));
		
		//将字符串数据编程字节打印到控制台上
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		//将数据保存到文件中。
		bufw=new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\trans.txt")));
		
		String line=null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line)){
				break;
			}
			
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		
		bufw.close();
		bufr.close();
	}
}
