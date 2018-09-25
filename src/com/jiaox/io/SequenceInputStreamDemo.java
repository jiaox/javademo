package com.jiaox.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.Enumeration;
import java.util.Vector;

/**
 * 序列流，
 * 将多个读取流进行串联
 * 多个读取流，合并成一个读取流
 * 可以实现数据合并。
 * @author Administrator
 *
 */
public class SequenceInputStreamDemo {
public static void main(String[] args) throws IOException {
	Vector<FileInputStream> v=new Vector<FileInputStream>();
	for(int x=1;x<=3;x++){
		v.add(new FileInputStream("E:\\"+x+".txt"));
	}
	Enumeration<FileInputStream> en=v.elements();
	//将多个流对象合并成一个流对象
	SequenceInputStream sis=new SequenceInputStream(en);
	//定义一个目的
	FileOutputStream fos =new FileOutputStream("E:\\123.txt");
	byte[] buf=new byte[1024];
	int len=0;
	while((len=sis.read(buf))!=-1){
		fos.write(buf,0,len);
	}
	fos.close();
	sis.close();
}
}
