package com.jiaox.nio;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * java 7 提供了基于try-catch的自动资源管理
 * @author Administrator
 *
 */
public class ARMTest {

	public static void main(String[] args) {
		
	}
	
	public static void test2() {
		try(
				/**
				 * 能够实现资源自动关闭需要满足的条件：
				 * 1.可以在一条try 语句中管理多个资源，每个资源用";"隔开
				 * 2.必须实现AutoCloseable或者Closeable
				 * 
				 * 目的：不需要在使用finally 显示关闭资源。
				 */
				FileInputStream fis = new FileInputStream("E:\\jiaox.txt");//此处生成的是final的，下边可以用，但不会修改，而且后边会自动关闭，不用手动关闭。
				FileOutputStream fos = new FileOutputStream("E:\\abc.txt");//
		)
		{
			//可能出现异常的代码
			int data ;
			while((data=fis.read())!=-1){
				System.out.println((char)data);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	
	public static void test() {
		FileInputStream fis = null;
		int data ;
		try {
			fis = new FileInputStream("E:\\jiaox.txt");
			while((data=fis.read())!=-1){
				System.out.println((char)data);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally{
			if(fis!=null){
				try {
					fis.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		
	}
}
