package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Oneplus {

	@Test(groups="integration",enabled=false)
	public void launchOneplus() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.oneplus.in/");
		Reporter.log("Opening Oneplus ");
		driver.quit();
	}
}
