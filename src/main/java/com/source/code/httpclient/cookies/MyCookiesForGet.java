package com.source.code.httpclient.cookies;
/**
* @author Linyaru
* @version 创建时间：2018年11月28日 下午8:46:52
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;
import java.util.Properties;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.cookie.Cookie;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class MyCookiesForGet {

	private String url;
	private String getUrl;
	// 用来存储cookies信息
	private CookieStore cookieStore;
	private Properties properties;
	// private InputStream fis =
	// MyCookiesForGet.class.getClassLoader().getResourceAsStream("/application.properties");
//	private InputStream in;

	@BeforeClass
	public void getProperties() throws IOException {
		// fis =
		// MyCookiesForGet.class.getClassLoader().getResourceAsStream("application.properties");
		InputStream in = MyCookiesForGet.class.getClassLoader().getResourceAsStream("/conf/application.properties");
		if (properties != null) {
			try {
				properties.load(in);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			url = properties.getProperty("base_url") + properties.getProperty("httpClient/getCookies");
			getUrl = properties.getProperty("base_url") + properties.getProperty("getWithCookies");
			in.close();
		} else {
			throw new RuntimeException("read properties error");
		}
	}

	@Test
	public void test1() throws ClientProtocolException, IOException {
		String result;
		HttpGet get = new HttpGet(url);
		// CookieStore cookieStore = new BasicCookieStore();
		HttpClient client = HttpClients.custom().setDefaultCookieStore(cookieStore).build();
		// HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(get);
		result = EntityUtils.toString(response.getEntity(), "utf-8");
		System.out.println(result);
		// 获取cookies信息
		List<Cookie> cookies = cookieStore.getCookies();
		for (Cookie cookie : cookies) {
			System.out.println(cookie.getName() + " = " + cookie.getValue());
		}
	}

	// @Test(dependsOnMethods = { "test1" })
	// public void testWithCookies() throws ClientProtocolException, IOException {
	// String testResult;
	// HttpGet get = new HttpGet(getUrl);
	// HttpClient client =
	// HttpClients.custom().setDefaultCookieStore(cookieStore).build();
	// HttpResponse response = client.execute(get);
	// testResult = EntityUtils.toString(response.getEntity(), "utf-8");
	// System.out.println(testResult);
	// // 获取cookies信息
	// List<Cookie> cookies = cookieStore.getCookies();
	// for (Cookie cookie : cookies) {
	// System.out.println(cookie.getName() + " = " + cookie.getValue());
	// }
	// }

}
