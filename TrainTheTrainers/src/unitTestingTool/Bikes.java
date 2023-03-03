package unitTestingTool;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Bikes {
	
	/*@Test(priority=1)
	public void royalEnfield() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.royalenfield.com/");
		driver.quit();
	}*/
	
	@Test(invocationCount=2,enabled=false)
	public void ktm() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ktm.com/");
		driver.quit();
	}
	
	@Test(priority=-1,timeOut=3000)
	public void yamaha() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.get("https://www.yamaha-motor-india.com/");
		driver.get("https://www.yamaha-motor-india.com/yamaha-r15s.html");
		driver.quit();
	}
	
	@Test
	public void ather() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.atherenergy.com/");
		driver.quit();
	}
	
	@Test(priority=10)
	public void hero() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.heromotocorp.com/en-in.html");
		driver.quit();
	}
}
