package magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import magento.baseclass.Baseclass;

public class MenPage extends Baseclass{
	public MenPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[text()='Tops']") WebElement menTop;
	
	public MenTopCatagPage clickMenTops() throws InterruptedException {
		menTop.click();
		Thread.sleep(2000);
		return new MenTopCatagPage();
	}

}
