package com.jiaox.cn;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class TestMD5 {
	public static void main(String[] args) {
		
//		String source="APP_IDabcTIMESTAMP2031203141TRANS_ID912321eqwrwqqB2732427";
		String source="APP_IDRJRa6hlXRyTIMESTAMP2017-02-08 11:22:43 753TRANS_ID20170208112243753295651YUfNJmEmEfBBBV5QZpDP4asuIer5WfEc";
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
            System.out.println("MD5(" + source + ",32) = " + result);
//            System.out.println("MD5(" + source + ",16) = " + buf.toString().substring(8, 24));
        } catch (NoSuchAlgorithmException e) {
            System.out.println(e);
        }
	}
}
