package com.jiaox.io;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.junit.Test;

public class EncodeTest {
	
	@Test
	public void test1() throws UnsupportedEncodingException{
	   String str = URLEncoder.encode("李晓晖", "UTF-8");
	   System.out.println(str);
       String[] s = str.substring(1).split("%");
       StringBuffer s8 = new StringBuffer();
       for(int i=0;i<s.length;i++){
    	   s8.append("\\"+Integer.toOctalString(Integer.valueOf(s[i],16)));
       }
       System.out.println(s8.toString());
	}
	
	@Test
	public void test2() throws UnsupportedEncodingException {
//		System.out.println("\346\235\216\346\231\223\346\231\226");
//		\346\235\216\346\231\223\346\231\226
		
//		String str="\\346\\235\\216\\346\\231\\223\\346\\231\\226";
//		String str ="\\242\\003\\032\\212\\271\\354\\334\\005\\020\\200\\375\\345";
		String str ="\\346\\235\\216\\346\\231\\223\\346\\231\\226";
		String regex = "\\\\[0-9]+";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(str);
        StringBuilder stringBuilder = new StringBuilder();
        while(m.find()){
//            System.out.println(m.group());
            String s  = m.group().substring(1);
//            System.out.println(s);
//            System.out.println(Integer.toHexString(Integer.valueOf(s, 8)));
            stringBuilder.append(Integer.toHexString(Integer.valueOf(s, 8))).append("%");
            
        }
//        System.out.println(stringBuilder);
        stringBuilder.insert(0, "%");
        stringBuilder.deleteCharAt(stringBuilder.lastIndexOf("%"));
//        System.out.println(stringBuilder);
        
        String decode = URLDecoder.decode(stringBuilder.toString(), "UTF-8");
        System.out.println(decode);
		
	}
}
