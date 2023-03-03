package mouseGeusters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToPerformDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		Actions actions = new Actions(driver);
		Thread.sleep(2000);

		// Photo Manager
		WebElement photoManagerFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'photo-manager')]"));
		driver.switchTo().frame(photoManagerFrame);
		WebElement image1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
		WebElement image2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		WebElement image3 = driver.findElement(By.xpath("//img[@alt='Planning the ascent']"));
		WebElement image4 = driver.findElement(By.xpath("//img[@alt='On top of Kozi kopka']"));
		WebElement trashBox = driver.findElement(By.id("trash"));
		WebElement gallery = driver.findElement(By.id("gallery"));
		actions.dragAndDrop(image1, trashBox).perform();
		actions.dragAndDropBy(image2, 500, 0).perform();
		actions.clickAndHold(image3).moveToElement(trashBox).release().perform();
		actions.moveToElement(image4).clickAndHold().moveToElement(trashBox).release().perform();
		Thread.sleep(3000);
		actions.dragAndDrop(image1, gallery).perform();
		Thread.sleep(500);
		actions.dragAndDrop(image2, gallery).perform();
		Thread.sleep(500);
		actions.dragAndDrop(image3, gallery).perform();
		Thread.sleep(500);
		actions.dragAndDrop(image4, gallery).perform();
		driver.switchTo().defaultContent();
		Thread.sleep(5000);

		// Accepted Elements
		driver.findElement(By.id("Accepted Elements")).click();
		WebElement acceptedElementFrame = driver
				.findElement(By.xpath("//iframe[contains(@data-src,'accepted-elements')]"));
		driver.switchTo().frame(acceptedElementFrame);
		WebElement draggableCantBeDropped = driver.findElement(By.id("draggable-nonvalid"));
		WebElement draggableCanBeDropped = driver.findElement(By.id("draggable"));
		WebElement dropBox = driver.findElement(By.id("droppable"));

		actions.dragAndDropBy(draggableCantBeDropped, 500, 0).perform();
		actions.clickAndHold(draggableCanBeDropped).moveToElement(dropBox).release().perform();
		driver.switchTo().defaultContent();

		//Propagation
		driver.findElement(By.id("Propagation")).click();
		WebElement propogationFrame = driver.findElement(By.xpath("//iframe[contains(@data-src,'propagation')]"));
		driver.switchTo().frame(propogationFrame); 																						// image1
		WebElement elementToBeDragged = driver.findElement(By.id("draggable")); 
		WebElement outerNotGreedy = driver.findElement(By.id("droppable"));
		WebElement innerNotGreedy = driver.findElement(By.id("droppable-inner"));
		WebElement outerGreedy = driver.findElement(By.id("droppable2"));
		WebElement innerGreedy = driver.findElement(By.id("droppable2-inner"));
		actions.dragAndDrop(elementToBeDragged, outerNotGreedy).perform();
		driver.switchTo().defaultContent();
		driver.quit();
	}
}