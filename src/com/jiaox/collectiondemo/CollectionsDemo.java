package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * 演示：集合框架的工具类Collections
 * 注意：工具类的方法都是静态的。
 * 
 * 需求：有很多元素，不需要保证唯一性，应该使用List，但是需要有指定的顺序，这时就没有具体容器可以实现，这时就要想到集合框架的工具类。
 * 
 * 
 * @author Administrator
 *
 */
public class CollectionsDemo {
	public static void main(String[] args) {
		method_2();
	}
	
	//获取集合中的最值
	public static void method_2(){
		List<String> list =new ArrayList<String>();
		list.add("list8zz");
		list.add("list1aaaa");
		list.add("list4a");
		list.add("list2qq");
		list.add("list6yio");
		list.add("list1aaaa");
		list.add("list8i");
		//获取list最大值
//		String max=Collections.max(list);
		//获取长度最长的值
		String max =Collections.max(list, new ComparatorByStringLen());
		System.out.println(max);
	}
	
	public static void method_1(){
		List<String> list =new ArrayList<String>();
		list.add("list8zz");
		list.add("list1aaaa");
		list.add("list4a");
		list.add("list2qq");
		list.add("list6yio");
		list.add("list1aaaa");
		list.add("list8i");
		System.out.println(list);
		//按照字符串的自然顺序对list集合中的元素进行排序
//		Collections.sort(list);
		//希望按照字符串的长度排序
		Collections.sort(list, new ComparatorByStringLen());
		
		System.out.println(list);
	}
	
	
	
}
//自定义比较器，对字符串长度进行排序
class ComparatorByStringLen implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		int temp=s1.length()-s2.length();
		return temp==0?s1.compareTo(s2):temp;
	}
	
}