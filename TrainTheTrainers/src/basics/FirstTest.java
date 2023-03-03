package basics;

import org.testng.annotations.Test;

public class FirstTest {

	@Test(groups="smoke")
	public void run() {
		System.out.println("Hi it is working");
	}
}
