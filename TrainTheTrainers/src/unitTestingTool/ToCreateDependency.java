package unitTestingTool;

import org.testng.Reporter;
import org.testng.annotations.Test;


public class ToCreateDependency {

	@Test
	public void createAccount() {
		Reporter.log("Account created Successfully",true);
	}
	
	@Test(dependsOnMethods="createAccount")
	public void editAccount() {
		int i =1/0;
		Reporter.log("Account edited Successfully",true);
	}
	
	@Test(priority=-10,dependsOnMethods = {"createaccount","editAccount"})
	public void deleteAccount() {
		Reporter.log("Account deleted Successfully",true);
	}
}
