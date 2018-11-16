package com.jiaox.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * 实现类似于内存虚拟文件
 * @author Administrator
 *
 */
public class ByteArrayDemo {
	public static void main(String[] args) {
		String tmp = "abcdefghijklmnopqrstuvwxyz";
		byte[] src = tmp.getBytes();
		for(byte b:src){
			System.out.println(b);
		}
		ByteArrayInputStream input= new ByteArrayInputStream(src);
		ByteArrayOutputStream output = new ByteArrayOutputStream();
		new ByteArrayDemo().transform(input, output);
		byte[] result=output.toByteArray(); //result 为转换后的内存块
		System.out.println("-----------------");
		System.out.println(new String(result));
	}
	
	public void transform(InputStream in,OutputStream out){
		int c =0 ;
		try {
			while((c=in.read())!=-1){//read在读到结尾处返回-1
				int C =Character.toUpperCase((char)c);
				out.write(C);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
