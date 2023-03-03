package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureAttributeValues {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://demo.actitime.com/login.do");
		String toolTipText = driver.findElement(By.id("keepMeLoggedInCaptionContainer")).getAttribute("title");
		System.out.println(toolTipText);*/
		
		driver.get("https://www.woodenstreet.com/");
		String altText = driver.findElement(By.xpath("//img[@title='Decor Item']")).getAttribute("alt");
		System.out.println(altText);
		
	}

}
