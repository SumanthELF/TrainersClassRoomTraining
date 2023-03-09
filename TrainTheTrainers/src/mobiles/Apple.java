package mobiles;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Reporter;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Apple {

	@Parameters({"browserName","message"})
	@Test(groups= {"smoke","functionality"})
	public void launchApple(@Optional("firefox") String bname,String msg) {
		WebDriver  driver = null;
		if(bname.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(bname.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
			driver = new FirefoxDriver();
		}
		System.out.println(msg);
		driver.get("https://www.apple.com/in");
		Reporter.log("Opening Apple website");
		driver.quit();
	}
}
