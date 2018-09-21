package com.jiaox.cn;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import net.sf.json.JSONObject;

public class JsonTool {
	public static String getJsonString(Object key, Object value)  
    {  
        //System.out.println("key: " + key);  
        //System.out.println("value: " + value.toString());  
        JSONObject obj = new JSONObject();  
        obj.put(key, value);    //添加物件  
        return obj.toString();  //转换为字符串并返回  
    }  
      
    //解析PHP json_encode 字符串  
    public static String unescapeUnicode(String str)  
    {  
        StringBuffer b=new StringBuffer();  
        Matcher m = Pattern.compile("\\\\u([0-9a-fA-F]{4})").matcher(str);  
        while(m.find())  
        {  
            b.append((char)Integer.parseInt(m.group(1),16));  
        }  
        return b.toString();  
    }  
}
