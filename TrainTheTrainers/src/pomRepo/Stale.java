package pomRepo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Stale {

	@Test
	public void refresh() {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://demowebshop.tricentis.com/");
		WebElement vote = driver.findElement(By.xpath("//input[@value='Vote']"));
		System.out.println(vote);
		driver.navigate().refresh();
		System.out.println(vote);
		vote= driver.findElement(By.xpath("//input[@value='Vote']"));
		vote.click();
	}
}
