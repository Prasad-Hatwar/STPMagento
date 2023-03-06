package magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import magento.baseclass.Baseclass;

public class LoginPage extends Baseclass{
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//input[@id='email']") WebElement email;
	@FindBy(xpath = "(//input[@id='pass'])[1]")WebElement passwd;
	@FindBy(xpath = "(//span[text()='Sign In'])[1]")WebElement signInbtn;
	
	public void signIn() {
		
		email.sendKeys(prop.getProperty("userName"));
		passwd.sendKeys(prop.getProperty("passwd"));
		
		signInbtn.click();
	}
	

}
