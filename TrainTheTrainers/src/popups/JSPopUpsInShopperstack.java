package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JSPopUpsInShopperstack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		Actions actions = new Actions(driver);
		
		driver.get("https://www.shoppersstack.com/");
		for(;;) {
			try {
				driver.findElement(By.linkText("Swagger Documentation")).click();
				break;
			}catch(Exception e) {
				actions.sendKeys(Keys.PAGE_DOWN).perform();
				Thread.sleep(1000);
			}
		}
		Thread.sleep(2000);
		Alert popUp = driver.switchTo().alert();
		System.out.println(popUp.getText());
		Thread.sleep(1000);
		popUp.accept();
		Thread.sleep(1000);
		popUp.sendKeys("Sumanth");
		Thread.sleep(1000);
		popUp.accept();
		Thread.sleep(1000);
		popUp.sendKeys("admin");
		Thread.sleep(1000);
		popUp.accept();
		Thread.sleep(1000);
		System.out.println(popUp.getText());
		Thread.sleep(1000);
		popUp.accept();
	}

}
