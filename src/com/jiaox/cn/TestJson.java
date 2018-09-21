package com.jiaox.cn;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;




public class TestJson {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		queryGoodNum();
//		lockGoodNum();
//		unLockGoodNum();
//		derateGoodNum();
	}
	
	public static void derateGoodNum() {

		String STAFF_ID="13a0023";//------必填
		String PROVINCE_CODE="13";//省份编码------必填
		String CITY_CODE="130";//地市编码------非必填
		String DISTRICT_CODE="132004";//区县编码------非必填
		String CHANNEL_ID="13a0023";//渠道编码------非必填
		String CHANNEL_TYPE="1010400";//渠道类型------非必填
		String DEPART_ID="";//部门编码------非必填
		String SYS_CODE="tjoa";//操作系统编码------必填
		String REM_SN="1";//减免流水------必填
		String SERIAL_NUMBER="1";//------必填
		String REBATE_LIMIT="3";//减免时限（天）	正整数------必填
		String ADVANCE_PAY="1000";//减免前预存款（分）------必填
		String ADVANCE_PAY_L="1000";//减免后预存款（分）------必填
		String LOW_COST="1000";//减免前月承诺通信费（分）------必填
		String LOW_COST_L="1000";//减免后月承诺通信费（分）------必填
		String ONLINE_LENGTH="3";//减免前协议期（月）------必填
		String ONLINE_LENGTH_L="3";//减免后协议期（月）------必填
		//PARA ------非必填
		String PARA_ID="";//保留字段ID------必填
		String PARA_VALUE="";//保留字段值------必填
		
		String jsonbody="";
		jsonbody+="{\"DERATE_GOOD_NUM_REQ\":{";
		
		jsonbody+="\"PROVINCE_CODE\":\""+PROVINCE_CODE+"\"," ;
		
		if(!"".equals(CITY_CODE)&&CITY_CODE!=null)
		jsonbody+="\"CITY_CODE\":\""+CITY_CODE+"\"," ;
		
		if(!"".equals(DISTRICT_CODE)&&DISTRICT_CODE!=null)
		jsonbody+="\"DISTRICT_CODE\":\""+DISTRICT_CODE+"\"," ;
		
		if(!"".equals(CHANNEL_ID)&&CHANNEL_ID!=null)
		jsonbody+="\"CHANNEL_ID\":\""+CHANNEL_ID+"\"," ;
		
		if(!"".equals(CHANNEL_TYPE)&&CHANNEL_TYPE!=null)
		jsonbody+=	"\"CHANNEL_TYPE\":\""+CHANNEL_TYPE+"\"," ;
		
		if(!"".equals(DEPART_ID)&&DEPART_ID!=null)
        jsonbody+="\"DEPART_ID\":\""+DEPART_ID+"\",";
		
        jsonbody+="\"SYS_CODE\":\""+SYS_CODE+"\",";
        jsonbody+="\"REM_SN\":\""+REM_SN+"\"," ;
        
        if(!"".equals(SERIAL_NUMBER)&&SERIAL_NUMBER!=null){
        	 jsonbody+="\"SERIAL_LIST\":[" ;
        	 jsonbody+="{" ;
        	 jsonbody+="\"SERIAL_NUMBER\":\""+SERIAL_NUMBER+"\"," ;
        	 jsonbody+="\"REBATE_LIMIT\":\""+REBATE_LIMIT+"\"," ;
        	 jsonbody+="\"ADVANCE_PAY\":\""+ADVANCE_PAY+"\"," ;
        	 jsonbody+="\"ADVANCE_PAY_L\":\""+ADVANCE_PAY_L+"\"," ;
        	 jsonbody+="\"LOW_COST\":\""+LOW_COST+"\"," ;
        	 jsonbody+="\"LOW_COST_L\":\""+LOW_COST_L+"\"," ;
        	 jsonbody+="\"ONLINE_LENGTH\":\""+ONLINE_LENGTH+"\"," ;
        	 jsonbody+="\"ONLINE_LENGTH_L\":\""+ONLINE_LENGTH_L+"\"" ;
        	 jsonbody+="}" ;
        	 jsonbody+=	"],";
        }
        if(!"".equals(PARA_ID)&&PARA_ID!=null){
        	 jsonbody+="\"PARA\":[" ;
        	 jsonbody+="{" ;
        	 jsonbody+="\"PARA_ID\":\""+PARA_ID+"\"," ;
        	 jsonbody+="\"PARA_VALUE\":\""+PARA_VALUE+"\"" ;
        	 jsonbody+="}" ;
             jsonbody+="],";   	 
        }
        jsonbody+="\"STAFF_ID\":\""+STAFF_ID+"\"" ;
        jsonbody+="}}";
        
        System.out.println(jsonbody);
	
	}

	public static void unLockGoodNum() {

		String STAFF_ID="13a0023";//-------必填
		String PROVINCE_CODE="13";//省份编码-------必填
		String CITY_CODE="130";//地市编码-------必填
		String DISTRICT_CODE="132004";//区县编码-------非必填
		String CHANNEL_ID="13a0023";//渠道编码-------非必填
		String CHANNEL_TYPE="1010400";//渠道类型-------非必填
		String DEPART_ID="";//部门编码-------非必填
		String SYS_CODE="tjoa";//操作系统编码-------必填
		String REM_SN="1";//减免流水-------非必填
		String SERIAL_NUMBER="1";//业务号码-------必填1-n
		String PARA_ID="";//保留字段ID-------非必填
		String PARA_VALUE="";//保留字段值-------非必填
		
		
	
	    
		
		
		String jsonbody="";
		jsonbody+="{\"UNLOCK_GOOD_NUM_REQ\":{";
		
		jsonbody+="\"PROVINCE_CODE\":\""+PROVINCE_CODE+"\"," ;
		jsonbody+="\"CITY_CODE\":\""+CITY_CODE+"\"," ;
		
		if(!"".equals(DISTRICT_CODE)&&DISTRICT_CODE!=null)
		jsonbody+="\"DISTRICT_CODE\":\""+DISTRICT_CODE+"\"," ;
		
		if(!"".equals(CHANNEL_ID)&&CHANNEL_ID!=null)
		jsonbody+="\"CHANNEL_ID\":\""+CHANNEL_ID+"\"," ;
		
		if(!"".equals(CHANNEL_TYPE)&&CHANNEL_TYPE!=null)
		jsonbody+=	"\"CHANNEL_TYPE\":\""+CHANNEL_TYPE+"\"," ;
		
		if(!"".equals(DEPART_ID)&&DEPART_ID!=null)
        jsonbody+="\"DEPART_ID\":\""+DEPART_ID+"\",";
		
        jsonbody+="\"SYS_CODE\":\""+SYS_CODE+"\",";
        
        if(!"".equals(REM_SN)&&REM_SN!=null)
        jsonbody+="\"REM_SN\":\""+REM_SN+"\"," ;
        
        
        
        if(!"".equals(SERIAL_NUMBER)&&SERIAL_NUMBER!=null){
        	 jsonbody+="\"SERIAL_LIST\":[" ;
        	 jsonbody+="{\"SERIAL_NUMBER\":\""+SERIAL_NUMBER+"\"}" ;
        	 jsonbody+=	"],";
        }
        
       
        
        if(!"".equals(PARA_ID)&&PARA_ID!=null){
        	 jsonbody+="\"PARA\":[" ;
        	 jsonbody+="{" ;
        	 jsonbody+="\"PARA_ID\":\""+PARA_ID+"\"," ;
        	 jsonbody+="\"PARA_VALUE\":\""+PARA_VALUE+"\"" ;
        	 jsonbody+="}" ;
             jsonbody+="],";   	 
        }
        jsonbody+="\"STAFF_ID\":\""+STAFF_ID+"\"" ;
        jsonbody+="}}";
        
        System.out.println(jsonbody);
		
	}

	public static void lockGoodNum(){
		String STAFF_ID="13a0023";//----必填
		String PROVINCE_CODE="13";//省份编码----必填
		String CITY_CODE="130";//地市编码----必填
		String DISTRICT_CODE="132004";//区县编码----非必填
		String CHANNEL_ID="13a0023";//渠道编码----非必填
		String CHANNEL_TYPE="1010400";//渠道类型----非必填
		String DEPART_ID="";//部门编码----非必填
		String SYS_CODE="tjoa";//操作系统编码----必填
		String REM_SN=getRemSN();//减免流水----必填
		String SERIAL_NUMBER="18522509797,18522509426";//业务号码-------必填1-n
		String PARA_ID="";//保留字段ID-------非必填
		String PARA_VALUE="";//保留字段值-------非必填
		
		
		List<Map<String,String>> seriallist=new ArrayList<Map<String,String>>();
		if(!"".equals(SERIAL_NUMBER)&&SERIAL_NUMBER!=null){
			String[] strArr=SERIAL_NUMBER.split(",");
			for(int i=0;i<strArr.length;i++){
				Map<String,String> map=new HashMap<String, String>();
				map.put("SERIAL_NUMBER", strArr[i]);
				seriallist.add(map);
			}
		}
		
		String jsonbody="";
		jsonbody+="{\"LOCK_GOOD_NUM_REQ\":{";
		
		jsonbody+="\"PROVINCE_CODE\":\""+PROVINCE_CODE+"\"," ;
		jsonbody+="\"CITY_CODE\":\""+CITY_CODE+"\"," ;
		
		if(!"".equals(DISTRICT_CODE)&&DISTRICT_CODE!=null)
		jsonbody+="\"DISTRICT_CODE\":\""+DISTRICT_CODE+"\"," ;
		
		if(!"".equals(CHANNEL_ID)&&CHANNEL_ID!=null)
		jsonbody+="\"CHANNEL_ID\":\""+CHANNEL_ID+"\"," ;
		
		if(!"".equals(CHANNEL_TYPE)&&CHANNEL_TYPE!=null)
		jsonbody+=	"\"CHANNEL_TYPE\":\""+CHANNEL_TYPE+"\"," ;
		
		if(!"".equals(DEPART_ID)&&DEPART_ID!=null)
        jsonbody+="\"DEPART_ID\":\""+DEPART_ID+"\",";
		
        jsonbody+="\"SYS_CODE\":\""+SYS_CODE+"\",";
        
        jsonbody+="\"REM_SN\":\""+REM_SN+"\"," ;
       		     
     
//        if(!"".equals(SERIAL_NUMBER)&&SERIAL_NUMBER!=null){
//        	 jsonbody+="\"SERIAL_LIST\":[" ;
//        	 jsonbody+="{\"SERIAL_NUMBER\":\""+SERIAL_NUMBER+"\"}" ;
//        	 jsonbody+=	"],";
//        }
        
        if(seriallist.size()>0){
        	jsonbody+="\"SERIAL_LIST\":[" ;
        	for(int i=0;i<seriallist.size();i++){
        		Map<String,String> map=seriallist.get(i);
        		jsonbody+="{\"SERIAL_NUMBER\":\""+map.get("SERIAL_NUMBER")+"\"}" ;
        		if(i!=seriallist.size()-1)
        			jsonbody+=",";
        	}
        	jsonbody+=	"],";
        }
        
        if(!"".equals(PARA_ID)&&PARA_ID!=null){
        	 jsonbody+="\"PARA\":[" ;
        	 jsonbody+="{" ;
        	 jsonbody+="\"PARA_ID\":\""+PARA_ID+"\"," ;
        	 jsonbody+="\"PARA_VALUE\":\""+PARA_VALUE+"\"" ;
        	 jsonbody+="}" ;
             jsonbody+="],";   	 
        }
        
        jsonbody+="\"STAFF_ID\":\""+STAFF_ID+"\"" ;
        
        jsonbody+="}}";
        System.out.println(jsonbody);
		
        
	}
	
	public static void queryGoodNum(){
		String STAFF_ID="13a0023";//---必填
		String PROVINCE_CODE="13";//省份编码---必填
		String CITY_CODE="130";//地市编码---必填
		String DISTRICT_CODE="132004";//区县编码---非必填
		String CHANNEL_ID="13a0023";//渠道编码---非必填
		String CHANNEL_TYPE="1010400";//渠道类型---非必填
		String DEPART_ID="";//部门编码---非必填
		String SYS_CODE="tjoa";//操作系统编码---必填
		String SEARCH_TYPE="1";//查询类型：1：条件查询 2：散号查询 ---必填
		String GOOD_TYPE="";//靓号类型 号码后四位，例如AABB，2233 ---非必填
		String ADVANCE_PAY_LOWER="";//预存款下限---非必填
		String ADVANCE_PAY_TOP="";//预存款上限---非必填
		String GOOD_LEVEL="5";//靓号等级 1:靓号等级1;2:靓号等级2;3:靓号等级3;4:靓号等级4;5:靓号等级5;6:靓号等级6;99.普通号码
							
		String SERIAL_NUM_START="";//起始号码
		String SERIAL_NUM_END="";//终止号码
		String NUM_STATUS="02";//号码状态  01：空闲 02：占用
		String SERIAL_NUMBER="1";//业务号码
		String PARA_ID="1";//保留字段ID
		String PARA_VALUE="1";//保留字段值
		String jsonbody="";
		jsonbody+="{\"QUERY_GOOD_NUM_REQ\":{";
		
		jsonbody+="\"PROVINCE_CODE\":\""+PROVINCE_CODE+"\"," ;
		jsonbody+="\"CITY_CODE\":\""+CITY_CODE+"\"," ;
		
		if(!"".equals(DISTRICT_CODE)&&DISTRICT_CODE!=null)
		jsonbody+="\"DISTRICT_CODE\":\""+DISTRICT_CODE+"\"," ;
		
		if(!"".equals(CHANNEL_ID)&&CHANNEL_ID!=null)
		jsonbody+="\"CHANNEL_ID\":\""+CHANNEL_ID+"\"," ;
		
		if(!"".equals(CHANNEL_TYPE)&&CHANNEL_TYPE!=null)
		jsonbody+=	"\"CHANNEL_TYPE\":\""+CHANNEL_TYPE+"\"," ;
		
		if(!"".equals(DEPART_ID)&&DEPART_ID!=null)
        jsonbody+="\"DEPART_ID\":\""+DEPART_ID+"\",";
		
        jsonbody+="\"SYS_CODE\":\""+SYS_CODE+"\",";
        jsonbody+="\"SEARCH_TYPE\":\""+SEARCH_TYPE+"\",";
        
        if(!"".equals(GOOD_TYPE)&&GOOD_TYPE!=null)
        jsonbody+="\"GOOD_TYPE\":\""+GOOD_TYPE+"\"," ;
        
        if(!"".equals(ADVANCE_PAY_LOWER)&&ADVANCE_PAY_LOWER!=null)
        jsonbody+="\"ADVANCE_PAY_LOWER\":\""+ADVANCE_PAY_LOWER+"\"," ;
        
        if(!"".equals(ADVANCE_PAY_TOP)&&ADVANCE_PAY_TOP!=null)
        jsonbody+="\"ADVANCE_PAY_TOP\":\""+ADVANCE_PAY_TOP+"\"," ;
        		
        if(!"".equals(GOOD_LEVEL)&&GOOD_LEVEL!=null)
        jsonbody+="\"GOOD_LEVEL\":\""+GOOD_LEVEL+"\",";
        
        if(!"".equals(SERIAL_NUM_START)&&SERIAL_NUM_START!=null)
        jsonbody+="\"SERIAL_NUM_START\":\""+SERIAL_NUM_START+"\"," ;
        
        if(!"".equals(SERIAL_NUM_END)&&SERIAL_NUM_END!=null)
        jsonbody+="\"SERIAL_NUM_END\":\""+SERIAL_NUM_END+"\"," ;
        
        if(!"".equals(NUM_STATUS)&&NUM_STATUS!=null)
        jsonbody+="\"NUM_STATUS\":\""+NUM_STATUS+"\"," ;
       		     
     
        if(!"".equals(SERIAL_NUMBER)&&SERIAL_NUMBER!=null){
        	 jsonbody+="\"SERIAL_LIST\":[" ;
        	 jsonbody+="{\"SERIAL_NUMBER\":\""+SERIAL_NUMBER+"\"}" ;
        	 jsonbody+=	"],";
        }
        if(!"".equals(PARA_ID)&&PARA_ID!=null){
        	 jsonbody+="\"PARA\":[" ;
        	 jsonbody+="{" ;
        	 jsonbody+="\"PARA_ID\":\""+PARA_ID+"\"," ;
        	 jsonbody+="\"PARA_VALUE\":\""+PARA_VALUE+"\"" ;
        	 jsonbody+="}" ;
             jsonbody+="],";   	 
        }
        
        jsonbody+="\"STAFF_ID\":\""+STAFF_ID+"\"" ;
        
        jsonbody+="}}";
        System.out.println(jsonbody);
	}
	
	/**
	 * 获取transid
	 * @return
	 */
	public  static String getTRANSID() {
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String datetime=sdf.format(date);
		long t= System.currentTimeMillis();
		String t2=getRandomNum();
		String transid=datetime+String.valueOf(t).substring(0,3)+t2;
		return transid;
	}

	/**
	 * 获取时间戳
	 * @return
	 */
	public static String getTimeStamp(){
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String datetime=sdf.format(date);
		
		long t= System.currentTimeMillis();
		
		String timestamp=datetime+" "+String.valueOf(t).substring(0,3);
		
		return timestamp;
	}
	
	/**
	 * 获取token
	 * @param appid
	 * @param timestamp
	 * @param transid
	 * @param appsecret
	 * @return
	 */
	public static String getToken(String appid,String timestamp,String transid,String appsecret) {
		String source="APP_ID"+appid+
				"TIMESTAMP"+timestamp+
				"TRANS_ID"+transid+appsecret;
		String result=md5Encode(source);
		return result;
	}
	
	/**
	 * MD5加密
	 * @param source
	 * @return
	 */
	public static String md5Encode(String source){
		String result = "";
        try {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(source.getBytes());
            byte b[] = md.digest();
            int i;
            StringBuffer buf = new StringBuffer("");
            for (int offset = 0; offset < b.length; offset++) {
                i = b[offset];
                if (i < 0)
                    i += 256;
                if (i < 16)
                    buf.append("0");
                buf.append(Integer.toHexString(i));
            }
            result = buf.toString();
        } catch (NoSuchAlgorithmException e) {
        }
        return result;
	}
	
	public static String  getRandomNum(){
		 Random random = new Random(); 
         String result="";
         for(int j=0;j<6;j++){
      	   result+=random.nextInt(10);    
         }
         return result;
	}
	
	public static String getRemSN(){
		Date date =new Date();
		SimpleDateFormat sdf=new SimpleDateFormat("yyyyMMddHHmmss");
		String datetime=sdf.format(date);
		return datetime;
	}

}
