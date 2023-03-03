package screenShot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Zomato {

	public static void main(String[] args) throws InterruptedException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.zomato.com/bangalore/marathahalli-restaurants");
		Thread.sleep(3000);
		File elementScreenshot = driver.findElement(By.xpath("//img[@alt=\"Domino's Pizza\"]/../../../../../..")).
				getScreenshotAs(OutputType.FILE);
		FileHandler.copy(elementScreenshot, new File("./errorshots/zomatoImg1.jpeg"));
//		driver.findElement(By.linkText("Start teaching today")).click();
	}

}
