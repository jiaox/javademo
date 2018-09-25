package com.jiaox.cn;

import java.util.Date;
import java.util.Properties;

public class Property {
	public static void main(String[] args) {
		System.out.println(new Date());
		Properties p = System.getProperties();
		p.list(System.out);
		System.out.println("---Memory Usage;");
		Runtime rt =Runtime.getRuntime();
		System.out.println("Total Memory = "+rt.totalMemory()+" Free Memory ="+rt.freeMemory());
		
		try {
			Thread.currentThread().sleep(5*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
