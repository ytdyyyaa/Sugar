package com.training;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TrainingLogin extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/organization/orgLogin.jsp");
	}
	@Test
	public void loginsuccess() {
//		培训机构登录成功
		webtest.type("name=username", "abc@163.com");
		webtest.type("name=password", "123456");
		webtest.click("xpath=.//*[@id='words']/div[3]/button[2]");
	}

}
