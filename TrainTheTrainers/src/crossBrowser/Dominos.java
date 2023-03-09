package crossBrowser;

import org.testng.annotations.Test;

public class Dominos extends BaseClassTest{

	@Test
	public void launchDominos() {
		driver.get("https://pizzaonline.dominos.co.in/");
	}
}
