package com.training;


import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.webtest.core.BaseTest;

public class TrainingRegiter extends BaseTest{
	@BeforeClass
	public void openUrl() {
		webtest.open("http://localhost:8080/Sugarcane/organization/orgRegist.jsp");
	}
	@Test
	public void regiter() {
//		��ѵ����ע����Ϣ�ύ�ɹ�
		webtest.type("xpath=.//*[@id='table1']/form/table/tbody/tr[1]/td[2]/input", "ѩ��");
		webtest.type("xpath=.//*[@id='table1']/form/table/tbody/tr[2]/td[2]/input", "abc@163.com");
		webtest.type("xpath=.//*[@id='table1']/form/table/tbody/tr[3]/td[2]/input", "123456");
		webtest.type("xpath=.//*[@id='table1']/form/table/tbody/tr[4]/td[2]/input", "13605209874");
		webtest.getSelect("xpath=.//*[@id='cmbProvince']").selectByVisibleText("����");
		webtest.getSelect("xpath=.//*[@id='cmbCity']").selectByVisibleText("��Ͻ��");
		webtest.getSelect("xpath=.//*[@id='cmbArea']").selectByVisibleText("������");
		webtest.type("xpath=.//*[@id='table1']/form/table/tbody/tr[6]/td[2]/textarea", "ѩ����һ������ѧϰ��Ƶ��վ");
		webtest.click("xpath=.//*[@id='tijiao']/button");
	}

}
