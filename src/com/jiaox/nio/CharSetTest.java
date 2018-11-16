package com.jiaox.nio;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.CharBuffer;
import java.nio.charset.Charset;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.SortedMap;
import org.junit.Test;
/**
 * Charset:字符集
 * 1. 如何实例化:Charset.forname(String charset)
 * 2. 如何得到编码器和解码器: 
 * 
 * 
 * @author Administrator
 *
 */
public class CharSetTest {
	/**
	 * 遍历Charset里包含的字符集
	 */
	@Test
	public void test(){
		SortedMap<String, Charset> charsets = Charset.availableCharsets();
		Set<Entry<String,Charset>> entrySet = charsets.entrySet();
		Iterator<Entry<String, Charset>> iterator = entrySet.iterator();
		while(iterator.hasNext()){
			Entry<String, Charset> entry = iterator.next();
			System.out.println(entry.getKey()+":"+entry.getValue());
		}
	}
	@Test
	public void test2() throws IOException{
		//实例化
//		Charset charset = Charset.forName("gbk");
		Charset charset = Charset.forName("utf-8");
		//得到编码器和解码器
		CharsetEncoder encoder =charset.newEncoder();
		CharsetDecoder decoder = charset.newDecoder();
		CharBuffer charBuffer =CharBuffer.allocate(1024);
		charBuffer.put("保持微笑");
		charBuffer.flip();
		ByteBuffer byteBuffer = encoder.encode(charBuffer);
//		byte[] array =byteBuffer.array();
		for (int i = 0; i < byteBuffer.limit(); i++) {
//			System.out.println(array[i]);
			System.out.println(byteBuffer.get());
		}
		byteBuffer.flip();
		CharBuffer charBuffer2 = decoder.decode(byteBuffer);
		System.out.println(new String(charBuffer2.array(),0,charBuffer2.limit()));
		System.out.println("*********");
	}
}
