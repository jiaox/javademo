package com.jiaox.fileconvert;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.http.Consts;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.HttpStatus;
import org.apache.http.NameValuePair;
import org.apache.http.ParseException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntity;
import org.apache.http.entity.mime.content.FileBody;
import org.apache.http.entity.mime.content.StringBody;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;

public class TestWordToImage {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 文件上传转换
		// String convertByFile =
		// SubmitPost("http://dcs.yozosoft.com:80/upload",
		// "C:/doctest.docx", "1");
		// 网络地址转换
		Map<String, String> map = new HashMap<String, String>();
		map.put("downloadUrl",
				"http://10.26.13.196:9999/eipmoa/api/zw/dl/6977373.doc");
		map.put("convertType", "5");
		map.put("isZip", "5");
		String convertByUrl = sendPost("http://10.26.13.196:9999/dcs.web/onlinefile",
				map);
		// System.out.println(convertByFile);
		System.out.println(convertByUrl);

	}

	public static String sendPost(String serverurl, Map<String, String> param) {
		String result = "";
		List<NameValuePair> list = new ArrayList<NameValuePair>();
		String fullurl = "";
		// 请求参数
		for (String key : param.keySet()) {
			list.add(new BasicNameValuePair(key, param.get(key)));
		}
		try {
			fullurl = EntityUtils.toString(new UrlEncodedFormEntity(list,
					Consts.UTF_8));
			System.out.println(serverurl + "?" + fullurl);
		} catch (Exception e) {
			result = "下载失败";
			e.printStackTrace();
		}
		HttpPost httpget = new HttpPost(serverurl + "?" + fullurl);
		CloseableHttpClient httpclient = HttpClients.createDefault();
		try {
			CloseableHttpResponse response = httpclient.execute(httpget);
			if (response.getStatusLine().getStatusCode() == 200) {
				HttpEntity entity = response.getEntity();
				result = EntityUtils.toString(entity);
			} else {
				result = "下载失败";
			}
		} catch (Exception e) {
			result = "下载失败";
			e.printStackTrace();
		} finally {
			httpget.releaseConnection();
		}
		return result;
	}

	/**
	 * 074 向指定 URL 上传文件POST方法的请求 075
	 * 
	 * 076
	 * 
	 * @param url
	 *            发送请求的 URL 077
	 * @param filepath
	 *            文件路径 078
	 * @param type
	 *            转换类型 079
	 * @return 所代表远程资源的响应结果, json数据 080
	 */
	public static String SubmitPost(String url, String filepath, String type) {
		String requestJson = "";
		HttpClient httpclient = new DefaultHttpClient();
		try {
			HttpPost httppost = new HttpPost(url);
			FileBody file = new FileBody(new File(filepath));
			MultipartEntity reqEntity = new MultipartEntity(
					HttpMultipartMode.BROWSER_COMPATIBLE, null,
					Charset.forName("UTF-8"));
			reqEntity.addPart("file", file); // file为请求后台的File upload;属性
			reqEntity.addPart("convertType",
					new StringBody(type, Charset.forName("UTF-8")));
			httppost.setEntity(reqEntity);
			HttpResponse response = httpclient.execute(httppost);
			int statusCode = response.getStatusLine().getStatusCode();
			if (statusCode == HttpStatus.SC_OK) {
				HttpEntity resEntity = response.getEntity();
				requestJson = EntityUtils.toString(resEntity);
				EntityUtils.consume(resEntity);
			}
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// requestJson = e.toString();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			// requestJson = e.toString();
		} finally {
			try {
				httpclient.getConnectionManager().shutdown();
			} catch (Exception ignore) {
			}
		}
		return requestJson;
	}

}
