package itCompanies;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestYantra {

	@Test(groups="engineers")
	public void openingTestYantra() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.testyantra.com/");
		Reporter.log("Landed to TestYantra Website",true);
		driver.quit();
	}
}
