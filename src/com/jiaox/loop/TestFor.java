package com.jiaox.loop;

import java.util.Collection;
import java.util.Iterator;

public class TestFor {
	public static void main(String[] args) {
		test2();
	}
	/**
	 * 传统方式
	 */
	public static void test1(){
		int[] integers={1,2,3,4};
		for(int i=0;i<integers.length;i++){
			int j =integers[i];
			System.out.println(i);
		}
	}
	
	/**
	 * 遍历Collection 对象
	 */
	public static void test2(){
		String[] strs={"A","B","C","D"};
		Collection stringList = java.util.Arrays.asList(strs);
		for(Iterator itr=stringList.iterator();itr.hasNext();){
			Object str = itr.next();
			System.out.println(str);
		}
	}
	
	/**
	 * 遍历数组的简单方式
	 */
	public static void test3(){
		int[] integers={1,2,3,4};
		for (int i:integers){
			System.out.println(i);
		}
	}
	
	/**
	 * 遍历集合的简单方式
	 */
	public static void test4(){
		String[] strs={"A","B","C","D"};
		Collection list = java.util.Arrays.asList(strs);
		for(Object str:list){
			System.out.println(str);
		}
	}
}
