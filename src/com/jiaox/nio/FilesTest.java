package com.jiaox.nio;

import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.nio.file.StandardOpenOption;
import java.util.Iterator;

import com.sun.javafx.geom.Path2D;

/**
 * Files工具类使用：操作文件或目录
 * @author Administrator
 *
 */
public class FilesTest {
	public static void main(String[] args) throws IOException {
		test2();
	}
	
	public static void method() throws IOException{
//		Path path1=Paths.get("E:\\nio", "hello.txt");
//		Path path2 = Paths.get("E:\\jiaox.txt");
		//要想复制成功，path1的物理文件必须存在，path2对应文件没要求
//		Files.copy(path1, path2,StandardCopyOption.REPLACE_EXISTING);
		
		//要执行成功，要求path3对应的文件目录必须不存在，一旦存在，则抛异常。
//		Path path3=Paths.get("E:\\nio\\nio1");
//		Files.createDirectories(path3);
		
		//要执行成功，要求path4对应的物理文件必须不存在，否则抛异常。
//		Path path4 = Paths.get("E:\\nio\\hi.txt");
//		Files.createFile(path4);
		//要执行成功，要求path4对应的物理文件必须存在，否则抛异常。
//		Files.delete(path4);
		
		//如果存在执行删除，否则不删除。
//		Files.deleteIfExists(path3);
		
		//只能同磁盘移动
//		Files.move(path1, path2, StandardCopyOption.ATOMIC_MOVE);
		
		//要求文件必须存在
		System.out.println(Files.size(Paths.get("E:\\", "jiaox.txt")));
		
	}
	
	
	public static void test2() throws IOException{
		//判断文件是否存在
		System.out.println(Files.exists(Paths.get("E:\\nio\\", "hello.txt"), LinkOption.NOFOLLOW_LINKS));
		System.out.println(Files.exists(Paths.get("E:\\jiaox.txt"), LinkOption.NOFOLLOW_LINKS));
		//不要求要求文件是否存在
		System.out.println(Files.isDirectory(Paths.get("E:\\nio", "hello.txt"),LinkOption.NOFOLLOW_LINKS));
		//要求文件存在，才能判断
		System.out.println(Files.isHidden(Paths.get("E:\\nio", "hello.txt")));
	}
	
	/**
	 * StandardOpenOption.READ 对应channel是可读的
	 * StandardOpenOption.WRITE 对应channel是可写
	 * StandardOpenOption.CREATE 写出的文件如果不存在，则创建，如果存在则忽略
	 * StandardOpenOption.CREATE_NEW 写出的文件如果不存在，则创建，如果存在则抛异常
	 * @throws IOException
	 */
	public static void test3() throws IOException{
		//
		Path path = Paths.get("E:\\nio\\", "hello.txt");
		Files.newByteChannel(path, StandardOpenOption.READ,StandardOpenOption.WRITE,StandardOpenOption.CREATE_NEW);
		
		//
		Path path2 = Paths.get("E:\\nio");
		DirectoryStream<Path> directoryStream = Files.newDirectoryStream(path2);
		Iterator<Path> iterator = directoryStream.iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}
		
		//获取InputStream 对象
		Files.newInputStream(path, StandardOpenOption.READ);
		
		//获取OutputStream 对象
		Files.newOutputStream(path, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
	}
	
	
}
