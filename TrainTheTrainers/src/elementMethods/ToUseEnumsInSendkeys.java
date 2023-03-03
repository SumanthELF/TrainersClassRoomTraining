package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUseEnumsInSendkeys {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement unsernameTextField = driver.findElement(By.name("username"));
		unsernameTextField.sendKeys("Sumanth");
		Thread.sleep(1000);
		unsernameTextField.sendKeys(Keys.CONTROL+"a");
		Thread.sleep(1000);
		unsernameTextField.sendKeys(Keys.DELETE);*/
		
		driver.get("https://www.kalkifashion.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("search-input")).sendKeys("Shoes",Keys.ENTER);
				
	}

}
