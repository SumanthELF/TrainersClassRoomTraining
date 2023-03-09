package crossBrowser;

import org.testng.annotations.Test;

public class Zomato extends BaseClassTest{

	@Test
	public void launchZomato() {
		driver.get("https://www.zomato.com/bangalore");
	}
}
