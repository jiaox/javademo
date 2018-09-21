package com.jiaox.search;

/**
 * 顺序查找
 * @author jiaox
 *
 */
public class SequenceSearch {
	/**
	 * 
	 * @param a 数据集合
	 * @param value 查询值
	 * @return  返回索引或者-1
	 */
	public static int sequenceSearch(int a[], int value){
		int i;
	    for(i=0; i<a.length-1; i++)
	        if(a[i]==value)
	            return i;
	    return -1;
	}
	
	
	public static void main(String[] args) {
		int arr[]= {13,23,31,14,32,15,12,22};
		System.out.println("顺序查找，索引："+sequenceSearch(arr,31));
	}
}
