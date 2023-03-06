package testPages;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import magento.baseclass.Baseclass;
import magento.pages.Homepage;
import magento.pages.MenPage;
import magento.pages.MenTopCatagPage;

public class TestMenPage extends Baseclass{
	 Homepage homePage;
	 MenPage menPage;
	 MenTopCatagPage menTopCatPage;
	 
	 
	@BeforeMethod
	public void initilBrowser() {
		lounchBrowser();
		homePage=new Homepage();
		menPage=new MenPage();
		menTopCatPage=new MenTopCatagPage();
		
	}
	@Test
	public void testDropdown() throws InterruptedException {
		
		homePage.menPagePLP();
		menPage.clickMenTops();
		menTopCatPage.sortingProduct();
	
	}
	
	@AfterMethod
	public void quitbr() throws InterruptedException {
		quitBrowser();
	
	}
	
	
	
}
