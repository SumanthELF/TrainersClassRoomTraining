package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Woodland Men's shoes",Keys.ENTER);
		driver.findElement(By.linkText("Mens G 40777cma Sneaker")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		
		for(String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}
		Thread.sleep(2000);
		String priceDetails = driver.findElement(By.id("corePrice_desktop")).getText();
		String price = "";
		for(char ch : priceDetails.toCharArray()) {
			if(ch>'0' && ch<'9') {
				price = price + ch;
			}
		}
		if(Integer.parseInt(price)<5000) {
			driver.findElement(By.name("dropdown_selected_size_name")).click();
			driver.findElement(By.id("native_size_name_3")).click();
			driver.findElement(By.id("add-to-cart-button")).click();
		}
		
	}
}

