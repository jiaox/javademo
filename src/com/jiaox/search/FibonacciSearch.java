package com.jiaox.search;

import java.util.Arrays;

/**
 * 斐波那契查找
 * @author jiaox
 *
 */
public class FibonacciSearch {
	
	/**
	 * 开始斐波那契查找
	 * @param array 数组
	 * @param a  关键字
	 * @return
	 */
	public static int fibonacciSearch(int[] array,int a){
		if(array==null||array.length==0){
			return -1;
		}else{
			int length=array.length;
			int[] fb=fibonacci(20);//制造一个长度为20的斐波那契数列
			int k =0;//斐波那契数列索引
			while (length>fb[k]-1) {//找出数组的长度在斐波那契数列（减1）中的位置，将决定切入点。
				k++;
			}
			
			int[] temp = Arrays.copyOf(array, fb[k]-1);//构造一个长度为fb[k]-1的新数组
			for (int i = length; i < temp.length; i++) {
				if(i>=length){
					temp[i] = array[length-1];
				}
			}
			
			int low = 0;
			int hight = array.length-1;
			while(low<=hight){
				int middle = low+fb[k-1]-1;
				if(temp[middle]>a){
					hight=middle-1;
					k=k-1;
				}else if(temp[middle]<a){
					low = middle +1;
					k=k-2;
				}else{
					if(middle<=hight){
						return middle;//若相等则说明mid为查找的位置
					}else{
						return hight;//middle的值已经大于hight，进入扩展数组填充的部分，及最后一个数就是要查找的数
					}
				}
			}
		}
		return -1;
	}

	/**
	 * 生成指定长度的斐波那契数列
	 * @param length 
	 * @return
	 */
	private static int[] fibonacci(int length) {
		int[] array = null;
		if(length>2){
			array = new int[length];
			array[0] =1;
			array[1] =1;
			for (int i = 2; i < length; i++) {
				array[i] = array[i-1]+array[i-2];
			}
		}
		return array;
	}
	
	
	public static void main(String[] args) {
		int[] array = { 1, 7, 14, 24, 26, 31, 40, 42, 47, 50, 60, 68, 99,99,99,99 };
        System.out.println("result: " + fibonacciSearch(array, 31));
	}
}
