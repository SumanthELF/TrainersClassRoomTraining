package webdriverMethods;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureWindowID {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.dell.com/");
		Set<String> allWindowIds = driver.getWindowHandles();
		
		System.out.println(allWindowIds.size());
		for(String windowId : allWindowIds) {
			System.out.println(windowId);
		}
	}

}
