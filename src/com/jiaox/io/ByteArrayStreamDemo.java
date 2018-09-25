package com.jiaox.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;

/**
 * 不用关流，也不用抛异常
 * @author Administrator
 *
 */
public class ByteArrayStreamDemo {
	public static void main(String[] args) {
		byte[] buf = "abcdef".getBytes();
		ByteArrayInputStream  bis = new ByteArrayInputStream(buf);
		ByteArrayOutputStream bos = new ByteArrayOutputStream();
		int ch=0;
		while((ch=bis.read())!=-1){
			bos.write(ch);
		}
		
		System.out.println(bos.toString());
	}
}
