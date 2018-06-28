package com.manage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ManageHomepage extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/manager/background.jsp");
	}
	
	@Test
	public void checkUserMn() {
//		查看用户管理页面
		webtest.click("xpath=html/body/div[2]/div[1]/ul/li[1]/a");
		
	}
	@Test(dependsOnMethods="checkUserMn")
	public void forbiddenUser() {
//		禁用用户
		webtest.click("xpath=html/body/div[2]/div[2]/table/tbody/tr[2]/td[3]/label");
	}
	@Test(dependsOnMethods="forbiddenUser")
	public void checkOrMn() {
//		查看培训机构管理页面
		webtest.click("xpath=.//*[@id='company']");
	}
	@Test(dependsOnMethods="checkOrMn")
	public void forbiddenOr() {
//		禁用培训机构
		webtest.click("xpath=html/body/div[2]/div[2]/table/tbody/tr[2]/td[3]/label");
	}

}
