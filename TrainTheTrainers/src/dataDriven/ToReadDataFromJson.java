package dataDriven;

import java.io.FileReader;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToReadDataFromJson {

	public static void main(String[] args) throws IOException, ParseException {
		//FR
		FileReader fr = new FileReader("./testData/testData.json");
		
		//Object of File type
		JSONParser parser = new JSONParser();
		JSONObject json = (JSONObject) parser.parse(fr);
		
		//read methods
		String testUrl = (String) json.get("url");
		
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		driver.get(testUrl);
		
		System.out.println(json.get("carName"));
		System.out.println(json.get("price"));
	}

}
