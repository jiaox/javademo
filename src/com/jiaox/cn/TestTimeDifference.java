package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * 计算时间差
 * @author Administrator
 *
 */
public class TestTimeDifference {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		String startdate="2015-11-28 17:10";
		String tjwjbsj="2015-11-20 17:38";
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		int days=getDays(sdf.parse(tjwjbsj),sdf.parse(startdate));
		
	    System.out.println(days);

	}
	
	private static int getDays(Date beginDate,Date endDate) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		beginDate=sdf.parse(sdf.format(beginDate));
		endDate=sdf.parse(sdf.format(endDate));
		Calendar cal=Calendar.getInstance();
		cal.setTime(beginDate);
		long time1=cal.getTimeInMillis();
		cal.setTime(endDate);
		long time2=cal.getTimeInMillis();
		long between_days=(time2-time1)/(1000*3600*24);
		
		return Integer.parseInt(String.valueOf(between_days));

	}

}
