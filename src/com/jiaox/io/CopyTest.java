package com.jiaox.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 需求：将D:\filedemo\a.txt中的内容复制到D:\filedemo\b.txt中
 * @author Administrator
 *
 */
public class CopyTest {
	public static void main(String[] args) {
		copy_2();
	}
	
	public static void copy_1() throws IOException{
		FileWriter fw=new FileWriter("D:\\filedemo\\b.txt");
		FileReader fr=new FileReader("D:\\filedemo\\a.txt");
		int ch=0;
		while((ch=fr.read())!=-1){
			fw.write(ch);
		}
		
		fw.close();
		fr.close();
	}
	
	public static void copy_2(){
		FileWriter fw=null;
		FileReader fr=null;
		try {
			fw=new FileWriter("D:\\filedemo\\c.txt");
			fr=new FileReader("D:\\filedemo\\a.txt");
			char[] buf=new char[1024];
			int len=0;
			while((len=fr.read(buf))!=-1){
				fw.write(buf,0,len);
			}
		} catch (IOException e) {
			throw new RuntimeException("读取失败");
		}finally{
			if(fw!=null){
				try {
					fw.close();
				} catch (IOException e) {
					throw new RuntimeException("写入关闭失败");
				}
			}
			
			if(fr!=null){
				try {
					fr.close();
				} catch (IOException e) {
					throw new RuntimeException("读取关闭失败");
				}
			}
		}
		
		
	}
	
}
