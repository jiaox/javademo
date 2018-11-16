package com.jiaox.calendar;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;


/**
 * 获取下一天
 * @author Administrator
 *
 */
public class Demo1 {
	public static void main(String[] args) {
		Date date = new Date();
		Calendar calendar =new GregorianCalendar();
		calendar.setTime(date);
		calendar.add(Calendar.DATE, 1);
	}
}
