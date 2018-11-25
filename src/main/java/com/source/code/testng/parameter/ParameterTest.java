package com.source.code.testng.parameter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月18日 下午11:04:52 类说明
 */
public class ParameterTest {
	@Test
	@Parameters({ "name", "age" })
	public void parameterTest(String name, int age) {
		System.out.println("name = " + name + "age = " + age);
	}

}
