package com.jiaox.cn;

import sun.rmi.runtime.Log;



public class TestMianshi1 {
	public static void main(String[] args) {
//		System.out.println(getNum(5));
		String  str="AAABBDDCAABDCADC";
		System.out.println(removeMethod(str));
	}
	
	public static int getNum(int n){
		int result=0;
		try {
			n++;
			result=2/0;
			n++;
			return n++;
		} catch (Exception e) {
			n++;
		}
		n++;
		return n++;
	}
	
	/**
	 * 注意下面的方法时间复杂度是O(n^2)
	 * 因为stringBuffer.indexOf 内部使用的是for循环
	 * @param str
	 * @return
	 */
	public static String removeMethod (String  str){
		char[] a=str.toCharArray();
		StringBuffer stringBuffer=new StringBuffer();
		for (int i = 0; i < a.length; i++) {
			if(stringBuffer.indexOf(String.valueOf(a[i]))==-1){
				stringBuffer.append(a[i]);
			}
		}
		
		return stringBuffer.toString();
	}
	
	public static String removeMethod2(String str){
	        StringBuffer sb = new StringBuffer();
	        int len = str.length();
	        for (int i = 0; i < len; i++) {
	            char c = str.charAt(i);
	            if (str.indexOf(c) ==str.lastIndexOf(c)) {//此字符第一次位置和最后位置一致 即肯定没有重复的直接添加
	                sb.append(c);
	            } else {//同理 次字符出现过多次
	                int fristposition=str.indexOf(c);//次字符第一次出现的位置
	                if(fristposition==i){//第一次出现的位置和当前位置一致 即第一次出现添加
	                    sb.append(c);
	                }
	            }
	        }
	        return sb.toString();
	}
	

}
