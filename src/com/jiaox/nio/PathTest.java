package com.jiaox.nio;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * 1. jdk7.0时，引入了Path、Paths、Files三个类
 * 2. 此三个类声明在：java.nio.file包下
 * 3. Path可以看做是 java.io.File的升级版本。也可以表示文件，或文件目录。
 * 4. 如何实例化Path：使用Paths
 * 		-public static Path get(String first, String... more)
 * 		-public static Path get(URI uri) 
 * @author Administrator
 *
 */
public class PathTest {
	public static void main(String[] args) {
		test2();
	}
	public static void test2(){
		Path path = Paths.get("E:\\","nio\\nio1\\nio2\\hello.txt");//很灵活
		Path path2 = Paths.get("hello.txt");
		System.out.println(path);
		System.out.println(path.startsWith("E:\\nio"));//是否以指定路径开始
		System.out.println(path.endsWith("hello.txt"));//是否以指定路径开始
		
		System.out.println(path.isAbsolute());
		System.out.println(path2.isAbsolute());
		
		System.out.println(path.getParent());
		System.out.println(path2.getParent());
		
		System.out.println(path.getRoot());
		System.out.println(path2.getRoot());
		
		System.out.println(path.getFileName());
		System.out.println(path2.getFileName());
		
		for(int i=0;i<path.getNameCount();i++){
			System.out.println(path.getName(i)+"******");
		}
		
		//作为绝对路径返回
		System.out.println(path.toAbsolutePath());
		System.out.println(path2.toAbsolutePath());
		
		//合并连个路径
		Path path3 = Paths.get("E:\\", "nio");
		Path path4 = Paths.get("nioo\\hi.txt");
		Path path5 = path3.resolve(path4);
		System.out.println(path5);
		
		//转化成file
		File file = path.toFile();
		
		//file 转path
		Path path6 = file.toPath();
		
	}
	//使用Paths 实例化Path
	public static void test1(){
		Path path = Paths.get("E:\\nio\\hello.txt");
		Path path2 = Paths.get("E:\\","nio\\hello2.txt");//很灵活
		System.out.println(path);
		System.out.println(path2);
		Path path3 = Paths.get("E:\\nio\\", "nio2");//目录
	}
}
