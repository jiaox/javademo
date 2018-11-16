package com.jiaox.sort;

/**
 * 选择排序
 * @author Jiao Xiao
 *
 */
public class SelectionSort {
	
	public static void main(String[] args) {
		int [] arr={
			4,8,6,5,1,3,9	
		};
		
	    sort2(arr);
		
		
	}
	
	public static void sort(int [] arr){
		for(int x=0;x<arr.length-1;x++){
			for(int y=x+1;y<arr.length;y++){
				
				if(arr[y]<arr[x]){
					int temp =arr[x];
					arr[x]=arr[y];
					arr[y] = temp;
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
	/**
	 * 选择排序优化版
	 * @param arr
	 */
	public static void sort2(int[]arr){
		for(int x=0;x<arr.length;x++){
			int num =arr[x];
			int index =x;
			for(int y=x+1;y<arr.length;y++){
				if(num>arr[y]){
					num=arr[y];
					index =y ;
				}
			}
			if(index!=x){
				int temp =arr[x];
				arr[x]=num;
				arr[index]=temp;
			}
		}
		
		printArray(arr);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
