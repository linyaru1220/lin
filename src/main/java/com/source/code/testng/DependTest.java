package com.source.code.testng;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月18日 下午10:33:50 类说明
 */
public class DependTest {
	@Test
	public void test1() {
		System.out.println("test1 run!");
	}

	@Test(dependsOnMethods = { "test1" })//test2依赖于test1,只运行test2，若test1失败，则忽略test2
	public void test2() {
		System.out.println("test2 run!");
	}
}
