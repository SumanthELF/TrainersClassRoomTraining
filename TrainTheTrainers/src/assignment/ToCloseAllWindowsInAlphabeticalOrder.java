package assignment;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCloseAllWindowsInAlphabeticalOrder {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//img[@alt='SAMSUNG Galaxy Z Flip4 ']")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fl_compare")).click();
		Thread.sleep(2000);
		
		Map<String, String> titleAndWindowId = new TreeMap<String, String>();
		Set<String> allWindowIds = driver.getWindowHandles();
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
			titleAndWindowId.put(driver.getTitle().toLowerCase().replace("www.", "").replace(".com", ""),windowId);
		}
		
		
		Set<String> allKeys = titleAndWindowId.keySet();
		for(String key : allKeys) {
			driver.switchTo().window(titleAndWindowId.get(key));
			driver.close();
			Thread.sleep(1000);
		}
		
		
		/*for(Entry<String, String> data:titleAndWindowId.entrySet()) {
			driver.switchTo().window(data.getValue());
			System.out.println("Closing : " +data.getKey() +" titled page");
			driver.close();
		}*/
		
	}

}
