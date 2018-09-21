package com.jiaox.cn;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestTimeDifference2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String gq="10";
		String bfb="25";
		String begin = "2015-12-03 12:06";
		Date begindate = StringToDate(begin,"yyyy-MM-dd HH:mm");
		System.out.println("11111");
		Double days = getDays(begindate,new Date());
		System.out.println("2222");
		Double guess = Long.valueOf(gq)*Double.valueOf(bfb)*0.01;
		System.out.println("33333");

	}
	private static Double getDays(Date beginDate,Date endDate){
		long beginTime = beginDate.getTime(); 
		long endTime = endDate.getTime(); 
		Double days =  ((double)(endTime - beginTime)) / (1000 * 60 * 60 *24); 
		BigDecimal bg = new BigDecimal(days);
        double betweenDays = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return betweenDays;

	}
	
	public static Date StringToDate(String dateStr,String formatStr){		
		DateFormat sdf=new SimpleDateFormat(formatStr);		
		Date date=null;		
		try {			
			date = sdf.parse(dateStr);		
		} catch (Exception e) {
			e.printStackTrace();		
		}		
		return date;	
	}

}
