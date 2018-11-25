package com.source.code.testng.group;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/** 
* @author 作者: linyaru
* @version 创建时间：2018年11月18日 下午8:42:32 
* 类说明 
*/
public class GroupDemo {
	@Test(groups = "server")
	public void test1() {
		System.out.println("这是服务端组的测试方法1");
	}
	@Test(groups = "server")
	public void test2() {
		System.out.println("这是服务端组的测试方法2");
	}
	@Test(groups = "client")
	public void test3() {
		System.out.println("这是客户端组的测试方法1");
	}
	@Test(groups = "client")
	public void test4() {
		System.out.println("这是客户端组的测试方法2");
	}
	@BeforeGroups("server")
	public void beforeGroupsOnSever() {
		System.out.println("这是服务端组运行之前的方法");
	}
	@AfterGroups("server")
    public void afterGroupsOnSever() {
    	System.out.println("这是服务端组运行后的方法");
    }
}
 