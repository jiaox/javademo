package com.jiaox.nio;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;

public class FileUtilsTest {
	public static void main(String[] args) throws IOException {
		test();
	}
    public static void test() throws IOException{
    	File srcFile =new File("E:\\nio\\hello.txt");
    	File destFile = new File("E:\\nio\\hello2.txt");
    	FileUtils.copyFile(srcFile, destFile);
    }
}
