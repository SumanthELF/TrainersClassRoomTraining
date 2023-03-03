package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Apple {

	@Test(groups= {"smoke","functionality"})
	public void launchApple() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.apple.com/in");
		Reporter.log("Opening Apple website");
		driver.quit();
	}
}
