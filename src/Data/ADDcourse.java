package Data;

import org.testng.annotations.DataProvider;

import com.webtest.dataprovider.FileDataProvider;

public class ADDcourse {
	@DataProvider(name = "course")
	public Object[][] ADDCOURSE() {
		FileDataProvider a = new FileDataProvider("Data/ADDcourse.txt");
		return a.getTestDataByTxt();
	}

}

 
