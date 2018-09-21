package com.jiaox.runtime;

/**
 * 使用Runtime 运行进程
 * @author jiaox
 *
 */
public class RunTimeDemo {
	public static void main(String[] args) {
		Runtime run = Runtime.getRuntime();
		try {
			run.exec("notepad.exe");
		} catch (Exception e) {
			e.printStackTrace();

		}
	}
}
