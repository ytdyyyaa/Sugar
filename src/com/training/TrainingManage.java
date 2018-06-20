package com.training;



import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TrainingManage extends BaseTest{
	@BeforeClass
	public void open(){
		webtest.open("http://localhost:8080/Sugarcane/organization/manageIntro.jsp");
	}
	@Test
	public void manageIntro() {
//		������ѵ�����ļ�飬����ɹ�
		webtest.type("name=brief", "ѩ�������һ��������Ƶѧϰ��վ");
		webtest.click("xpath=.//*[@id='out']/div[2]/div/form/div/button");
	}
}
