package elementMethods;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToCaptureMultipleElements {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.kalkifashion.com/");

		/*
		 * driver.findElement(By.partialLinkText("SALWAR KAMEEZ")).click();
		 * List<WebElement> resultPageElements = driver .findElements(By.xpath(
		 * "//div[@id='amasty-shopby-product-list']/section/div[3]/div/form"));
		 * 
		 * System.out.println(resultPageElements.size());
		 */

		List<WebElement> navBarElements = driver
				.findElements(By.xpath("//nav[not(@id='mobile-nav')]/div/div[@id='desktop-nav']/div"));
		for (WebElement navEle : navBarElements) {
			System.out.println(navEle.getText());
		}
		driver.findElement(By.id("")).getScreenshotAs(OutputType.FILE);
	}

}
