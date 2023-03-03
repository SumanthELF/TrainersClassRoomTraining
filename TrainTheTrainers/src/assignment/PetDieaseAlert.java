package assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PetDieaseAlert {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		Actions actions = new Actions(driver);
		
		driver.get("https://petdiseasealerts.org/forecast-map");
		js.executeScript("window.scrollBy(0,450)");
		Thread.sleep(4000);
		WebElement frameElement = driver.findElement(By.xpath("//iframe[contains(@id,'map-instance')]"));
		driver.switchTo().frame(frameElement);
		String country = "florida";
		country = country.toLowerCase();
		By countryToClick = By.xpath("//*[name()='svg' and @id='map-svg']/*[name()='g']/*[name()='g']/*[name()='g' and @id='"
				+ country + "']");
		explicitWait.until(ExpectedConditions.elementToBeClickable(countryToClick));
		actions.moveToElement(driver.findElement(countryToClick), 35, 0).click().perform();
		
	}
}