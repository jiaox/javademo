package com.jiaox.io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 复制图片
 * @author Administrator
 *
 */
public class CopyPic {
	public static void main(String[] args) throws IOException {
		copyPic_4();
	}
	
	/**
	 * 合适的用法
	 * @throws IOException
	 */
	public static void copyPic() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\filedemo\\123.bmp");
		FileOutputStream fos=new FileOutputStream("D:\\filedemo\\2.bmp");
		byte[] buf=new byte[1024];
		int len=0;
		while((len=fis.read(buf))!=-1){
			fos.write(buf,0,len);
		}
		fos.close();
		fis.close();
		
	}
	
	/**
	 * 看上去这种方式不用循环，很爽，但是要注意，数据体积小，可以这么做，但是数据体积大，比如DVD，2G多大小，那就意味着一次要开辟2G空间，就会内存溢出
	 * 所以还是建议使用1024的整数倍作为缓冲区。
	 * @throws IOException
	 */
	public static void copyPic_2() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\filedemo\\123.bmp");
		int num=fis.available();
		System.out.println(num);
		FileOutputStream fos=new FileOutputStream("D:\\filedemo\\2.bmp");
		byte[] buf=new byte[num];//定义一个刚刚好的缓冲区
		fis.read(buf);
		fos.write(buf);
		fos.close();
		fis.close();
	}
	
	/**
	 * 同样合适的用法
	 * 我们也可以用字节流自己的缓冲区
	 * BufferedInputStream
	 * BufferedOutputStream
	 * 
	 * 缓冲区本身不调用底层资源，而是流操作底层资源，缓冲区只有接收流的时候才具有作用，底层就是一个数组。
	 * 
	 * @throws IOException 
	 * 
	 */
	public static void copyPic_3() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\filedemo\\123.bmp");
		BufferedInputStream bufis=new BufferedInputStream(fis);
		FileOutputStream fos=new FileOutputStream("D:\\filedemo\\3.bmp");
		BufferedOutputStream bufos=new BufferedOutputStream(fos);
		int ch=0;
		//从一个缓冲区写入另一个缓冲区
		while((ch=bufis.read())!=-1){
			bufos.write(ch);
		}
		bufos.close();
		bufis.close();
	}
	
	/**
	 * 读一个就写一个，效率低
	 * @throws IOException
	 */
	public static void copyPic_4() throws IOException{
		FileInputStream fis=new FileInputStream("D:\\filedemo\\123.bmp");
		FileOutputStream fos=new FileOutputStream("D:\\filedemo\\4.bmp");
		int ch=0;
		while((ch=fis.read())!=-1){
			fos.write(ch);
		}
		fos.close();
		fis.close();
	}
	
	
	
}
