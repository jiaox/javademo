package com.jiaox.io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FilePrint {
	public static void main(String[] args) {
		PrintWriter out = null;
		File f = new File("d:\\temp.txt");
		try {
			out = new PrintWriter(new FileWriter(f));
		} catch (IOException e) {
			e.printStackTrace();
		}
		out.print("Hello World1234!"+"\r\n");
		out.close();
	}
}
