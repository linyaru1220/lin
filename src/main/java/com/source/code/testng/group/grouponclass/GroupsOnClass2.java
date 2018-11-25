package com.source.code.testng.group.grouponclass;

import org.testng.annotations.Test;

/** 
* @author 作者: linyaru
* @version 创建时间：2018年11月18日 下午9:00:21 
* 类说明 
*/
@Test(groups = "stu")
public class GroupsOnClass2 {
	public void stu1() {
		System.out.println("GroupsOnClass2中的stu1方法运行!");
	}
	public void stu2() {
		System.out.println("GroupsOnClass2中的stu2方法运行!");
	}
}
 