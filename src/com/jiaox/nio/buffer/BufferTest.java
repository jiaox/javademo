package com.jiaox.nio.buffer;

import java.nio.ByteBuffer;
import java.nio.CharBuffer;

import org.junit.Test;

/**
 * 一、nio中两个重要的要素：缓冲区（buffer） ，通道（channel）
 * buffer：存储数据的 --》 byte [] buffer = new byte[1024]
 * channel：代表数据源与目标节点之间的连接，负责缓冲区的传输 --》IO流
 * 二者的交互：
 * java NIO中的buffer主要用于与nio通道（channel）交互， 数据中是从通道读入缓冲区，从缓冲区写入通道。
 * 
 * 二、缓冲区使用
 * 
 * java.nio.Buffer 抽象类
 *     |---ByteBuffer
 *     |---CharBuffer
 *     
 *     |---ShortBuffer
 *     |---IntBuffer
 *     |---LongBuffer
 *     |---FloatBuffer
 *     |---DoubleBuffer
 *     
 *     
 * 三、如何实例化缓冲区
 * 调用 ：allocate(int capacity)
 * 举例：ByteBuffer byteBuffer = ByteBuffer.allocate(10);
 * 类似  ArrayList list =new ArrayList(10); 
 * 方法的形参决定底层创建的数组的长度。
 * 
 * 四、Buffer中常用属性。
 * capacity:容量。决定了底层数组的长度，表明了最大存储数据的容量
 * limit:限制 。默认情况下，limit等于capacity。在读数据模式下，limit小于等于capacity。它表明最大的可以读取的数据的量。
 * position:位置。 表明当前读取或写入数据的位置。
 * mark:标记。默认为-1
 * 
 * 关系： mark<=position<=limit<=catacity
 * 
 * 
 * 五、针对于ByteBuffer，可以创建直接缓冲区（allocateDirect()/FileChannel 的map方法）和非直接缓冲区（allocate()）
 * 
 * @author Administrator
 *
 */
public class BufferTest {
	ByteBuffer byteBuffer = ByteBuffer.allocate(10);
	CharBuffer charBuffer = CharBuffer.allocate(10);
	@Test
	public void test(){
		ByteBuffer byteBuffer = ByteBuffer.allocate(10);//非直接缓冲区
		byteBuffer.put("hello".getBytes());
		byte[] array = byteBuffer.array();
		System.out.println(array.length);
		for(int i =0;i<array.length;i++){
			System.out.println(array[i]);
		}
		//判断此时字节缓冲区是否为直接缓冲区
		System.out.println(byteBuffer.isDirect());
	}
}
