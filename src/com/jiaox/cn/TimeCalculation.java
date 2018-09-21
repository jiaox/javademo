package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class TimeCalculation {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub  
		       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");  
		        Date d1=sdf.parse("2016-04-14 17:13:00");  
	        Date d2=sdf.parse("2016-06-01 17:13:00");  
	       System.out.println(daysBetween(d1,d2));  
	 
		        System.out.println(daysBetween("2012-09-08 10:10:10","2012-09-15 00:00:00")); 


	}
	
	 /**  
	24.     * 计算两个日期之间相差的天数  
	25.     * @param smdate 较小的时间 
	26.     * @param bdate  较大的时间 
	27.     * @return 相差天数 
	28.     * @throws ParseException  
	29.     */    
	    public static int daysBetween(Date smdate,Date bdate) throws ParseException    
	    {    
	       SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	        smdate=sdf.parse(sdf.format(smdate));  
	       bdate=sdf.parse(sdf.format(bdate));  
	        Calendar cal = Calendar.getInstance();    
	        cal.setTime(smdate);    
	       long time1 = cal.getTimeInMillis();                 
	        cal.setTime(bdate);    
	        long time2 = cal.getTimeInMillis();         
	       long between_days=(time2-time1)/(1000*3600*24);  
	           
	       return Integer.parseInt(String.valueOf(between_days));           
	    }
	    /** 
	    *字符串的日期格式的计算 
	    */  
	        public static int daysBetween(String smdate,String bdate) throws ParseException{  
	            SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");  
	            Calendar cal = Calendar.getInstance();    
	            cal.setTime(sdf.parse(smdate));    
	            long time1 = cal.getTimeInMillis();                 
	            cal.setTime(sdf.parse(bdate));    
	            long time2 = cal.getTimeInMillis();         
	            long between_days=(time2-time1)/(1000*3600*24);  
	                
	           return Integer.parseInt(String.valueOf(between_days));     
	        } 


}
