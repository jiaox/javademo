package com.jiaox.properties;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Properties;

/**
 * Properties:是map集合
 * 特点：
 * 	存储的键值对都是String类型
 * 	通常用于键值对形式的配置文件
 * 
 * count=30
 * age=30
 * 
 * 他的最大功能在于可以和IO技术相关联，可以存储从内存以外的设备上读取的数据
 * 并可以将集合中的数据存储到指定设备上，比如硬盘
 * 
 * 
 * @author Administrator
 *
 */
public class PropertiesDemo {
	public static void main(String[] args) throws IOException {
		method_3();
	}
	/**
	 * 先演示基本功能
	 * @throws FileNotFoundException 
	 */
	public  static void method_1() throws FileNotFoundException{
		Properties prop=new Properties();
		//存元素
		prop.setProperty("zhangsan", "20");
		prop.setProperty("zhangsan1", "25");
		/*Set<String> nameSet=prop.stringPropertyNames();
		for(String name:nameSet){
			System.out.println(name+":"+prop.getProperty(name));
		}*/
		
//		prop.list(System.out);
		prop.list(new PrintStream("D:\\text.txt"));
		
	}
	
	public static void method_2() throws FileNotFoundException{
		Properties prop=System.getProperties();//获取系统属性信息
		prop.list(new PrintStream("D:\\sys.txt"));
	}
	
	/**
	 * 如何将硬盘上的键值对加载到集合中呢？
	 * 获取硬盘必须明确源，而且该数据必须是文本数据，FileInputStream  FileReader
	 * 可以使用Properties对象的load方法，加载数据
	 * @throws IOException 
	 * 
	 * 
	 */
	public static void method_3() throws IOException {
		Properties prop=new Properties();
		File file =new File("D:\\user.txt");
		if(!file.exists()){
			System.out.println("要读取的文件不存在");
			return;
		}
		FileInputStream fis=new FileInputStream(file);
		//使用load方法，加载流中的数据
		prop.load(fis);
		
		prop.setProperty("wangwu", "3");
		//需要将被修改的数据重新存回配置文件中
		//既然要往硬盘存储数据，就需要用到输出流
		
		FileOutputStream fos=new FileOutputStream(file);
		prop.store(fos, "123");
		
//		prop.list(System.out);
		fis.close();
	}
	
	/**
	 * 模拟一下load方法
	 * 原理其实就是读取文件的一行数据，因为数据需要有规则，
	 * 是以key=value的形式存在的，所以读取一行数据后，
	 * 可以通过=对该数据进行切割，切割完，左边是key，
	 * 右边是值，存到properties集合
	 * @throws IOException 
	 */
	public static void myLoad() throws IOException{
		Properties prop = new Properties();
		File file =new File("D:\\user.txt");
		BufferedReader bufr=new BufferedReader(new FileReader(file));
		String line =null;
		while((line=bufr.readLine())!=null){
			String[] arr = line.split("=");
			prop.setProperty(arr[0], arr[1]);
		}
		prop.list(System.out);
		bufr.close();
	}
	
}
