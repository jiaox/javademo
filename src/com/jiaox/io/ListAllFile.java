package com.jiaox.io;

import java.io.File;

/**
 * 想要列出指定目录下的所有文件夹，包含字文件夹中的文件
 * @author Administrator
 *
 */
public class ListAllFile {
	public static void main(String[] args) {
		File dir=new File("D:\\h2-2018-03-18\\h2");
		listAll(dir,0);
	}
	public static void listAll(File dir,int level){
		File[] files=dir.listFiles();
		System.out.println(getSpace(level)+dir.getName());
		level++;
		for(int i=0;i<files.length;i++){
			if(files[i].isDirectory()){
				listAll(files[i],level);
			}else{
				System.out.println(getSpace(level)+files[i].getName());
			}
			
		}
	}
	
	public static String getSpace(int level){
		StringBuilder sb=new StringBuilder();
		sb.append("|--");
		for(int x=0;x<level;x++){
			sb.insert(0, "|  ");
		}
		return sb.toString();
	}
}
