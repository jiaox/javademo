package com.jiaox.io;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 递归：其实就是函数自己调用自己
 * 注意事项：
 * 1.必须有条件限制，否则会出现栈内存溢出
 * 2.递归次数不能过多，否则内存溢出
 * 
 * 当功能需要被重复使用，而且下次使用的数据是上次函数运算结果，这时可以用递归完成。
 * @author Administrator
 *
 */
public class DiGuiDemo {
	public static void main(String[] args) {
//		toBin(6);
//		System.out.println();
		System.out.println(getSum(5));
	}
	
	public static void toBin(int num){
		if(num>0){
			toBin(num/2);
			System.out.print(num%2);
		}
	}
	
	public static int getSum(int n){
		if(n==1){
			return 1;
		}
		return n+getSum(n-1);
	}
	
//	public static void toBin(int num){
//		while(num>0){
//			System.out.print(num%2);
//			num=num/2;
//		}
//		System.out.println();
//	}
}
