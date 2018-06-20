package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserRegister extends BaseTest{
//	��ͨ�û�ע��
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/home.jsp");
	}
	@Test
	public void Register() {
		webtest.click("xpath=html/body/div[1]/div[1]/div/div[5]/a[2]");
		webtest.tabPress();
		webtest.type("xpath=.//*[@id='email_regist']", "��������");
		webtest.type("xpath=.//*[@id='pwd_regist']", "��������");
		webtest.type("xpath=.//*[@id='pwd_pwd']", "�ٴ���������");
		webtest.type("xpath=.//*[@id='petname']", "�ǳ�");
		webtest.type("xpath=.//*[@id='phone']", "�ֻ�");
		webtest.click("xpath=.//*[@id='regist_1']");
	}

}
