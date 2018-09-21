package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestDateAddDay {
	public static void main(String[] args) {

		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHH:mm:ss");//定义日期显示格式
		Date date=new Date();
		
//		String cur="2016-01-08 11:21:01";
		String  cur=sdf.format(date);
		System.out.println(cur);
		int curY=Integer.valueOf(cur.substring(0,4));//当前年
		int curM=Integer.valueOf(cur.substring(4,6));//当前月
		int curD=Integer.valueOf(cur.substring(6,8));//当天
		
//		System.out.println(curY+" "+curM+" "+curD);
		
		GregorianCalendar calendar=new GregorianCalendar(curY,curM,curD);
		
//        System.out.println(sdf.format(calendar.getTime()));//打印当前月份的下一个月份
        calendar.add(Calendar.MONTH, -4);//获取上个月月份
        System.out.println(sdf.format(calendar.getTime()));//输出结果
        
        String lastM=sdf.format(calendar.getTime());
        System.out.println(lastM);
	
	}
}
