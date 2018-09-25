package com.jiaox.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class TransStreamDemo {
	public static void main(String[] args) throws IOException {
		InputStream in = System.in;
		/**
		 * 发现键盘录入的数据是文本，所以按照一行的形式获取更为方便。
		 * 但是每次都自己定义缓冲区并判断回车符好麻烦
		 * 发现bufferedReader有一个很爽的方法，已经完成这个动作，就是传说中的readLine
		 * 所以使用readLine完成
		 * 
		 * 如何完成用字符流缓冲区处理System.in的数据？
		 * 这就需要一个字节想字符过度的桥梁
		 */
		//需要将字节流转字符流
		BufferedReader bufr=new BufferedReader(new InputStreamReader(in));
		
		OutputStream out =System.out;
		
		BufferedWriter bufw=new BufferedWriter(new OutputStreamWriter(out));
		
		String line=null;
		while((line=bufr.readLine())!=null){
			if("over".equals(line)){
				break;
			}
//			System.out.println(line.toUpperCase());
			bufw.write(line.toUpperCase());
			bufw.newLine();
			bufw.flush();
		}
		bufw.close();
		bufr.close();
		
	}
}
