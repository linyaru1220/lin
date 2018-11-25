package com.source.code.testng.group.grouponclass;

import org.testng.annotations.Test;

/**
 * @author 作者: linyaru
 * @version 创建时间：2018年11月18日 下午9:11:43 类说明
 */
@Test(groups = "teacher")
public class GroupsOnClass3 {
	public void teacher1() {
		System.out.println("GroupsOnClass3中的teacher1方法运行");
	}

	public void teacher2() {
		System.out.println("GroupsOnClass3中的teacher2方法运行");
	}
}
