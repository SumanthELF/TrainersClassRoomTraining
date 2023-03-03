package popups;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ToHandleJavaScriptPopup {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		/*driver.get("https://netbanking.hdfcbank.com/netbanking/");
		driver.switchTo().frame("login_page");		
		driver.findElement(By.linkText("CONTINUE")).click();
		Alert alertPopup = driver.switchTo().alert();
		System.out.println(alertPopup.getText());
		alertPopup.accept();*/
		
		/*driver.get("https://licindia.in/");
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}catch (Exception e) {
			Thread.sleep(1000);
			driver.findElement(By.linkText("Agents Portal")).click();
			Thread.sleep(1000);
		}
		Alert confirmationPopup = driver.switchTo().alert();
		System.out.println(confirmationPopup.getText());
		Thread.sleep(1000);
		confirmationPopup.dismiss();
		Thread.sleep(1000);
		try {
			driver.findElement(By.linkText("Agents Portal")).click();
		}catch (Exception e) {
			driver.findElement(By.linkText("Agents Portal")).click();
		}
		Thread.sleep(1000);
		confirmationPopup = driver.switchTo().alert();
		confirmationPopup.accept();*/
		
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Try it']")).click();
		Alert promptAlert = driver.switchTo().alert();
		promptAlert.sendKeys("Sumanth");
		Thread.sleep(3000);
		System.out.println(promptAlert.getText());
		promptAlert.accept();
		System.out.println(driver.findElement(By.id("demo")).getText());
	}
}
