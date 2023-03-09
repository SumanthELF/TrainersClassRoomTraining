package crossBrowser;

import org.testng.annotations.Test;

public class FoodPanda extends BaseClassTest{

	@Test
	public void launchFoodPanda() {
		driver.get("https://www.foodpanda.com/");
	}
}
