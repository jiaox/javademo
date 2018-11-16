package com.jiaox.nio;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.Pipe;
import org.junit.Test;
/**
 * 测试管道
 * @author Administrator
 *
 */
public class PipeTest {
	@Test
	public void test1() throws IOException{
		//获取管道
		Pipe pipe = Pipe.open();
		//将缓冲区数据写入管道
		ByteBuffer buffer = ByteBuffer.allocate(1024);
		//线程1
		Pipe.SinkChannel sinkChannel =pipe.sink();
		buffer.put("通过单项管道发送数据".getBytes());
		buffer.flip();
		sinkChannel.write(buffer);
		//线程2
		//读取缓冲区的数据
		Pipe.SourceChannel sourceChannel = pipe.source();
		buffer.flip();
		int len = sourceChannel.read(buffer);
		System.out.println(new String(buffer.array(),0,len));
		sourceChannel.close();
		sinkChannel.close();
	}
}
