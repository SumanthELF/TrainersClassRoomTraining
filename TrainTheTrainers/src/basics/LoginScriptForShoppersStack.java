package basics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScriptForShoppersStack {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

		driver.get("https://www.shoppersstack.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("fl_login_btn")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("fl_email")).sendKeys("sumanth.l@testyantra.com");
		Thread.sleep(1000);
		driver.findElement(By.id("fl_password")).sendKeys("nopassword");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@aria-label=\"Account settings\"]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//li[text()='My Profile']")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("My Addresses")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("ADD ADDRESS")).click();
	}

}
