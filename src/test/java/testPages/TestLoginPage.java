package testPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import magento.baseclass.Baseclass;
import magento.pages.Homepage;
import magento.pages.LoginPage;

public class TestLoginPage extends Baseclass{
	
	Homepage homePage;
	LoginPage loginPage;
	
	@BeforeMethod
	public void intialBrowser() {
		lounchBrowser();
		homePage=new Homepage();
		loginPage=new LoginPage();
	}
	
	@Test
	public void testLoginPage() {
		homePage.verifySignIn();
		loginPage.signIn();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		quitBrowser();
	}
}
