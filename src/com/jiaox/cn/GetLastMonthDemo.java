package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * 获取上个月份
 * @author jiaox
 *
 */
public class GetLastMonthDemo {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");//定义日期显示格式
		String cur="2016-01-08 11:21:01";
		
		int curY=Integer.valueOf(cur.substring(0,4));//当前年
		int curM=Integer.valueOf(cur.substring(5,7));//当前月
		int curD=Integer.valueOf(cur.substring(8,10));//当天
		
//		System.out.println(curY+" "+curM+" "+curD);
		
		GregorianCalendar calendar=new GregorianCalendar(curY,curM,curD);
		
//        System.out.println(sdf.format(calendar.getTime()));//打印当前月份的下一个月份
        calendar.add(Calendar.MONTH, -2);//获取上个月月份
        System.out.println(sdf.format(calendar.getTime()));//输出结果
        
        String lastM=sdf.format(calendar.getTime()).substring(5,7);
        System.out.println(lastM);
	}

}
