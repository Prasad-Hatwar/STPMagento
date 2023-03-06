package magento.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import magento.baseclass.Baseclass;

public class MenTopCatagPage extends Baseclass {
	
	
	public MenTopCatagPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//select[@id='sorter']") WebElement sortBy;
	
	//Actions or methods
	
	public void sortingProduct() throws InterruptedException {
		
		Select select=new Select(sortBy);
		Thread.sleep(2000);
		select.selectByValue("name");
	}
	
	

}
