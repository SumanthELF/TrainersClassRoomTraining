package webdriverMethods;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSetTheSizeOfWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		Point positionOfBrowser = driver.manage().window().getPosition();
		System.out.println(positionOfBrowser.getX());
		System.out.println(positionOfBrowser.getY());
		
		driver.manage().window().setSize(new Dimension(500, 200));
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(0, 0));
		Thread.sleep(3000);
		driver.manage().window().setPosition(new Point(500, 100));
	}

}
