package com.jiaox.cn;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDateFormat2 {
	public static void main(String[] args) {
		  Date date = new Date();
		  SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  String result="";
		  String timeStr=sdf.format(date);
		  String year=timeStr.substring(2,4);
		  int month=Integer.parseInt(timeStr.substring(5,7));
		  String day=timeStr.substring(8,10);
		  int hour=Integer.parseInt(timeStr.substring(11,13));//24小时制
		  int hour2=0;//改成12小时制
		  String ap="";
		  if(hour>12){
			  hour2=hour-12;
			  ap="下午";
		  }else{
			  hour2=hour;
			  ap="上午";
		  }
		  String hour3=hour2>10?String.valueOf(hour2):("0"+String.valueOf(hour2));//转化成string
		  String min=timeStr.substring(14,16);
		  String sec=timeStr.substring(17,19);
		  result=day+"-"+month+"月 -"+year+" "+hour3+"."+min+"."+sec+"%"+ap+"%";
		  
		  
		  //01-9月 -16 02.52.08.886000 下午
		  //01-9月 -16 03.44.54
		  System.out.println(result);
		  
		  
		  
	        
	}

}
