package com.jiaox.search;

/**
 * 插值查找
 * @author jiaox
 *
 */
public class InsertionSearch {
	/**
	 * 插值查找
	 * @param a
	 * @param value
	 * @param low
	 * @param high
	 * @return
	 */
	public static int insertionSearch(int a[], int value, int low, int high){
		int mid = low+(value-a[low])/(a[high]-a[low])*(high-low);
	    if(a[mid]==value){
	    	 return mid;
	    }else if(a[mid]>value){
	    	return insertionSearch(a, value, low, mid-1);
	    }else if(a[mid]<value){
	    	 return insertionSearch(a, value, mid+1, high);
	    }else{
	    	return -1;
	    }
		
	}
	
	
	public static void main(String[] args) {
		int[] arr = { 7, 13, 35, 80, 93, 99, 180, 561 };
		System.out.println("插值查找，索引："+insertionSearch(arr, 93, 0, arr.length - 1));
	}
}
