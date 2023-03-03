package elementMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToPerformCompatibilityTesting {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		WebElement emailTextField = driver.findElement(By.xpath("//input[contains(@placeholder,'Email address')]"));
		WebElement passwordTextField = driver.findElement(By.xpath("//input[@aria-label='Password']"));
		Rectangle emailRectObject = emailTextField.getRect();
		Rectangle passwordRectObject = passwordTextField.getRect();

		if (emailRectObject.getX() == passwordRectObject.getX()) {
			System.out.println("Both the elements is properly alligned to the Left");
		} else {
			System.out.println("Left Allignment Issue");
		}

		if (emailRectObject.getX() + emailRectObject.getWidth() == passwordRectObject.getX()
				+ passwordRectObject.getWidth()) {
			System.out.println("Both the elements is properly alligned to the Right");
		} else {
			System.out.println("Right Allignment Issue");
		}
		
		if(emailRectObject.getY()+emailRectObject.getHeight()+3 <= passwordRectObject.getY()) {
			System.out.println("Elements are not overlapping");
		} else {
			System.out.println("Element overlapping Issue");
		}
		
	}

}
