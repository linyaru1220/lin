package com.source.code.testng.group.grouponclass;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月18日 下午8:59:09 类说明
 */
@Test(groups = "stu")//类上面也是可以加Test标签的
public class GroupsOnClass1 {
	public void stu1() {
		System.out.println("GroupsOnClass1中的stu1方法运行");
	}
	public void stu2() {
		System.out.println("GroupsOnClass1中的stu2方法运行");
	}
}
