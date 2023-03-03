package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToHandleSigleSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/signup");

		WebElement dayDropDown = driver.findElement(By.id("day"));
		WebElement monthDropDown = driver.findElement(By.id("month"));
		WebElement yearDropDown = driver.findElement(By.id("year"));
		Select daySelect = new Select(dayDropDown);
		Select monthSelect = new Select(monthDropDown);
		Select yearSelect = new Select(yearDropDown);
		
		daySelect.selectByIndex(0);
		monthSelect.selectByValue("10");
		yearSelect.selectByVisibleText("1982");
		List<WebElement> allMonthOptions = monthSelect.getOptions();
		for(WebElement month : allMonthOptions) {
			System.out.println(month.getText());
			monthSelect.selectByVisibleText(month.getText());
			Thread.sleep(500);
		}
		
		/*driver.findElement(By.id("month")).click();
		driver.findElement(By.xpath("//option[text()='Oct']")).click();
		driver.findElement(By.id("year")).click();
		driver.findElement(By.xpath("//option[text()='2011']")).click();*/
		
	}

}
