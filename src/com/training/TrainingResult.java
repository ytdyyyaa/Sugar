package com.training;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TrainingResult extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/organization/dopass.jsp");
	}
	@Test
	public void inquireResult() {
//		查询是否审核通过
		webtest.click("xpath=.//*[@id='out']/form/div/input");
	}

}
