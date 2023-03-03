package itCompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Wipro {

	@Test(groups= {"transport","engineers"},dependsOnGroups="realEstate")
	public void openingWipro() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.wipro.com/");
		Reporter.log("Landed to Wipro Website",true);
		driver.quit();
	}
}
