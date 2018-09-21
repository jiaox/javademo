package com.jiaox.system;

import java.util.Enumeration;
import java.util.Properties;

/**
 * 输出当前虚拟机的所有环境属性的变量和值
 * @author jiaox
 *
 */
public class SystemInfo {
	public static void main(String[] args) {
		Properties sp = System.getProperties();
		Enumeration e = sp.propertyNames();
		
		while(e.hasMoreElements()){
			String key=(String) e.nextElement();
			System.out.println(key+" = "+sp.getProperty(key));
		}
	}
}
