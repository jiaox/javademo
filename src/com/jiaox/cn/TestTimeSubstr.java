package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestTimeSubstr {
	
	public static void main(String[] args) {
		//当前日期
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date date=new Date();
		String cur=sdf.format(date);
		String curY=cur.substring(0,4);
		String curMonth=cur.substring(5,7);
		String sql="select * from EIP_FZBG_XQGL_XML where error ='1' and TICHUTIME BETWEEN '"+curY+"-01' and '"+curY+"-"+curMonth+"'";
		System.out.println(sql);
	}

}
