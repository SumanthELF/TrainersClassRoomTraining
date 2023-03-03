package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureSourceCode {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.skillrary.com/");
		
		String pageSource = driver.getPageSource();
		System.out.println(pageSource);
		
//		driver.quit();
	}

}
