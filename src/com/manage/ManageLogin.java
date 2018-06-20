package com.manage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class ManageLogin extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/manager/bgLogin.jsp");
	}
	@Test
	public void bgLogin() {
		webtest.type("name=adminname", "admin");
		webtest.type("name=password", "1234");
		webtest.click("xpath=html/body/div[2]/form/input");
	}

}
