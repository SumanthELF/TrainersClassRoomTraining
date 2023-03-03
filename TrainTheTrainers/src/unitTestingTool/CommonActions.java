package unitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.asserts.SoftAssert;

public class CommonActions {

	//Expcted Data
	public String homePageTitle="";
	public WebDriver driver;
	
	public void browserSetup() {
		// Step 1 : Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		driver = new ChromeDriver();
		Reporter.log("Browser Launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);

		driver.get("https://demowebshop.tricentis.com/");
//		Assert.assertEquals(driver.getTitle(), homePageTitle, "Failed to Navigate to Home page");
		Reporter.log("Navigated to Home page Successfully", true);
	}

	public void browserTearDown() {
		driver.quit();
	}
}
