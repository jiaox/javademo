package com.jiaox.io;

import java.io.File;

import sun.net.www.content.audio.x_aiff;

/**
 * 删除一个指定的带内容的文件夹
 * 其实是从里往外删
 * @author Administrator
 *
 */
public class RemoveDirDemo {
	
	public static void main(String[] args) {
		File dir=new File("D:\\removeDemo");
		removeDir(dir);
	}
	public static void removeDir(File dir){
		File[] files=dir.listFiles();
		for(int x=0;x<files.length;x++){
			if(files[x].isDirectory()){
				removeDir(files[x]);
			}
			else {
				System.out.println(files[x]+"...."+files[x].delete());
			}
		}
		System.out.println(dir+"...."+dir.delete());
	}
}
