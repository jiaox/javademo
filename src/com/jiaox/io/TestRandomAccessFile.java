package com.jiaox.io;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * RandomAccessFile
 * 特点
 * 1.可以对数据进行读取和写入
 * 2.内部封装了一个大型byte数组，来存储要操作的数据
 * 3.内部提供了了操作数组的指针，可以通过getFilePointer获取指针位置还可以通过seek获取指针位置。
 *
 * 4.这个对象不属于任何体系中的医院，但它确实在io包中，一个很有特点的工具类。
 * 5.该对象只能操作文件。
 * 6.
 * @author Administrator
 *
 */
public class TestRandomAccessFile {
	
	public static void main(String[] args) throws IOException {
		writeFile();
//		readFile();
	}
	
	public static void readFile() throws IOException{
		RandomAccessFile raf = new RandomAccessFile("E:\\raf.txt", "r");
		
		//想要获取第二人信息，将指针指到8的位置上
//		raf.seek(8);//想从哪读，就从哪读
		
		
		byte[] buf = new byte[8];//一次读四个字节
		
		raf.read(buf);
		String name = new String (buf);
		int age = raf.readInt();
		System.out.println("pos="+raf.getFilePointer());
		System.out.println(name+"...."+age);
		
	}
	
	public static void writeFile() throws IOException{
		/**
		 * 如果文件存在，既不重新创建，也不覆盖。
		 */
		RandomAccessFile raf = new RandomAccessFile("E:\\raf.txt", "rw");
		/**
		 * 需求，写一些个人信息
		 * 
		 */
		/*raf.write("zhangsan".getBytes());
		raf.writeInt(97);
		raf.write("lisi".getBytes());
		raf.writeInt(99);
		raf.close();*/
		
		raf.seek(8*4);
		raf.write("哈哈".getBytes());
		raf.writeInt(103);
		raf.close();
		
	}
}
