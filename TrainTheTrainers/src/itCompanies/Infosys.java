package itCompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Infosys {

	@Test(groups= {"crm","realEstate"})
	public void openingInfy() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.infosys.com/");
		Reporter.log("Landed to Infosys Website",true);
		driver.quit();
	}
	
	@Test(groups= {"erp"})
	public void openingMicrosoft() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.microsoft.com/en-in");
		Reporter.log("Landed to Infosys Website",true);
		driver.quit();
	}
}
