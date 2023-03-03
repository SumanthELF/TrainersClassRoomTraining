package itCompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TechMahindra {

	@Test(groups="hospital")
	public void openingTechM() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.techmahindra.com/");
		Reporter.log("Landed to TechMahindra Website",true);
		driver.quit();
	}
}
