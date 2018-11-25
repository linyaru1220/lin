package com.source.code.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

/** 
* @author 作者: linyaru
* @version 创建时间：2018年11月12日 下午10:54:53 
* 类说明 
*/
public class SuiteConfig {
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("before suite运行啦~");
	}
	@AfterSuite
    public void sfterSuite() {
    	System.out.println("after suite运行啦~");
    }
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest");		
	}
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest");
	}
}
 