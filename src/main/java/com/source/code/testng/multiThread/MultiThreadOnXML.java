package com.source.code.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月24日 下午9:57:54 类说明
 */
public class MultiThreadOnXML {
	@Test
	public void test1() {
		System.out.println("test1! Thread id : " + Thread.currentThread().getName());
	}

	@Test
	public void test2() {
		System.out.println("test2! Thread id : " + Thread.currentThread().getName());
	}

	@Test
	public void test3() {
		System.out.println("test3! Thread id : " + Thread.currentThread().getName());
	}
}
