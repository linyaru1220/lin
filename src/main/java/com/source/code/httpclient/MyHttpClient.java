package com.source.code.httpclient;

import java.io.IOException;
import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

/**
 * @author Linyaru
 * @version 创建时间：2018年11月27日 下午9:28:20
 */
public class MyHttpClient {
	@Test
	public void test1() throws ClientProtocolException, IOException {
		String result;
		HttpGet get = new HttpGet("http://www.baidu.com");
		HttpClient client = HttpClientBuilder.create().build();
		HttpResponse response = client.execute(get);
		result = EntityUtils.toString(response.getEntity(), "utf-8");
		System.out.println(result);
	}

}
