package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromPropertyFile {

	public static void main(String[] args) throws IOException {
		
		//Creation of Input stream /reader 
		FileInputStream fis = new FileInputStream("./testData/testData.properties");
		
		//Creation of file type object
		Properties prop = new Properties();
		
		//Read methods
		prop.load(fis);
		String testUrl = (String) prop.get("url");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(testUrl);
//		System.out.println(prop.get("username"));
//		System.out.println(prop.get("password"));
	}

}
