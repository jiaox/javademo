package com.jiaox.array;

/**
 * 将数组按递增长度截取，递增规律自定，求最大截取长度的子序列，打印成字符串
 * 
 * 例如[1,434,234,12,25,37,19,390,88,78,100,1234,33]
 * 
 * 按照加一规则递增截取成:[1],[434,234],[12,25,37],[37,19,390,88],[78,100,1234,33]  所以最大长度的应该是[37,19,390,88]和[78,100,1234,33]
 * 
 * 
 * @author Administrator
 *
 */

public class SplitIncreaceArray {
	
	public static void main(String[] args) {
		int[] arr = {1,434,234,12,25,37,19,390,88,78,100,1234,33,456};
		int index=0;
		int len =1;
		
		while((index+len)<arr.length){
			index=index+len;
			++len;
		}
		System.out.println( index);
		System.out.println(len);
		
	}
	
	//
	public static int  getlength(int len1,int len2){
		return 0;
	}
}
