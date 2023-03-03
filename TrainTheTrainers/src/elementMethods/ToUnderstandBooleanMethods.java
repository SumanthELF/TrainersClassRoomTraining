package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToUnderstandBooleanMethods {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		/*
		 * driver.get("https://www.instagram.com/"); Thread.sleep(3000); WebElement
		 * loginButton = driver.findElement(By.xpath("//button[.='Log in']"));
		 * System.out.println("Before Entering data into username and password field");
		 * System.out.println(loginButton.isDisplayed());
		 * System.out.println(loginButton.isEnabled());
		 * System.out.println("================================");
		 * System.out.println("After Entering data into username and password field");
		 * driver.findElement(By.name("username")).sendKeys("Sum","anth");
		 * driver.findElement(By.name("password")).sendKeys("Testing@123");
		 * System.out.println(loginButton.isEnabled());
		 */

		driver.get("https://demoapp.skillrary.com/");
		Thread.sleep(1500);
		WebElement option = driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']"));
		System.out.println(option.isSelected());
		option.click();
		Thread.sleep(1500);
		System.out.println(option.isSelected());

	}
}
