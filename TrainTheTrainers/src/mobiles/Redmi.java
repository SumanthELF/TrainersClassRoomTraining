package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Redmi {

	@Test(groups="functionality",enabled=false)
	public void launchRedmi() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.mi.com/in");
		Reporter.log("Opening Redmi",true);
		driver.quit();
	}
}
