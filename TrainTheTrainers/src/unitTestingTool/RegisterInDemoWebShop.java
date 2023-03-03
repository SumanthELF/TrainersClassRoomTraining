package unitTestingTool;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class RegisterInDemoWebShop {

	@DataProvider(name = "register")
	public String[][] testData() {
		String[][] reg = { { "male", "adminXyz", "xyzAdmin", "adminxyza@gmail.com", "X@admin", "X@admin" },
				/*
				 * { "female", "adminMno", "mnoAdmin", "adminmnob@gmail.com", "M@admin",
				 * "M@admin" }, { "male", "adminTuv", "tuvAdmin", "admintuvc@gmail.com",
				 * "T@admin", "T@admin" }
				 */ };
		return reg;
	}

	@Test(dataProvider = "register")
	public void login(String[] registerationDetails) throws InterruptedException {
		// Expected Data
		String homePageTitle = "";
		String registerPageTitle = "";
		String registerResultPage = "";

		// Step 1 : Open the browser and enter the url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		Reporter.log("Browser Launched Successfully", true);
		driver.manage().window().maximize();
		Reporter.log("Browser Window is maximized", true);
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		SoftAssert softAssert = new SoftAssert();

		driver.get("https://demowebshop.tricentis.com/");
		softAssert.assertEquals(driver.getTitle(), homePageTitle, "Failed to Navigate to Home page");
		Reporter.log("Navigated to Home page Successfully", true);

		// Step 2: Click on Register link
		driver.findElement(By.linkText("Register")).click();
		softAssert.assertEquals(driver.getTitle(), registerPageTitle, "Failed to Navigate to Register page");
		Reporter.log("Navigated to Register page Successfully", true);

		// Step 3: Enter valid registration data into respective fields
		WebElement radioButton = driver.findElement(By.id("gender-" + registerationDetails[0] + ""));
		radioButton.click();
		softAssert.assertEquals(true, radioButton.isSelected(),
				"Failed to select " + registerationDetails[0] + " radio button");
		Reporter.log(registerationDetails[0] + " radio button is selected", true);

		WebElement firstNameTextField = driver.findElement(By.id("FirstName"));
		firstNameTextField.clear();
		firstNameTextField.sendKeys(registerationDetails[1]);
		softAssert.assertEquals(firstNameTextField.getAttribute("value"), registerationDetails[1], "First Name is not entered");
		Reporter.log("First Name is entered Successfully", true);

		WebElement lastNameTextField = driver.findElement(By.id("LastName"));
		lastNameTextField.clear();
		lastNameTextField.sendKeys(registerationDetails[2]);
		softAssert.assertEquals(lastNameTextField.getAttribute("value"), registerationDetails[2], "Last Name is not entered");
		Reporter.log("Last Name is entered Successfully", true);

		WebElement emailTextField = driver.findElement(By.id("Email"));
		emailTextField.clear();
		emailTextField.sendKeys(registerationDetails[3]);
		softAssert.assertEquals(emailTextField.getAttribute("value"), registerationDetails[3], "Email is not entered");
		Reporter.log("Email is entered Successfully", true);

		WebElement passwordTextField = driver.findElement(By.id("Password"));
		passwordTextField.clear();
		passwordTextField.sendKeys(registerationDetails[4]);
		softAssert.assertEquals(passwordTextField.getAttribute("value"), registerationDetails[4], "Password is not entered");
		Reporter.log("Password is entered Successfully", true);

		WebElement confirmPasswordTextField = driver.findElement(By.id("ConfirmPassword"));
		confirmPasswordTextField.clear();
		confirmPasswordTextField.sendKeys(registerationDetails[5]);
		softAssert.assertEquals(confirmPasswordTextField.getAttribute("value"), registerationDetails[5], "Confirm Password is not entered");
		Reporter.log("Confirm Password is entered Successfully", true);

		// Step 4: Click on Register button
		WebElement registerButton = driver.findElement(By.id("register-button"));
		registerButton.click();
		softAssert.assertEquals(driver.getTitle(), registerResultPage, "Failed to Navigate to Home page");
		Reporter.log("Navigated to Register Result page Successfully", true);
		driver.quit();
	}
}
