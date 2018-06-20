package com.user;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class UserMessage extends BaseTest{
//	��ͨ�û�����������Ϣ
	@BeforeClass
	public void open() {
		webtest.click("http://localhost:8080/Sugarcane/front/personinfor.jsp");
	}
	@Test
	public void UserMe() {
		webtest.type("name=name", "����");
		webtest.type("name=mail", "abc@sina.com");
		webtest.click("name=sex");
		webtest.getSelect("name=year").selectByVisibleText("1997");
		webtest.getSelect("name=month").selectByVisibleText("6��");
		webtest.getSelect("name=day").selectByVisibleText("12��");
		webtest.getSelect("name=education").selectByVisibleText("˶ʿ");
		webtest.getSelect("name=vocation").selectByVisibleText("��ʦ");
		webtest.type("name=address", "�ӱ�ʡʯ��ׯ��ԣ����");
		webtest.type("name=phone", "15763258987");
		webtest.click("xpath=html/body/div[1]/div[2]/div[3]/div[7]/form/table/tbody/tr[1]/td[2]/input");
		webtest.click("xpath=html/body/div[1]/div[2]/div[3]/div[8]/input");
	}

}
