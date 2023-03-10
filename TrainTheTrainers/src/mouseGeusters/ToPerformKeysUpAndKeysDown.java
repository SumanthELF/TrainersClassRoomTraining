package mouseGeusters;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformKeysUpAndKeysDown {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.kalkifashion.com/");
		List<WebElement> navBarElements = driver.findElements(By.xpath("//nav[not(@id)='mobile-nav']//div[@id='desktop-nav']/div/a"));
		Actions actions = new Actions(driver);
		
		for(WebElement navEle : navBarElements) {
			actions.keyDown(navEle, Keys.CONTROL).perform();
			actions.keyUp(Keys.CONTROL);
		}
		
	}

}
