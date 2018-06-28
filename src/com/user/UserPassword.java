package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserPassword extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/resetpwd.jsp");
	}
	@Test
	public void resetpwd() {
//		重置密码
		webtest.type("name=email", "abc@163.com");
		webtest.type("xpath=html/body/div[1]/div[2]/div[2]/div/form/div[2]/div/input", "123456");
		webtest.type("name=password", "012345");
		webtest.type("name=checkPWD", "012345");
		webtest.click("xpath=html/body/div[1]/div[2]/div[2]/div/form/div[5]/input");
	}

}
