package com.jiaox.io;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Properties;
/**
 * 文件切割
 * 原理：一个读取流，对应多个输出流
 * @author Administrator
 *
 */
public class FileSplitDemo {
	public static void main(String[] args) throws IOException {
//		File file = new File("E:\\0.png");
//		filesplit(file);
		File dir = new File("E:\\parts");
		merge(dir);
	}
	public static void merge(File dir) throws IOException{
		File[] files =dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".properties");
			}
		});
		if(files.length!=1){
			throw new RuntimeException("缺少扩展名为.properties 的文件");
		}
		Properties prop = new Properties();
		FileInputStream fis = new FileInputStream(files[0]);
		prop.load(fis);
		String filename = prop.getProperty("filename");
		int count = Integer.parseInt(prop.getProperty("filecount"));
//		System.out.println(files[0]);
		File[] partFiles =dir.listFiles(new FileFilter() {
			@Override
			public boolean accept(File file) {
				return file.getName().endsWith(".part");
			}
		});
		if(partFiles.length!=(count-1))
			throw new RuntimeException("缺少碎片文件");
		//因为Vector效率低，所以用ArrayList 替代
	/*	Vector<FileInputStream> v = new Vector<FileInputStream>();
		for(int x=0;x<count;x++){
			File file = new File(dir,x+".part");
			if(!file.exists()){
				throw new RuntimeException("缺少碎片文件:"+file.getName());
			}
			v.add(new FileInputStream(file));
		}
    	Enumeration<FileInputStream> en = v.elements();*/
		ArrayList<FileInputStream> al=new ArrayList<FileInputStream>();
		for(int i=0;i<count;i++){
			File file =new File(dir,i+".part");
			al.add(new FileInputStream(file));
		}
		//ArrayList 不具备 Enumeration对象。但是我们知道枚举和迭代是功能重复的，是可以替代的，所以获取ArrayList的迭代器，通过迭代器获取枚举的实现。
		final Iterator<FileInputStream> it =al.iterator();
		Enumeration<FileInputStream> en = new Enumeration<FileInputStream>() {
			@Override
			public boolean hasMoreElements() {
				// TODO Auto-generated method stub
				return it.hasNext();
			}
			@Override
			public FileInputStream nextElement() {
				// TODO Auto-generated method stub
				return it.next();
			}
		};
		//将多个流对象合并成一个流对象，多个源变成一个源
		SequenceInputStream sis = new SequenceInputStream(en);
		//定义一个目的
		FileOutputStream fos = new FileOutputStream(new File(dir,filename));
		byte[] buf = new byte[1024];
		int len = 0;
		while((len=sis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		sis.close();
		fis.close();
	}
	public static void filesplit(File file) throws IOException{
		FileInputStream fis = new FileInputStream(file);
		FileOutputStream fos=null;
		byte [] buf = new byte[1024*1024];//按1M大小切割
		int len=0;
		int count =0;
		File dir=new File("E:\\parts");
		if(!dir.exists()){
			dir.mkdir();
		}
		while((len=fis.read(buf))!=-1){
			fos = new FileOutputStream(new File(dir, (count++)+".part"));
			fos.write(buf, 0, len);
			fos.close();
		}
		//需要将切割后的碎片文件个数和被切割的源文件的名称存储到配置文件中，这样对应获取到了配置文件和碎片后，才可进行合并。
		Properties prop = new Properties();
		prop .setProperty("filecount", count+"");
		prop.setProperty("filename", file.getName());
		fos=new FileOutputStream(new File(dir, "config.properties"));
		prop.store(fos, "");
		fos.close();
		fis.close();
	}
}
