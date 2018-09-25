package com.jiaox.collectiondemo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * JDK1.5以后出现的Collection的父接口Iterable
 * 该接口的出现，封装了iterator方法，并提供了新的语句foreach语句
 * 也就是增强型的for循环
 * 
 * 格式
 * for(元素类型  变量名: Collection集合|数组){
 * 
 * }
 * 
 * 增强for循环和传统for循环的区别
 * 增强for循环有一个特点：必须要有被遍历的目标，这个目标只能是Collection集合或者数组
 * 传统for循环可以定义三种表达式来丰富循环操作
 * 尤其是可以定义控制循环的增量
 * 所以在遍历数组时，如果仅为遍历获取，两个for循环都可以
 * 如果需要对数组元素进行操作，需要用到指针，所以建议还是使用传统for循环。
 * 
 * @author Administrator
 *
 */
public class ForeachDemo {
	public static void main(String[] args) {
		method4();
	}
	
	
	public static void method4(){
		int[] arr ={4,5,1,7,5};
		
		for (int i:arr){
			System.out.println("i="+i);
		}
		
	}
	
	public static void method3(){
		//增强for循环不可以遍历Map集合，因为Map不支持迭代器
		//想要使用，只有将map集合转成Set之后才可以使用
		Map<Integer, String> map=new HashMap<Integer, String>();
		map.put(1, "haha");
		map.put(2, "hehe");
		map.put(3, "heihei");
		
		for (Integer i:map.keySet()){
			System.out.println(i+"....."+map.get(i));
		}
		
//		Set<Map.Entry<Integer, String>> entrySet=map.entrySet();
//		for(Map.Entry<Integer, String> me:entrySet){
//			Integer key=me.getKey();
//			String value=me.getValue();
//			System.out.println(key+"....."+value);
//		}
	}
	
	public static void method2(){
		//有了增强for循环，就可以简化迭代器的书写
		//但是迭代器可以在迭代过程中对集合的元素进行一些常见的操作
		//如果仅为遍历集合中的元素，可以简化成增强for循环。
		//
		HashSet<String> hs=new HashSet<String>();
		hs.add("abcd");
		hs.add("kkk");
		hs.add("qq");
		
		for(String s:hs){
			System.out.println(s);
		}
	}
	
	
	public static void method(){

		ArrayList<String> al=new ArrayList<String>();
		al.add("abc1");
		al.add("abc2");
		al.add("abc3");
		al.add("abc4");
		//高级for循环。
		for(String s:al){//对al进行遍历，用s来记录遍历到的每个元素
			System.out.println("each:"+s);
		}
		
		
		System.out.println("----------------");
		Iterator<String> it=al.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("----------------");
		//只有数组和list可以用下面这种for循环，因为有角标
		for(int x=0;x<al.size();x++){
			System.out.println("get:"+al.get(x));
		}
		
		
		
		
	
	}
}
