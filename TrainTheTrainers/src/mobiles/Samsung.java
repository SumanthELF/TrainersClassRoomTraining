package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Samsung {

	/*@Test
	public void launchSamsungLaptops() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/in/offer/online/samsung-fest/laptops-monitors/");
		driver.quit();
	}*/
	
	@Test(groups="smoke",enabled=false)
	public void launchSamsungMobiles() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.samsung.com/in/offer/online/samsung-fest/mobiles/");
		driver.quit();
	}
}
