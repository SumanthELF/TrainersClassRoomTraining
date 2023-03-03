package webdriverMethods;

import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureTitleOfTheWebpage {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.hp.com/");
		String titleOfThePage = driver.getTitle();
		System.out.println(titleOfThePage);
	}
}
