package com.jiaox.io;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
/**
 * 当需要对对象操作基本数据类型时，用DataOutputStream，DataInputStream
 * @author Administrator
 *
 */
public class DataStreamDemo {
	public static void main(String[] args) throws IOException {
		/*DataOutputStream dos = new DataOutputStream(new FileOutputStream("E:\\doc.txt"));
		dos.writeUTF("你好");
		dos.close();*/
		
		DataInputStream dis=new DataInputStream(new FileInputStream("E:\\doc.txt"));
		String s =dis.readUTF();
		System.out.println(s);
		dis.close();
		
	}
}
