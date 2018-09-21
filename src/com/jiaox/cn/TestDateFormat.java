package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat {
	public static void main(String[] args) {
		String str1="16-8-11";
		SimpleDateFormat sdf=new SimpleDateFormat("yy-M-d");
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd");
		try {
			Date date=sdf.parse(str1);
			String str2=sdf2.format(date);
			
			System.out.println(str2);
			
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
