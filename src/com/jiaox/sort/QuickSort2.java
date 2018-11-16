package com.jiaox.sort;

import java.util.Arrays;

/**
 * 快速排序优化版
 * 
 * 对于基准位置的选取一般有三种方法：固定切分，随机切分和三取样切分。固定切分的效率并不是太好，随机切分是常用的一种切分，效率比较高，最坏情况下时间复杂度有可能为O(N2).对于三数取中选择基准点是最理想的一种。
 * 三数取中切分：
 * @author Administrator
 *
 */
public class QuickSort2 {
	public static void main(String[] args) {
		int [] arr={
				4,8,6,5,1,3,9	
			};
		sort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}
	public static int partition(int []array,int lo,int hi){
        //三数取中
        int mid=lo+(hi-lo)/2;
        if(array[mid]>array[hi]){
            swap(array[mid],array[hi]);
        }
        if(array[lo]>array[hi]){
            swap(array[lo],array[hi]);
        }
        if(array[mid]>array[lo]){
            swap(array[mid],array[lo]);
        }
        int key=array[lo];
        
        while(lo<hi){
            while(array[hi]>=key&&hi>lo){
                hi--;
            }
            array[lo]=array[hi];
            while(array[lo]<=key&&hi>lo){
                lo++;
            }
            array[hi]=array[lo];
        }
        array[hi]=key;
        return hi;
    }
    
    public static void swap(int a,int b){
        int temp=a;
        a=b;
        b=temp;
    }
    public static void sort(int[] array,int lo ,int hi){
        if(lo>=hi){
            return ;
        }
        int index=partition(array,lo,hi);
        sort(array,lo,index-1);
        sort(array,index+1,hi);
    }
    
    /**
     * 快速排序在序列中元素很少时，效率将比较低，不如插入排序，因此一般在序列中元素很少时使用插入排序，这样可以提高整体效率。
     */
    /*public static void quick(int []array ,int lo,int hi){
        if(hi-lo+1<10){
            insertSort(array);
        }else{
            quickSort(array,lo,hi);
        }
    }*/
}
