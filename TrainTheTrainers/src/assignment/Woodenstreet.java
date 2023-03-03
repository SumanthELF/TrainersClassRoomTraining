package assignment;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.chrome.ChromeDriver;

public class Woodenstreet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.woodenstreet.com/");
		int navBarIndex = 6;
		String categoryIndex = "3";
		String productIndex = "4";
		
		for(;;) {
			try {
				driver.findElement(By.id("loginclose1")).click();
				break;
			}catch(NoSuchElementException e) {
				Thread.sleep(1000);
			}
		}
		Thread.sleep(1000);
		driver.findElement(By.xpath("//nav[@class='menu']/ul/li["+navBarIndex+"]/a")).click();
		driver.findElement(By.xpath("//div[@class='top-list']/a["+categoryIndex+"]")).click();
		driver.findElement(By.xpath("//div[@class='load-product']/div[1]/div["+productIndex+"]/a")).click();
		String parentWindowId = driver.getWindowHandle();
		Set<String> allWindowIds = driver.getWindowHandles();
		allWindowIds.remove(parentWindowId);
		for (String windowId : allWindowIds) {
			driver.switchTo().window(windowId);
		}		
		Thread.sleep(2000);
		String capturedPrice = driver.findElement(By.xpath("//span[@class='offerprice']")).getText();
		String[] prices = capturedPrice.split("R");
		String priceOfTheProduct = prices[1].replace("s", "").replace(",", "").replace(" ", "");
		int price = Integer.parseInt(priceOfTheProduct);
		if(price<50000) {
			driver.findElement(By.id("button-cart-buy-now")).click();
		}else {
			System.out.println("The Product cost is tooo high !!!");
		}		
	}

}
