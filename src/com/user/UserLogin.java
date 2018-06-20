package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserLogin extends BaseTest{
//	��ͨ�û���¼
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/home.jsp");
	}
	@Test
	public void Loign() {
		webtest.click("xpath=html/body/div[1]/div[1]/div/div[5]/a[1]");
		webtest.tabPress();
		webtest.tabPress();
		webtest.type("xpath=.//*[@id='email']", "��������");
		webtest.type("xpath=.//*[@id='pwd_login']", "��������");
		webtest.click("xpath=.//*[@id='login_box']/div/form/input[3]");
	}

}
