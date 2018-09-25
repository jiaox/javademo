package com.jiaox.properties;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * 定义一个程序，用于记录程序运行的次数，
 * 如果运行次数满足5次，试用期已到，请注册
 * 
 * 我们就需要一个计数器，
 * 而且要将这个计数器的值持久化到硬盘上
 * 每次这个软件启动，都需要先读取这个配置文件，
 * 并取出这里的数值，进行自增厚，再重新存储回去
 * @author Administrator
 *
 */
public class PropertiesTest {
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		File file =new File("D:\\count.properties");
		if(!file.exists()){
			file.createNewFile();
		}
		
		FileInputStream fis= new FileInputStream(file);
		//加载流中的数据
		prop.load(fis);
		
		//获取count对应的值
		int count=0;
		String value =prop.getProperty("count");
		if(value!=null){
			count=Integer.parseInt(value);
			if(count>=5){
				System.out.println("您好，使用次数已到，给钱");
				return;
			}
		}
		count++;
		prop.setProperty("count", count+"");
		
		FileOutputStream fos = new FileOutputStream(file);
		prop.store(fos, "abc");
		
		fos.close();
		fis.close();
		
		
	}
}
