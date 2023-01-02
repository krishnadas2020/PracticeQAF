package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.BaseModel;
import model.HomeModel;

public class HomePage extends HomeModel {

	public HomePage(WebDriver d) {
		super(d);
		
	}
	public void clickOnCreate() {
		WebElement e = getCreateAccountBtn();
		e.click();
		
	}
	

}
