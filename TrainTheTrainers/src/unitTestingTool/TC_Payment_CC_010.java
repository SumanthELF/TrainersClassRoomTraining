package unitTestingTool;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TC_Payment_CC_010 extends BaseTest{

	@Test
	public void paymentWithCreditCard() {
		Reporter.log("Running test case",true);
		driver.findElement(By.partialLinkText("ELECTRONICS")).click();
	}
	
}
