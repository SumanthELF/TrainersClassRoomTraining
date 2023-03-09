package unitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import dataDriven.ReadData;
import pomRepo.HomePage;
import pomRepo.LoginPage;
import pomRepo.WelcomePage;

public class BaseTest {   //BaseClass

	public WebDriver driver;
	public HomePage homePage;

	@Parameters("browserName")
	@BeforeClass
	public void browserSetup(String browserName) {
		// Step 1 : Open the browser and enter the url
		if(browserName.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}else {
			Assert.assertEquals(true, false,"Invalid browser name");
		}
		Reporter.log("Browser Launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
	}

	@BeforeMethod
	public void loginToApp() {
		driver.get("https://www.shoppersstack.com/");
//		Assert.assertEquals(driver.getTitle(), homePageTitle, "Failed to Navigate to Home page");
		Reporter.log("Navigated to Home page Successfully", true);
		WelcomePage welcomePage = new WelcomePage(driver);
		welcomePage.getLoginButton().click();
		LoginPage loginPage = new LoginPage(driver);
		homePage=loginPage.login("", "");
	}

	@AfterClass
	public void browserTearDown() {
		Reporter.log("Close the browser", true);
		driver.quit();
	}

	@AfterMethod
	public void logoutOfApp() {
		Reporter.log("logout", true);
		homePage.getAccountSetting().click();
		homePage.getLogout().click();
	}
}
