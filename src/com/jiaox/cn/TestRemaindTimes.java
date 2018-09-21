package com.jiaox.cn;

import java.math.BigDecimal;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;


public class TestRemaindTimes {
	public static void main(String[] args) {
		String jssj="2018-03-19";
		double days = getDays(jssj);
		
		System.out.println("days:"+days);
		String txcs = "4";
		
		String [] times=executeRemindTimes(days, txcs, jssj);
		
		System.out.println(Arrays.toString(times).replaceAll("\\[", "").replaceAll("\\]", ""));
//		System.out.println(times);
	}
	
	private static String[] executeRemindTimes(double days,String txcs,String jssj){
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		int times = Integer.valueOf(txcs);
		String[] remindTimes=null;
		if(times>0){
			
			int a =(new Double(days/times)).intValue();
			Calendar cal = Calendar.getInstance();
			System.out.println("2222:"+a);
			String remindtime="";
			int count =0;
			int tmp = 0;
			
			
			if(a>=0&&a<1){//days<times
				if(days>0&&days<1){
					count = 1;
				}else{
					count=(new Double(days)).intValue();
				}
				tmp=1;
				System.out.println("1111:"+count);
			}else{
				count=times;
				tmp=a;
			}
			
			remindTimes=new String[count];
			for(int i=0;i<count;i++){
				cal.add(cal.DAY_OF_MONTH, tmp);
				remindtime=sdf.format(cal.getTime());
				if(remindtime.compareTo(jssj)<=0){
					System.out.println(remindtime);
					remindTimes[i]=remindtime;
					
				}
			}
			
		}
		
		return remindTimes;
	}
	
	
	private static double getDays(String jssj){
		Date beginDate = new Date();
		Date endDate = StringToDate(jssj,"yyyy-MM-dd");
		long beginTime = beginDate.getTime(); 
		long endTime = endDate.getTime(); 
		Double days =  ((double)(endTime - beginTime)) / (1000 * 60 * 60 *24); 
		BigDecimal bg = new BigDecimal(days);
        double betweenDays = bg.setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
		return betweenDays;
	}
	
	private static  Date StringToDate(String dateStr,String formatStr){		
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
