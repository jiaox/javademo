package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test16 {
	public static void main(String[] args) {
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM");
		String datestr=sdf.format(date);
		System.out.println(datestr);
	}
}
