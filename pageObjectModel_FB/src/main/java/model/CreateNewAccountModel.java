package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class CreateNewAccountModel extends HomeModel{

	public CreateNewAccountModel(WebDriver d) {
		super(d);
		
	} 
	public WebElement getFirstName() throws InterruptedException {
		Thread.sleep(5000);
		WebElement fName=driver.findElement(By.xpath("//input[@name='firstname']"));
		fName.sendKeys();
		return fName;
		
	}
	public WebElement getLasttName() {
		WebElement lName=driver.findElement(By.xpath("//input[@name='lastname']"));
		lName.sendKeys();
		return lName;
	}
//	public WebElement getEmail( ) {
//		WebElement email =driver.findElement(By.xpath("//input[@name='reg_email__']"));
//		email.sendKeys();
//		return email;
//		
//	}
//	public WebElement getPassWord() {
//		WebElement pass =driver.findElement(By.xpath("//input[@id='password_step_input']"));
//		return pass;
	
	}
//	public WebElement getMonth() {
//		WebElement m = driver.findElement(By.xpath("//select[@id='month']"));
//				Select month = new Select(m);
//				month.selectByVisibleText("Mar");
//				return m;
//	}
//	public WebElement getDay() {
//		WebElement d = driver.findElement(By.xpath("//select[@id='day']"));
//				Select day = new Select(d);
//				day.selectByVisibleText("2");
//								return d;	
//}
//public WebElement getYear() {
//	WebElement y = driver.findElement(By.xpath("//select[@id='year']"));
//	Select day = new Select(y);
//	day.selectByVisibleText("1990");
//	return y;	
//}
//
//public WebElement getRadioButton() {
//	WebElement  button =driver.findElement(By.xpath("//input[@value='2']"));
//	return button;
//	
//}
//public WebElement getSingUpButton() {
//	WebElement  subButton =driver.findElement(By.xpath("//button[@name='websubmit']"));
//	return subButton;
//	
//}
//public WebElement getReEmail() {
//	WebElement re_email =driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']"));
//	return re_email;
//	
//}



	
	
	
	
	
	
	
	
	
	
	