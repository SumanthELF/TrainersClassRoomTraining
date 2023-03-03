package itCompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class FireFlink {

	@Test(groups="ecommerce")
	public void openingFireFlink() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://fireflink.com/");
		Reporter.log("Landed to Fireflink Website",true);
		driver.quit();
	}
}
