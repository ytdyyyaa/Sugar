package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserRegister extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/home.jsp");
	}
	@Test
	public void Register() {
//		成功注册一个新用户
		webtest.click("xpath=html/body/div[1]/div[1]/div/div[5]/a[2]");
		webtest.tabPress();
		webtest.type("xpath=.//*[@id='email_regist']", "xiaoli@163.com");
		webtest.type("xpath=.//*[@id='pwd_regist']", "123456");
		webtest.type("xpath=.//*[@id='pwd_pwd']", "123456");
		webtest.type("xpath=.//*[@id='petname']", "小明");
		webtest.type("xpath=.//*[@id='phone']", "13132115498");
		webtest.click("xpath=.//*[@id='regist_1']");
	}

}
