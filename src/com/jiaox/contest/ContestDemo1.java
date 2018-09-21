package com.jiaox.contest;
/**
 * 编写一个程序，这个程序把一个整数数组中的每个元素用逗号连接成一个字符串，
 *	例如，根据内容为[1][2][3]的数组形成内容为"1,2,3"的字符串。 
 * @author jiaox
 *
 */
public class ContestDemo1 {
	public static void main(String[] args) {
		int [] a={1,2,3};
		String result="";
		for(int x=0;x<a.length;x++){
			result+=String.valueOf(a[x]) ;
			if(x!=a.length-1){
				result+=",";
			}
		}
		System.out.println(result);
		
	}
}
