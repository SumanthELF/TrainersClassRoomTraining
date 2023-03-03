package listbox;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class ToHandleMultiSelectListBox {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get("https://demoapp.skillrary.com/");
		
		WebElement multiListBox = driver.findElement(By.id("cars"));
		Select multiSelect = new Select(multiListBox);
		System.out.println(multiSelect.isMultiple());
		multiSelect.selectByValue("299");
		multiSelect.selectByIndex(0);
		System.out.println("First selected option : " +multiSelect.getFirstSelectedOption().getText());
		List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
		for(WebElement option : selectedOptions) {
			System.out.println(option.getText());
		}
		multiSelect.deselectByIndex(3);
		
//		driver.findElement(By.xpath("//option[text()='INR 50 - INR 99 ( 1 ) ']")).click();
//		driver.findElement(By.xpath("//option[text()='INR 200 - INR 299 ( 3 ) ']")).click();
	}

}
