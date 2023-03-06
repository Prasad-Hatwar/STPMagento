package testPages;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import magento.baseclass.Baseclass;
import magento.pages.Homepage;

public class TestHomePage extends Baseclass{
	 Homepage homePage;
	
	public TestHomePage() {
		super();
	}

	@BeforeMethod
	public void initilBrowser() {
		lounchBrowser();
		homePage=new Homepage();
	}
	
	@Test
	public void testVerifyPageTitle() {
		Assert.assertEquals(homePage.verifyPageTitle(),"Home Page", "Expected title not found");
		
	}
	
	@Test
	public void testVerifyLogo() {
		boolean logocheck= homePage.verifyLogo();
		Assert.assertTrue(logocheck);
		
	}
	@Test
	public void testVerifySignIn() {
		homePage.verifySignIn();
	}
	
	@AfterMethod
	public void closeBrowser() throws InterruptedException {
		quitBrowser();
	}
}
