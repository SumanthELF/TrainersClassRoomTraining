package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Vivo {

	@Test(groups="integration",dependsOnGroups= "smoke")
	public void launchVivo() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vivo.com/in");
		driver.quit();
	}
}
