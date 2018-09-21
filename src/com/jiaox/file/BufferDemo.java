package com.jiaox.file;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferDemo {
	public static void main(String[] args) {
		BufferedReader buf =null;
		buf =new BufferedReader(new InputStreamReader(System.in));
		String str = null;
		while(true){
			System.out.println("请输入数字：");
			try {
				str= buf.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			int i = -1;
			try {
				i = Integer.parseInt(str);
				i++;
				System.out.println("输入的数字修改后为："+i);
				break;
			} catch (Exception e) {
				System.out.println("输入的内容不正确，请重新输入！");
			}
		}
	}
}
