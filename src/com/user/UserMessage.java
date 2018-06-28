package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserMessage extends BaseTest{
	@BeforeClass
	public void open() {
		webtest.click("http://localhost:8080/Sugarcane/front/personinfor.jsp");
	}
	@Test
	public void UserMe() {
//		完善个人信息
		webtest.type("name=name", "昵称");
		webtest.type("name=mail", "abc@sina.com");
		webtest.click("name=sex");
		webtest.getSelect("name=year").selectByVisibleText("1997");
		webtest.getSelect("name=month").selectByVisibleText("6月");
		webtest.getSelect("name=day").selectByVisibleText("12日");
		webtest.getSelect("name=education").selectByVisibleText("本科");
		webtest.getSelect("name=vocation").selectByVisibleText("学生");
		webtest.getSelect("xpath=.//*[@id='cmbProvince']").selectByVisibleText("北京");
		webtest.getSelect("xpath=.//*[@id='cmbCity']").selectByVisibleText("市辖区");
		webtest.getSelect("xpath=.//*[@id='cmbArea']").selectByVisibleText("西城区");
		webtest.type("name=phone", "15763258987");
		webtest.click("xpath=html/body/div[1]/div[2]/div[3]/div[7]/form/table/tbody/tr[1]/td[2]/input");
		webtest.click("xpath=html/body/div[1]/div[2]/div[3]/div[8]/input");
	}

}
