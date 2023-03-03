package basics;

import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchEmptyFirefox {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\user\\Downloads\\geckodriver-v0.32.0-win64 (1)\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
	}

}
