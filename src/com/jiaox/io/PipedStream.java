package com.jiaox.io;

import java.io.IOException;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;

/**
 * 管道流
 * @author Administrator
 *
 */


class Input implements Runnable{

	private PipedInputStream in;
	
	public Input(PipedInputStream in) {
		this.in=in;
	}
	
	@Override
	public void run() {
		try {
			byte[] buf=new byte[1024];
			int len = in.read(buf);//阻塞式方法
			String s = new String(buf,0,len);
			System.out.println("read:"+s);
			in.close();
		} catch (IOException e) {
			throw new RuntimeException("读取管道流失败");
		}
	}
	
}

class Output implements Runnable{
    private PipedOutputStream out;
    public Output(PipedOutputStream out) {
    	this.out=out;
	}
    
	@Override
	public void run() {
		try {
			System.out.println("-----------------");
			Thread.sleep(5000);
			out.write("我在写入".getBytes());
			out.close();
		} catch (IOException e) {
			new RuntimeException("写入失败");
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}

public class PipedStream {
	public static void main(String[] args) throws IOException {
		PipedInputStream pis = new PipedInputStream();
		PipedOutputStream pos = new PipedOutputStream();
		pis.connect(pos);
		new Thread(new Input(pis)).start();
		
		
		new Thread(new Output(pos)).start();
	}
}
