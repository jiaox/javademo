package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CompareTime {
	public static void main(String[] args) {
		
//		String kssj="2015-02-21 11:15:21";
//		String jssj="2015-03-22 11:21:21";
//		String cur="2015-03-19 11:21:21";
//		
//		if(compareTime(kssj, cur)&&compareTime(cur, jssj)){//任务落实中进行催办
//			System.out.println("--------------呵呵");
//		}
		
		  int a1=100;
		  int a2=21;
		  System.out.println("----------------"+a1%a2);
		
		
	}
	
	private static boolean compareTime(String startDate,String endDate){
	    boolean flag=false;
	    SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date allStartDate;
		Date allEndDate ;
		try {
			allStartDate = sdf.parse(startDate);
		    allEndDate = sdf.parse(endDate);
			if (allStartDate.getTime() >= allEndDate.getTime()) {
				flag=false;
			} else {
				flag=true;
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return flag;
		
}

}
