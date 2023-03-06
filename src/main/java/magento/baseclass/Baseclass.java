package magento.baseclass;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Baseclass {
	public static WebDriver  driver;
	public static Properties prop;

	public Baseclass() {
		try {
			prop =new Properties();
			FileInputStream fInput = new FileInputStream("../Ecomm-Magento/src/main/java/utility/config.properties");

			prop.load(fInput);

		} catch (FileNotFoundException e) {

			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void lounchBrowser() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(prop.getProperty("baseurl"));
	}
	
	public void quitBrowser() throws InterruptedException {
		
		Thread.sleep(2000);
		driver.quit();
	}
}
