package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControlInShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("http://shoppersstack.com/products_page/11");
		Thread.sleep(6000);
		driver.findElement(By.id("fl_compare")).click();
		Thread.sleep(2000);
		
		Set<String> allWindowIds = driver.getWindowHandles();
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			String titleOfThePage = driver.getTitle();
			if(titleOfThePage.contains("amazon")) {
				driver.close();
				break;
			}
		}		
	}

}
