package popups;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ToHandleFileUpload {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

		driver.get("https://www.naukri.com/");
		driver.findElement(By.id("register_Layer")).click();
		driver.findElement(By.xpath("//button[text()='Upload Resume']")).click();
		Runtime.getRuntime().exec("./autoItScripts/fileUpload.exe");
		 
//		Robot robot = new Robot();
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ALT);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyRelease(KeyEvent.VK_ALT);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
//		robot.keyPress(KeyEvent.VK_S);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_U);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_M);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_A);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_N);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_T);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_H);
//		
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_TAB);
//		Thread.sleep(1000);
//		robot.keyPress(KeyEvent.VK_ENTER);
//		Thread.sleep(1000);
//		
//		robot.keyRelease(KeyEvent.VK_S);
//		robot.keyRelease(KeyEvent.VK_U);
//		robot.keyRelease(KeyEvent.VK_M);
//		robot.keyRelease(KeyEvent.VK_A);
//		robot.keyRelease(KeyEvent.VK_N);
//		robot.keyRelease(KeyEvent.VK_T);
//		robot.keyRelease(KeyEvent.VK_H);
//		robot.keyRelease(KeyEvent.VK_TAB);
//		robot.keyRelease(KeyEvent.VK_ENTER);
	}

}
