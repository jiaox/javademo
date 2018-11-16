package com.jiaox.sort;

import java.util.Arrays;


/**
 * 冒泡排序
 * @author Administrator
 *
 */
public class BubbleSort {
	public static void main(String[] args) {
		int [] arr={
				4,8,6,5,1,3,9	
			};
		sort(arr);
	}
	
	/**
	 * 从小到大排序
	 * @param arr
	 */
	public static void sort(int[] arr){
		int count=1;
		for(int x=0;x<arr.length;x++){
			for(int y=0;y<arr.length-x-1;y++){
				if(arr[y]>arr[y+1]){
					int temp =arr[y];
					arr[y]=arr[y+1];
					arr[y+1] = temp;
					System.out.println("第"+count++ +"次排序:"+Arrays.toString(arr));
					
				}
			}
		}
		printArray(arr);
	}
	public  static void printArray(int[]arr){
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+",");
		}
		System.out.println();
	}
}
