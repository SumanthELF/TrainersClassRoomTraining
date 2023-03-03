package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseItalianoChildWindow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		Thread.sleep(3000);
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds.size());
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			if(driver.getTitle().contains("KFC")) {
				driver.close();
				break;
			}
		}
	}

}
