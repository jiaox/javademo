package com.jiaox.regular;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 判断是否数字
 * @author Administrator
 *
 */
public class TestRegular2 {
	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub  
		
		String str="11";
		Pattern p = null;  
        Matcher m = null;  
        boolean b = false;   
        p=Pattern.compile("^[0-9]+.?[0-9]*$"); 
        m = p.matcher(str);  
        b = m.matches();  
        
        System.out.println(b);


	}
}
