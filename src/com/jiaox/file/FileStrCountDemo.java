package com.jiaox.file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * 给定一个txt文件，如何得到某字符串出现的次数
 * @author jiaox
 *
 */
public class FileStrCountDemo {
	public static void main(String[] args) throws FileNotFoundException {
		File file = new File("E://test.txt");
		InputStream is = new FileInputStream(file);
		byte b[] = new byte[1024];
		int a;
		try {
			a = is.read(b);
			String str1=new String(b, 0, a);//不要用 new String(b); 否则生成的字符串后会出现一大长串的乱码
			System.out.println(str1);
			String str[] = str1.split("");
			int count = 0;

			for (int i = 0; i < str.length; i++) {
				if ("a".equals(str[i]))
					count++;
			}
			System.out.println(count);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
