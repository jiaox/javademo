package com.jiaox.file;

import java.io.File;

public class FileDemo {
	public static void main(String[] args) {
		File f=new File("d:\\1.txt");
		if(f.exists()){
			f.delete();
		}else{
			try {
				f.createNewFile();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			//取文件名。
			System.out.println("文件名："+f.getName());
			//获取文件路径
			System.out.println("文件路径："+f.getPath());
			//取绝对路径
			System.out.println("绝对路径："+f.getAbsolutePath());
			//父文件夹
			System.out.println("父文件夹："+f.getParent());
			//判断文件是否存在
			System.out.println(f.exists()?"文件存在 ":"文件不存在");
			//判断文件是否可写
			System.out.println(f.canWrite()?"文件可写":"文件不可写");
			//判断文件是否可读
			System.out.println(f.canRead()?"文件可读":"文件不可读");
			//判断是否是文件
			System.out.println(f.isFile()?"是文件":"不是文件");
			//是否是绝对路径名称
			System.out.println(f.isAbsolute()?"是绝对路径":"不是绝对路径");
			//文件最后修改时间
			System.out.println("文件最后修改时间："+f.lastModified());
			//文件大小
			System.out.println("文件大小："+f.length()+" Bytes");
		}
		
		
	}
}
