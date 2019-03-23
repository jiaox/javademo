package com.jiaox.nio;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import org.junit.Test;
/**
 * 一、 java.nio.channels.Channel接口
 * 	Channel:不负责数据存储，数据存储在buffer中，Channel负责buffer的传输。
 * 
 * 二、
 * java.nio.channels.Channel
 * 				|---FileChannel:本地文件
 * 
 * 				|---SocketChannel:TCP网络编程的客户端的Channel
 * 				|---ServerSocketChannel：TCP网络编程的服务端的Channel
 * 				|---DatagramChannel：UDP网络编程中两端的发送端和接收端的Channel
 * 
 * 				|---Pipe.SinkChannel:
 * 				|---Pipe.SourceChannel
 * 
 * 三、
 * 实例化channel
 *     方式一、对支持通道的对象使用getChannel
 *     方式二、通过XXXChannel的静态方法open获取
 *     方式三、使用Files的工具类的静态方法newByteChannel()获取字节通道
 *     
 *     Channel可以是单向的，也可以是双向的。
 * 		方式二和方式三在jdk7.0以后集成
 * 
 * 四、Channel常用方法
 * 		read(ByteBuffer buffer) / write(ByteBuffer buffer)
 * 		
 * 		
 * 
 * @author Administrator
 *
 */
public class ChannelTest {
	/**
	 * 使用Channel实例化的方式一，实现文件的复制操作。
	 * @throws IOException 
	 */
	@Test
	public void test1() throws IOException{
		FileInputStream fis=new FileInputStream("E:\\0.png");
		FileOutputStream fos = new FileOutputStream("E:\\1.png");
		//实例化channel
		FileChannel in = fis.getChannel();
		FileChannel out = fos.getChannel();
		//提供ByteBuffer
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		while(in.read(buffer)!=-1){
			buffer.flip();//修改为读数据模式
			out.write(buffer);
			buffer.clear();//清空
		}
		out.close();
		in.close();
		fis.close();
		fos.close();
	}
	/**
	 * 使用channel方式2，直接缓冲区
	 * @throws IOException
	 */
	@Test
	public void test2() throws IOException{
		//实例化channel
		FileChannel inChannel = FileChannel.open(Paths.get("E:\\0.png"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("E:\\2.png"), StandardOpenOption.READ, StandardOpenOption.WRITE,StandardOpenOption.CREATE);
		//得到直接缓冲区
		MappedByteBuffer inMappedByteBuffer = inChannel.map(MapMode.READ_ONLY, 0, inChannel.size());
		MappedByteBuffer outMappedByteBuffer = outChannel.map(MapMode.READ_WRITE, 0, outChannel.size());
		byte[] buffer = new byte[inMappedByteBuffer.limit()];
		inMappedByteBuffer.get(buffer);
		outMappedByteBuffer.put(buffer);
		inChannel.close();
		outChannel.close();
	}
	/**
	 * 利用transferTo 或 transferFrom复制文件
	 * @throws IOException
	 */
	@Test 
	public void test3() throws IOException {
		FileChannel inChannel = FileChannel.open(Paths.get("E:\\0.png"), StandardOpenOption.READ);
		FileChannel outChannel = FileChannel.open(Paths.get("E:\\4.png"), StandardOpenOption.WRITE,StandardOpenOption.CREATE);
		//transferTo() :将可读数据转到可写数据
//		inChannel.transferTo(0, inChannel.size(),outChannel );
		//transferFrom() :将可读数据转到可写数据
		outChannel.transferFrom(inChannel, 0, inChannel.size());
		inChannel.close();
		outChannel.close();
	}
	@Test
	public void test4() throws IOException{
		RandomAccessFile readRaf = new RandomAccessFile("E:\\test0.txt", "r");
		RandomAccessFile writeRaf = new RandomAccessFile("E:\\test1.txt", "rw");
		//实例化channel
		FileChannel inChannel = readRaf.getChannel();
		FileChannel outChannel = writeRaf.getChannel();
		ByteBuffer buffer1 = ByteBuffer.allocate(1024);
		ByteBuffer buffer2 = ByteBuffer.allocate(2048);
		ByteBuffer buffer3 = ByteBuffer.allocate(1024);
		ByteBuffer[] dsts ={buffer1,buffer2,buffer3};
		//分散读取
		inChannel.read(dsts);
		//改为可读模式
		buffer1.flip();
		buffer2.flip();
		buffer3.flip();
		System.out.println(new String (buffer1.array(),0,buffer1.limit()));
		System.out.println();
		System.out.println(new String (buffer2.array(),0,buffer2.limit()));
		System.out.println();
		System.out.println(new String (buffer3.array(),0,buffer3.limit()));
		//聚集写入
		outChannel.write(dsts);
		inChannel.close();
		outChannel.close();
		readRaf.close();
		writeRaf.close();
	}
}
