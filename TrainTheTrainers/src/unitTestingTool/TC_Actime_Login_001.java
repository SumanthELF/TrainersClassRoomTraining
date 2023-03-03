package unitTestingTool;

import org.testng.annotations.Test;

/**
 * 
 * @author Sumanth
 *
 */
public class TC_Actime_Login_001 {   // testNG class   

	@Test(priority=-3)
	public void invalidLogin() {     // test case
		System.out.println("Not a valid user");    // test steps
	}
	
	@Test(priority=2)
	public void ValidLogin() {    
		System.out.println("Hi Welcome to Advanced Selenium");    
	}
	
	@Test(priority=1)
	public void registerAndLogin() {    
		System.out.println("Congratulations....!!! Hi Welcome to Advanced Selenium");    
	}
	
	@Test
	public void createUser() {    
		System.out.println("User is created successfully");    
	}
	
	@Test(priority=1)
	public void deleteUser() {    
		System.out.println("User is deleted successfully");    
	}
}
