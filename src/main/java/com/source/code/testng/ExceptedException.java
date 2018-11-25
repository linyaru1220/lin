package com.source.code.testng;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月18日 下午9:32:11 类说明
 */
/*
 * 期望结果为某一个异常的时候
 */
public class ExceptedException {
	@Test(expectedExceptions = RuntimeException.class)
	public void runTimeExceptionFailed() {
		System.out.println("这是一个失败的异常测试");
	}

	@Test(expectedExceptions = RuntimeException.class)
	public void runTimeExceptionSuccess() {
		throw new RuntimeException("这是一个失败的异常测试");
	}

}
