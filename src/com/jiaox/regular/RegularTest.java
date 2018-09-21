package com.jiaox.regular;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularTest {
	public static void main(String[] args) {
		String phoneReg = "\\b(ip(hone|od)|android|opera m(ob|in)i"    
	            +"|windows (phone|ce)|blackberry"    
	            +"|s(ymbian|eries60|amsung)|p(laybook|alm|rofile/midp"    
	            +"|laystation portable)|nokia|fennec|htc[-_]"    
	            +"|mobile|up.browser|[1-4][0-9]{2}x[1-4][0-9]{2})\\b"; //手机
		
		String tableReg = "\\b(ipad|tablet|(Nexus 7)|up.browser"    
		            +"|[1-4][0-9]{2}x[1-4][0-9]{2})\\b";             //平板
		
		 //移动设备正则匹配：手机端、平板  
	    Pattern phonePat = Pattern.compile(phoneReg, Pattern.CASE_INSENSITIVE);    
	    Pattern tablePat = Pattern.compile(tableReg, Pattern.CASE_INSENSITIVE);  
	    
	    String userAgent="mozilla/4.0 (compatible; msie 7.0; windows nt 6.1; trident/5.0; slcc2; .net clr 2.0.50727; .net clr 3.5.30729; .net clr 3.0.30729; media center pc 6.0; infopath.2; tablet pc 2.0; .net4.0e; .net4.0c; hwvcloud4; hwcloud4; .net clr 1.1.4322)";
	    
	    // 匹配    
        Matcher matcherPhone = phonePat.matcher(userAgent);    
        Matcher matcherTable = tablePat.matcher(userAgent);    
        
        
        System.out.println("---------"+matcherPhone.find());
        System.out.println("---------"+matcherTable.find());
        
        
	    
	    
		
		
	}
}
