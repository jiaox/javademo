package com.jiaox.array;
/**
 * 约瑟夫环
 * @author jiaox
 *
 */
public class YsfCircle {
	public static void main(String[] args) {
		int[] arr={1,2,3,4,5,6,7,8};
		//定义操作该数组的指针用于跳着操作其中的元素
		int pos =-1;
		for(int x=0;x<arr.length-1;x++){
			for(int y=0;y<3;y++){
				pos++;
				if(pos==arr.length){
					pos=0;
				}
				while(arr[pos]==0){
					pos++;
					if(pos==arr.length){
						pos=0;
					}
				}
			}
			arr[pos]=0;
		}
		
		for(int x=0;x<arr.length;x++){
			if(arr[x]!=0){
				System.out.println(arr[x]);
				break;
			}
		}
	}
	
	
}
