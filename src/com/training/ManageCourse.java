package com.training;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ManageCourse extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/organization/manageClassify.jsp?courseName=&publicTypeName=");
	}
	@Test
	public void managecourse() {
//		培训机构管理分类
		webtest.type("xpath=.//*[@id='table']/form/table/tbody/tr[2]/td[1]/input", "网络原理");
		webtest.type("name=publicTypeName", "基础课程");
		webtest.getSelect("xpath=.//*[@id='table']/form/table/tbody/tr[2]/td[3]/select").selectByIndex(0);
		webtest.click("xpath=.//*[@id='table']/form/table/tbody/tr[2]/td[4]/input");
	}

}
