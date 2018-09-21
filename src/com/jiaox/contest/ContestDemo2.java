package com.jiaox.contest;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 将一个整数转换成二进制的形式表示。
 * @author jiaox
 *
 */
public class ContestDemo2 {
	public static void main(String[] args) {
		toBin(6);
	}
	
	public static String toBin(int num){
		while(num>0){
			System.out.println(num%2);
			num=num/2;
		}
		return null;
	}
}
