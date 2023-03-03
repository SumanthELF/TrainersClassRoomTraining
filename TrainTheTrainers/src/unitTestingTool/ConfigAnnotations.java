package unitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigAnnotations {

	@AfterSuite
	public void afterSuite() {
		Reporter.log("From After Suite", true);
	}
	
	@AfterSuite
	public void afterS() {
		Reporter.log("From After S", true);
	}
	
	@BeforeTest
	public void beforeTest() {
		Reporter.log("From before Test", true);
	}
	
	@AfterClass
	public void afterClass() {
		Reporter.log("From After class", true);
	}
	
	@Test
	public void delete() {
		Reporter.log("From the delete test case",true);
	}	
	
	@BeforeMethod
	public void beforeMethod() {
		Reporter.log("From before method", true);
	}
	
	@Test
	public void copy() {
		Reporter.log("From the copy test case",true);
	}	
	
	@AfterMethod
	public void afterMethod() {
		Reporter.log("From After method", true);
	}	
	
	@BeforeSuite
	public void beforeSuite() {
		Reporter.log("From before Suite", true);
	}
	
}

/*@BeforeClass
public void beforeClass() {
	Reporter.log("From before class", true);
}*/

/*@AfterTest
public void afterTest() {
	Reporter.log("From After Test", true);
}*/