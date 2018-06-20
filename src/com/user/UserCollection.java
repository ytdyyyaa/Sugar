package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserCollection extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.open("http://localhost:8080/Sugarcane/front/collection.jsp");
	}
	@Test
	public void collection() {
		webtest.click("xpath=html/body/div[1]/div[2]/div[1]/div[4]/a");
	}

}
