package com.jiaox.cn;

public class Test6 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String dateStr="2015年04月02日";
		String result=fomatDate(dateStr);
		System.out.println(result);
		

	}
	
	public static String fomatDate(String dateStr){
		String result="";
		result=dateStr.replaceAll("年", "-");
		result=result.replaceAll("月","-");
		result=result.replaceAll("日", " ");
		
		result+="00:00";
		return result;
	}

}
