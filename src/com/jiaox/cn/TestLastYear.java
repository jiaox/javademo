package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestLastYear {
    public static void main(String[] args) {
    	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM");
		Date date=new Date();
		String cur=sdf.format(date);
		String curY=cur.substring(0,4);
		String curMonth=cur.substring(5,7);
		
		
		String sql="select * from EIP_FZBG_XQGL_XML where error ='1' ";
		       if("01".equals(curMonth)){
		    	   GregorianCalendar calendar=new GregorianCalendar(Integer.valueOf(curY),1,1);
		    	   calendar.add(Calendar.MONTH, -2);
		    	   String lastY=sdf.format(calendar.getTime()).substring(0,4);
		    	   sql+="and TICHUTIME BETWEEN '"+lastY+"-01' ";
		       }else{
		    	   sql+="and TICHUTIME BETWEEN '"+curY+"-01' ";
		       }
			   
			   sql+="and '"+curY+"-"+curMonth+"'";
		
		System.out.println(sql);
	}
}
