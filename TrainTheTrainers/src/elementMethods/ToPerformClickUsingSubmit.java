package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformClickUsingSubmit {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		/*driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(2000);
		WebElement loginButton = driver.findElement(By.id("loginButton"));
		loginButton.submit();*/
		
		/*driver.get("https://demowebshop.tricentis.com/register");
		Thread.sleep(2000);
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.submit();*/
		
		driver.get("https://www.skillrary.com/");
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN IN")).click();
		driver.findElement(By.xpath("//button[contains(text(),'Submit')]")).submit();
	}

}
