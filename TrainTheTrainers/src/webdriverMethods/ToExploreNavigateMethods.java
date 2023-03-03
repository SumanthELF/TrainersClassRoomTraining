package webdriverMethods;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreNavigateMethods {

	public static void main(String[] args) throws InterruptedException, MalformedURLException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://baskinrobbinsindia.com/");
		Thread.sleep(1000);
		driver.navigate().to("https://polarbear.co.in/");
		Thread.sleep(1000);
		driver.navigate().to(new URL("https://www.cornerhouseicecreams.com/"));
		Navigation nav = driver.navigate();
		nav.back();
		Thread.sleep(1000);
		nav.forward();		
		Thread.sleep(3000);
		nav.refresh();
	}
}
