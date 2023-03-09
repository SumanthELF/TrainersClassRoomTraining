package crossBrowser;

import org.testng.annotations.Test;

public class Swiggy extends BaseClassTest{

	@Test
	public void launchSwiggy() {
		driver.get("https://www.swiggy.com/");
	}
}
