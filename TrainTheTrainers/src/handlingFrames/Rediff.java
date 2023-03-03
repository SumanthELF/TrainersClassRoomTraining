package handlingFrames;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Rediff {

	public static void main(String[] args) {
		String subject = "Kiran";
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.get("https://mail.rediff.com/");
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.name("login")).sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.id("password")).sendKeys("Testing@123", Keys.ENTER);
		driver.findElement(By.linkText("Write mail")).click();
		driver.findElement(By.xpath("//input[contains(@id,'TO') and @placeholder]"))
				.sendKeys("sumanthElfBatch@rediffmail.com");
		driver.findElement(By.xpath("//input[contains(@class,'subject')]")).sendKeys(subject);
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe[contains(@title,'Rich Text Editor')]")));
		driver.findElement(By.tagName("body")).sendKeys("Hi Welcome to Advanced Automation");
		driver.switchTo().defaultContent();
		driver.findElement(By.linkText("Send")).click();
		
		for(;;) {
			try {
				driver.findElement(By.xpath("//span[@title='"+subject+"']/..//cite[@title='Select mail']")).click();
				break;
			}catch(NoSuchElementException e) {
				driver.findElement(By.xpath("//cite[@title='Refresh Inbox']")).click();
			}
		}		
		driver.findElement(By.xpath("//span[text()='Delete']")).click();
		driver.findElement(By.xpath("//button[text()='Ok']")).click();
		System.out.println(driver.findElement(By.id("rdNotify")).getText());
	}

}
