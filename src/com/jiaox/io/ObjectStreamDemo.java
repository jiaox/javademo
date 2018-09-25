package com.jiaox.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * 对象的反序列化，序列化   用ObjectInputStream,ObjectOutputStream
 * @author Administrator
 *
 */
public class ObjectStreamDemo {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		writeObj();
		readObj();
	}
	
	public static void writeObj() throws IOException{
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("E:\\obj.txt"));
		oos.writeObject(new Person("lisi", "20"));//对象的持久化存储，把对象从堆内存保存到硬盘上。
		oos.close();
	}
	
	public static void readObj() throws IOException, ClassNotFoundException {
		ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\obj.txt"));
		Person person = (Person) ois.readObject();//ClassNotFoundException 
		System.out.println(person.getName()+","+person.getAge());
		ois.close();
	}
}
