package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserResearch extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/home.jsp");
	}
	@Test
	public void ResearchCourse() {
		webtest.click("xpath=html/body/div[1]/div[1]/div/div[5]/form/div/a");
		webtest.type("xpath=.//*[@id='content_course']", "Ӣ��");
		webtest.click("xpath=html/body/div[1]/div[2]/div/form[1]/p/button");
	}
	@Test
	public void ResearchTraining() {
		webtest.click("xpath=html/body/div[1]/div[3]/a");
		webtest.click("xpath=html/body/div[1]/div[1]/div/div[5]/form/div/a");
		webtest.click("xpath=html/body/div[1]/div[2]/ul/li[2]/a");
		webtest.type("xpath=.//*[@id='content_course']", "ѩ��");
		webtest.click("xpath=html/body/div[1]/div[2]/div/form[1]/p/button");
	}

}
