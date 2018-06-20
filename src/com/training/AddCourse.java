package com.training;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

import Data.ADDcourse;


public class AddCourse extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/organization/addCourse.jsp");
	}
	@Test(dataProvider = "course", dataProviderClass = ADDcourse.class)
	public void addcourse(String courseName,String price,String teacher,String phoneNumber,String courseBrief) {
		webtest.type("name=courseName", courseName);
		webtest.getSelect("xpath=.//*[@id='form']/table/tbody/tr[2]/td[2]/select").selectByVisibleText("0");
		webtest.getSelect("xpath=.//*[@id='form']/table/tbody/tr[3]/td[2]/select").selectByVisibleText("0");
		webtest.type("name=price", price);
		webtest.type("name=teacher", teacher);
		webtest.type("name=phoneNumber", phoneNumber);
		webtest.type("name=courseBrief", courseBrief);
		webtest.click("xpath=.//*[@id='form']/table/tbody/tr[8]/td[3]/input");
	}

}
