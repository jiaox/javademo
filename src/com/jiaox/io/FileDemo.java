package com.jiaox.io;

import java.io.File;


/**
 * File类的常见功能
 * 1.获取
 * 	 获取文件名
 * 	 获取文件路径
 * 
 * 2.文件的创建，删除
 * 	
 * 	
 * 3.判断
 * 	是否是文件
 * 	是否是目录
 * 	是否存在
 * 
 * 4.重命名
 *  renameTo
 * 
 * @author Administrator
 *
 */
public class FileDemo {
	public static void main(String[] args) {
		method3();
	}
	
	
	
	public static void method3(){
		File f1=new File("E:\\test.txt");
		File f2=new File("E:\\test2.txt");
		f1.renameTo(f2);
		
	}
	
	public static void method2(){
//		File dir = new File("D:\\abc");//创建目录对象，但是还没有创建目录。
//		dir.mkdir();//创建目录
		
//		System.out.println("delete:"+dir.delete());//要删除文件，必须保证，文件夹中没有任何内容。
		File dir1= new File("D:\\abc\\def\\dfw\\sdfd\\ss");
		dir1.mkdirs();//创建多级目录
	}
	
	public static void method(){

		File f=new File("d:\\1.txt");//将1.txt封装成了对象，这个1.txt可以是存在的，也可以不存在。
		File f1=new File("d:\\","1.txt");
		File f2=new File("d:\\");
		File f3=new File("d:"+File.separator+"aa"+File.separator+"2.txt");//注意，不同的系统平台，对目录分割符是有区别的。所以用File.separator分割
		
		if(f.exists()){
			f.delete();
		}else{
			try {
				f.createNewFile();//会将指定的文件创建到指定目录下，如果该文件已经存在，则不创建
								//输出流：如果要操作的文件不存在，会先创建该文件，用于存储数据，如果操作的文件存在，会将该文件覆盖。
								//如果给输出流的构造函数传递一个Boolean参数true，会对该文件进行数据续写。
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
			System.out.println("父文件夹："+f.getParent());//如果封装的文件件没有父目录，则返回null
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
