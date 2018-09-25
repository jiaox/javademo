package com.jiaox.io;

import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {
	public static void main(String[] args) {
		method_4();
	}
	
	public static void method_4(){
		File dir=new File("D:\\");
		File[] files=dir.listFiles();
		for(File file:files){
			System.out.println(file);
		}
	}
	
	
	public static void method_3(){
		File dir =new File("D:\\");
		String[] names = dir.list(new FilterBySufix(".js"));
		for(String name:names){
			System.out.println(name);
		}
	}
	
	public static void method_1(){
		File[] roots=File.listRoots();
		for(File f:roots){
			System.out.println(f);
		}
 	}
	public static void method_2(){
		File dir=new File("D:\\");
		if(dir.isDirectory()){
			String[] names = dir.list();//列出指定目录下的当前文件夹和文件的名称，包含隐藏文件
			for(String name:names){
				System.out.println(name);
			}
		}
		
 	}
}

class FilterBySufix implements FilenameFilter{
	private String suffix;
	public FilterBySufix(String suffix) {
		this.suffix=suffix;
	}
	
	@Override
	public boolean accept(File dir, String name) {
		return name.endsWith(suffix);
	}
	
}
