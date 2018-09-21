package com.jiaox.cn;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 修改日期格式
 * @author Administrator
 *
 */
public class TestDateFormat3 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
        String str1="12/11/15 12:21";
        String str2=getFormatDate(str1);
        System.out.println(str2);
        
	}
	
	public static String getFormatDate(String dataStr) throws ParseException{
		String resultDate="";
		SimpleDateFormat sdf1=new SimpleDateFormat("MM/dd/yy HH:mm");
		Date date=sdf1.parse(dataStr);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy-MM-dd HH:mm");
		resultDate=sdf2.format(date);
		return resultDate;
	}

}
