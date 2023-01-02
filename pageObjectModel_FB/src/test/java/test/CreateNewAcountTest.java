package test;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import libary.ExcelReader;


public class CreateNewAcountTest extends BaseTest {
	
	@Test(dataProvider="fb")
	public void CreateNewAcountPageTest(String firstname,String lastname) throws InterruptedException {
		getCreateNewAccountPage();
		cnap.enterFirstName(firstname);
		cnap.enterLastName(lastname);
//		cnap.enterEmail(email);
//		cnap.enterPassWord(passWrod);
//		cnap.selectMonth(month);
//		cnap.selectDay(day);
//		cnap.selectYear(year);
//		cnap.selectRadioButton();
//		cnap.selectSingUpButton();
//		cnap.enterReEmail(reemail);
//	    cnap.selectSingUpButton();
	}
		
			
		
//		cnap.selectMonth();
//		cnap.selectDay();
//		cnap.selectYear();
//		cnap.selectRadioButton();
//		cnap.selectSingUpButton();
//		cnap.enterReEmail();
//		cnap.selectSingUpButton();
		
	
	@DataProvider(name="fb")
	public Object[][]getdata() throws IOException{
		Object [][]t;
		String filename="data/info.xls";
		String sheetname= "krishna";
		ExcelReader obj = new ExcelReader( filename,sheetname); 
		t=obj.excelToArray();
	
		
		return t;
	
	}
}
