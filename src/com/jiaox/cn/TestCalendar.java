package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
	
	public static void main(String[] args) {
		
		GregorianCalendar calendar=new GregorianCalendar(2015,1,28);
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");//定义日期显示格式
        System.out.println(sdf.format(calendar.getTime()));//打印当前月份的下一个月份
        calendar.add(Calendar.MONTH, -2);//获取上个月月份
        System.out.println(sdf.format(calendar.getTime()));//输出结果
	}

}
