package com.jiaox.number;

import com.itextpdf.text.pdf.PdfStructTreeController.returnType;

/**
 * 进制转换
 * @author jiaox
 *
 */
public class NumberBaseConversion {
	public static void main(String[] args) {
		System.out.println(toBin(8));//自定义方法
		System.out.println(toHex(8));//自定义方法
		System.out.println(Integer.toBinaryString(8));//java自带方法
		System.out.println(Integer.toHexString(8));//java自带方法
		
		int [] x,y[];
		
		
		
//		System.out.println(x==y);	
	}
	
	/**
	 * 转2进制
	 * @param num
	 * @return
	 */
	public static String toBin(int num){
		return trans(num, 1, 1);
	}
	
	/**
	 * 转16进制
	 * @param num
	 * @return
	 */
	public static String toHex(int num){
		return trans(num, 15, 4);
	}
	
	/**
	 * 转8进制
	 * @param num
	 * @return
	 */
	public static String toOctal(int num){
		return trans(num, 7, 3);
	}
	
	/**
	 * 十进制转换功能
	 * @param num  十进制数
	 * @param base   ‘与’操作 基数   转换成2进制则同1与，转换成十六进制则同15与
	 * @param offset  位移量 转换2进制右位移 1位，转换成16进制右位移4位
	 */
	public static String trans(int num,int base,int offset){
		if (num==0) {
			return "0";
		}
		
		
		//指针对应表
		char[] chs = {
				'0','1','2','3',
				'4','5','6','7',
				'8','9','A','B',
				'C','D','E','F'
		};
		//存储容器
		char[] arr =new char[32];
		int pos = arr.length;
		while(num!=0){
			int temp = num & base;//与一个进制
			arr[--pos] =chs[temp];
			num = num >>> offset;  //无符号右移
		}
		
		return new String(arr,pos,arr.length-pos);
		
	}
}
