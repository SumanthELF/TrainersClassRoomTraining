package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToSwitchTheDriverControl {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/user/Desktop/MultipleWindow.html");
		
		driver.findElement(By.xpath("//input[@value='Open Food Sites']")).click();
		
		Thread.sleep(4000);
		System.out.println(driver.getTitle());
		Set<String> allWindowIds = driver.getWindowHandles();
		System.out.println(allWindowIds.size());
		
		for(String windowId : allWindowIds) {
			System.out.println(windowId);
		}
//		driver.close();
		driver.quit();
		
	}

}
