package com.training;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TrainingManage extends BaseTest{
	@BeforeClass
	public void open(){
		webtest.open("http://localhost:8080/Sugarcane/organization/manageIntro.jsp");
	}
	@Test
	public void manageIntro() {
//		输入培训机构的简介，保存成功
		webtest.type("name=brief", "雪梨是一个在线IT学习网站");
		webtest.click("xpath=.//*[@id='out']/div[2]/div/form/div/button");
	}
}
