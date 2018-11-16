package com.jiaox.search;

import jdk.nashorn.internal.runtime.regexp.joni.SearchAlgorithm;

/**
 * 给定一个有序数组，如{1,2,3,4,5,6,7,8,9}，我们将对这个数组进行选择，位置旋转未知。下面给出一个可能的旋转结果。如{4,5,6,7,8,9,1,2,3}，我们可以理解为它从元素4位置开始旋转。之后给定一个指定的数字n，让我们从{4,5,6,7,8,9,1,2,3}这个数组中找出它的位置，要求时间复杂度尽可能的低。

---------------------

本文来自 阿阿阿黄 的CSDN 博客 ，全文地址请点击：https://blog.csdn.net/mblhq/article/details/79500515?utm_source=copy 
 * @author Administrator
 *
 */
public class XuanZhuanShuzuSearch {
	public static void main(String[] args) {
		int [] array = {4,5,6,7,8,9,1,2,3};
		System.out.println(searchArr(7,array));
	}

	private static int searchArr(int n, int[] array) {
		int low =0;
		int high =array.length-1;
		while(low<=high){
			int middle =(low+high)/2;
			if(array[middle]==n)
				return middle;
			if(array[middle]>array[low]){
				if(n<=array[middle]&&n>=array[low]){
					high = middle-1;
				}else{
					low=middle+1;
				}
			}else{
				if(n>=array[middle]&&n<=array[high]){
					low=middle+1;
				}else{
					high =middle -1;
				}
			}
		}
		return -1;
	}
	
	
}
