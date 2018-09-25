package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;

/**
 * jdk1.5新特性
 * 导入类中的静态成员，也是简化书写
 * 
 * @author Administrator
 *
 */

import static java.util.Collections.*;//将java.util.Collections类中的静态成员都导入
/**
 * 两个包中有相同类名时，需要通过包名区分
 * 如果两个类中有相同的静态成员时，也要加上类名调用以示区分。
 * @author Administrator
 *
 */
public class StaticImportDemo {
	
	public static void main(String[] args) {
		ArrayList<String> al=new ArrayList<String>();
		al.add("abc1");
		al.add("abc7");
		al.add("abc2");
		al.add("abc0");
//		System.out.println("max="+Collections.max(al));
//		System.out.println("min="+Collections.min(al));
		
		System.out.println("max="+max(al));
		System.out.println("min="+min(al));
		
		
	}
}
