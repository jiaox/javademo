package com.jiaox.java8.demo;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.function.Consumer;

import org.junit.Test;

/**
 * 一、Lambda表达式的基本语法
 * 1. 格式   Lambda形参列表 -> Lambda体
 * 2. 说明 ：   ->:lambda 操作符 或箭头操作符
 * 		    ->左边：lambda 形参列表
 * 			->右边：Lambda表达式执行语句，称为Lambda体
 * 3. 如何使用：分6种情况			
 * @author Administrator
 *
 */
public class LambdaTest {
	//情况6：如果只有一条执行语句，可以省略{}
	//特别的 如果此唯一语句是return语句，则除了省略{}外，也省略return关键字。
	public void test7(){
		Comparator<Integer> com2 = (o1,o2)->o1.compareTo(o2);
		com2.compare(33, 12);
	}
	
	
	
	//情况5：形参列表有两个或两个以上变量，Lambda体有多条执行语句，甚至有返回值
	@Test
	public void test6(){
		Comparator<Integer> com1 = new Comparator<Integer>() {
			@Override
			public int compare(Integer o1, Integer o2) {
				System.out.println(o1);
				System.out.println(o2);
				return o1.compareTo(o2);
			}
		};
		
		com1.compare(12, 34);
		
		System.out.println("***************");
		Comparator<Integer> com2 = (o1,o2)->{
			System.out.println(o1);
			System.out.println(o2);
			return o1.compareTo(o2);
		};
		com2.compare(33, 12);
		
	}
	
	//情况4：针对情况3进行迭代
	//如果Lambda表达式的形参列表只有一个变量，则可以省略一对()
	@Test
	public void test5(){
		Consumer<String> con1= s->{
			System.out.println(s);
		};
		con1.accept("你管的着么");
	}
	
	
	//以前出现的类型推断情况
	@Test
	public void test4(){
		//举例1
		int[] arr = new int[]{
				1,2,3,4
		};
		//类型推断
		int[] arr2 ={1,2,3,4};
		//下边不行
		/*int[] arr3;
		arr3={1,2,3,4};*/
		
		//举例2
		List<String> list = new ArrayList<String>();
		//类型推断
		List<String> list2 = new ArrayList<>();
		
		//举例3
		method(new HashMap<>());
		
	}
	
	
	public void method(HashMap<String,String> map){
		
	}
	
	
	//情况三：针对情况二进行迭代。Lambda形参列表的变量数据类型可以省略
	//说明：java编译器可以根据上下文推断出变量的数据类型，故可以省略：类型推断。
	@Test
	public void test3(){
		Consumer<String> con1=(s)->{
			System.out.println(s);
		};
		con1.accept("你管的着么");
	}
	
	
	
	//情况二：形参列表有一个参数，无返回值
	@Test
	public void test2(){
		Consumer<String> con = new Consumer<String>(){
			@Override
			public void accept(String t) {
				System.out.println(t);
			}
			
		};
		
		con.accept("你不是真正的快乐！！");
		System.out.println("****************************");
		
		Consumer<String> con1=(String s)->{
			System.out.println(s);
		};
		con1.accept("你管的着么");
		
	}
	//情况一：无形参，无返回值
	@Test
	public void test1(){
		Runnable r = new Runnable(){
			public void run(){
				System.out.println("新年快乐！！！");
			}
		};
		
		Thread t = new Thread(r);
		t.start();
		System.out.println("****************************");
		Runnable r1 = ()->{
			System.out.println("快乐毛线！！！");
		};
		
		Thread t2 = new Thread(r1);
		t2.start();
		
	}
}
