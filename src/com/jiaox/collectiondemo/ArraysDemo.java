package com.jiaox.collectiondemo;

import java.util.Arrays;
import java.util.List;

/**
 * 操作数组的工具类
 * 
 * @author Administrator
 *
 */
public class ArraysDemo {
	public static void main(String[] args) {
//		int[] arr = {3,5,4,1,7};
//		System.out.println(Arrays.toString(arr));
		
		//Arrays中有一个方法可以将数组变成集合
		String [] arr={"aba","kkk","aha"};
		
		List<String> list= Arrays.asList(arr);
		System.out.println(list);
		
		int[] nums={3,5,4,1,7};
		List<int[]> list2=Arrays.asList(nums);
		System.out.println(list2);//[[I@1db9742]
		/**
		 * 当数组中的元素，都是对象时，变成集合是将数组元素存储到集合中
		 * 当数组中的元素，是基本数据类型时，会将数组本身这个对象作为集合中的元素
		 */
		/**
		 * 为什么要将数组变成集合呢
		 * 因为数组对象只有一个属性，length，他没有操作元素的方法
		 * 所以数组编程集合
		 */
		
	}
}
