package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/***
 * 
 * @author Sumanth
 *
 */
public class Actitime_001 {   // test case id

	public static void main(String[] args) {

		// Expected Data
		String usernameData = "admin";
		String passwordData = "manager";
		String expectedLoginPageTitle = "actiTIME - Login";
		String expectedHomePageTitle = "actiTIME - Enter Time-Track";

		// Step 1: Open the browser
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();      // to perform cross browser testing
		System.out.println("Browser is launched");  // OOAD  
		driver.manage().window().maximize();
		System.out.println("Browser is maximized");

		// Step 2:Enter the Test URL and click on 'Enter' button
		driver.get("https://demo.actitime.com/login.do");
		String actualLoginPageTitle = driver.getTitle();
		if (expectedLoginPageTitle.equals(actualLoginPageTitle)) {
			System.out.println("Login page is displayed successfully");
		} else {
			System.out.println("Login page is not displayed");
		}

		// Step 3: Click on the 'Username' Text field and provide the input
		WebElement usernameTextField = driver.findElement(By.id("username"));
		usernameTextField.clear();
		usernameTextField.sendKeys(usernameData);
		String actualDataEnteredInUsernameTextField = usernameTextField.getAttribute("value");
		if (actualDataEnteredInUsernameTextField.equals(usernameData)) {
			System.out.println("Username Text field accepted the test data");
		} else {
			System.out.println("Username Text field failed to accept the test data");
		}

		// Step 4: Click on the 'Password' Text field and provide the input
		WebElement passwordTextField = driver.findElement(By.name("pwd"));
		passwordTextField.clear();
		passwordTextField.sendKeys(passwordData);
		String actualDataEnteredInPasswordTextField = passwordTextField.getAttribute("value");
		if (actualDataEnteredInPasswordTextField.equals(passwordData)) {
			System.out.println("Password Text field accepted the test data");
		} else {
			System.out.println("Password Text field failed to accept the test data");
		}
		
		//Step 5: Click on 'Login' button
		driver.findElement(By.id("loginButton")).click();
		String actualHomePageTitle = driver.getTitle();
		if(expectedHomePageTitle.equals(actualHomePageTitle)) {
			System.out.println("Home page is displayed successfully");
		}else {
			System.out.println("Home page is not displayed");
		}
	}
}
