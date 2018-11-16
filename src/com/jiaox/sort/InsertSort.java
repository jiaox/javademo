package com.jiaox.sort;

import java.util.Arrays;

public class InsertSort {
	
	public static void main(String[] args) {
		int [] arr={
				4,8,6,5,1,3,9	
			};
//		straightInsertSort(arr,arr.length);
		insertSort(arr,arr.length);
	}
	
	public static void straightInsertSort(int[] arr,int len){
        int temp=0;
        int j=0;
        for (int i = 1; i <len ; i++) {//待插入的数字
            for (j =i-1; j>=0; j--) {//有序区间
                if(arr[i]>arr[j]){
                    break;
                }
           }
               if(j!=i-1){
                   temp=arr[i];
                   for (int k =i-1; k >j ; k--) {
                       arr[k+1]=arr[k];//从后向前移动数组
                   }
                   arr[j+1]=temp;
               }
          // System.out.println("直接插入排序后数组" + Arrays.toString(arr));

       }
       System.out.println("直接插入排序后数组" + Arrays.toString(arr));

   }
   //直接插入排序简洁版
   public static void straightInsertSort2(int[] arr,int len){
       int temp=0;
       int j=0;
       for (int i = 1; i <len ; i++) {
           if(arr[i]<arr[i-1]){
               temp=arr[i];
               for (j = i-1; j>=0&&temp<arr[j] ; j--) {
                   arr[j+1]=arr[j];//从后向前移动数组
               }
               arr[j+1]=temp;
           }
       }
       System.out.println("直接插入排序后数组" + Arrays.toString(arr));
   }
   
   public static void insertSort(int arr[],int len){
       int tmp=-1;
       int soretdIndex=0;
       for (int i = 1; i <len ; i++) {
           tmp=arr[i];
           soretdIndex=i-1;
           while (soretdIndex>=0&&arr[soretdIndex]>tmp){
               arr[soretdIndex+1]=arr[soretdIndex];
               soretdIndex--;
          }
          arr[soretdIndex+1]=tmp;
      }
       
       System.out.println(Arrays.toString(arr));
  }

}
