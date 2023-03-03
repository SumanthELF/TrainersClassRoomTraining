package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToExploreWindowMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.skillrary.com/");
//		driver.manage().window().fullscreen();
		
		Thread.sleep(3000);
		Dimension beforeMaximize = driver.manage().window().getSize();
		System.out.println(beforeMaximize.getHeight());
		System.out.println(beforeMaximize.getWidth());
		
		driver.manage().window().maximize();
		
		System.out.println("==============================================");
		Dimension afterMaximize = driver.manage().window().getSize();
		System.out.println(afterMaximize.getHeight());
		System.out.println(afterMaximize.getWidth());	
		
		
	}

}
