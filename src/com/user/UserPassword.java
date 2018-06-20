package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserPassword extends BaseTest{
//	��ͨ�û���������
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/resetpwd.jsp");
	}
	@Test
	public void resetpwd() {
		webtest.type("name=email", "��ȷ�������˺�");
		webtest.type("xpath=html/body/div[1]/div[2]/div[2]/div/form/div[2]/div/input", "������");
		webtest.type("name=password", "������");
		webtest.type("name=checkPWD", "ȷ������");
		webtest.click("xpath=html/body/div[1]/div[2]/div[2]/div/form/div[5]/input");
	}

}
