package com.source.code.testng.parameter;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月24日 下午9:19:25 类说明
 */
public class DataParameterTest {
	@Test(dataProvider = "data")
	public void testProvider(String name, int age) {
		System.out.println("name = " + name + ", age = " + age);
	}

	@DataProvider(name = "data")
	public Object[][] providerData() {
		Object[][] o = new Object[][] { { "zhangsan", 10 }, { "lisi", 20 } };
		return o;
	}

	/*
	 * 支持根据方法名来传递不同的参数
	 */
	@Test(dataProvider = "dataMethod")
	public void test1(String name, int age) {
		System.out.println("111, name = " + name + ", age = " + age);
	}

	@Test(dataProvider = "dataMethod")
	public void test2(String name, int age) {
		System.out.println("222, name = " + name + ", age = " + age);
	}

	// method会把方法名(test1, test2)传递进来，利用反射
	@DataProvider(name = "dataMethod")
	public Object[][] dataProvider(Method method) {
		Object[][] result = null;
		if (method.getName().equals("test1")) {
			result = new Object[][] { { "haha", 100 }, { "lala", 200 } };
		} else if (method.getName().equals("test2")) {
			result = new Object[][] { { "houhou", 10 }, { "mama", 20 } };
		}
		return result;
	}
}
