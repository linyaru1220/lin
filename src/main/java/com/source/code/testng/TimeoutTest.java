package com.source.code.testng;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月24日 下午10:39:48 类说明
 */
public class TimeoutTest {
	@Test(timeOut = 3000) // ms
	public void testSuccess() throws InterruptedException {
		Thread.sleep(4000);
	}

}
