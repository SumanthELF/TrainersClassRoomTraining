package unitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class LoginToApplication {

	@DataProvider
	public String[] sendData() {
		String[] sarr = {"https://tommyhilfiger.nnnow.com/", "https://www.ethoswatches.com/",
				"https://www.rolex.com/" };
		return sarr;
	}

	@Test(dataProvider="sendData")
	public void login(String url) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get(url);
		Thread.sleep(1000);
		driver.quit();
	}
}
