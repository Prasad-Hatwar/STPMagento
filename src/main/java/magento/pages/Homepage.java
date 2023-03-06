package magento.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import magento.baseclass.Baseclass;


public class Homepage extends Baseclass {

	public Homepage() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='logo']")
	WebElement logo;
	@FindBy(xpath = "(//a[text()='Sign In'])[1]")
	WebElement signIn;
	@FindBy(xpath = "(//a[text()='Create an Account'])[1]")
	WebElement createAcc;
	
	
	@FindBy(xpath = "//span[text()='Men']")
	WebElement men;

	// Actions or methods

	public String verifyPageTitle() {
		return driver.getTitle();
	}

	public boolean verifyLogo() {
		return logo.isDisplayed();
		//String headerText=driver.findElement(By.xpath("Create New Customer Account")).getText();
	}

	public LoginPage verifySignIn() {
		signIn.click();
		return new LoginPage();

	}
	public CreateAccountPage verifyCreateAccount() {
		createAcc.click();
		return new CreateAccountPage();
	}

	public  MenPage menPagePLP() throws InterruptedException {
		 men.click();
		 Thread.sleep(2000);
		 return new  MenPage();
	}

}
