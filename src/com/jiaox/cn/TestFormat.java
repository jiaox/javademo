package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFormat {
	
	public static void main(String[] args) {
		String startDate="2016-04-06 00:00";
		String endDate="2016-07-16 11:21";
		boolean flag=false;
		
		
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm");
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
		System.out.println(flag);
	}

}
