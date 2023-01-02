package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.CreateNewAccountModel;

public class CreateNewAccountPage extends CreateNewAccountModel{

	public CreateNewAccountPage(WebDriver d) {
		super(d);
		
	}
	public void enterFirstName(String f) throws InterruptedException {
		 WebElement fName=getFirstName();
		 fName.clear();
		fName.sendKeys(f);	
	}
	public void enterLastName(String l) {
		 WebElement lName=getLasttName();
		 lName.clear();
		lName.sendKeys(l);	
	}
//  	public void enterEmail(String e) {
//     WebElement email=getEmail();
//     email.clear();
//         email.sendKeys(e);	
//	}
//	public void enterPassWord(String p) {
//		 WebElement passWord=getPassWord();
//		passWord.sendKeys(p);	
//	} 

//	public void selectMonth(String m) {
//		WebElement month=getMonth();
//		month.clear();
//		month.click();
//	
//	}
//	public void selectDay(int d) {
//		WebElement day=getDay();
//		day.click();
//	}
//	public void selectYear(int y) {
//		WebElement year=getYear();
//		year.clear();
//		year.click();
//	}
//	public void selectRadioButton() {
//		WebElement radiobutton=getRadioButton();
//		radiobutton.click();	
//	}
//	public void selectSingUpButton() {
//		WebElement submitButton=getSingUpButton();
//		submitButton.click();
//	}
//	public void enterReEmail(String r) {
//		 WebElement email=getReEmail();
//		email.sendKeys(r);	
//	}
	
	
		
	
}
