package com.source.code.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月24日 下午10:03:24 类说明
 */
public class MultiThreadOnAnnovation {
	@Test(invocationCount = 10, threadPoolSize = 3)
	public void test1() {
		System.out.println("Thread id : " + Thread.currentThread().getName());
	}
	@Test
	public void test2() {
		System.out.println("Thread id : " + Thread.currentThread().getName());
	}
}
