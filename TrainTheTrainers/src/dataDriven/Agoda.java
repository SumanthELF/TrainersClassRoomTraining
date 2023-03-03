package dataDriven;

import java.io.FileInputStream;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Agoda {

	public static void main(String[] args) throws Exception {
		FileInputStream propertyFis = new FileInputStream("./testData/testData.properties");
		Properties prop = new Properties();
		prop.load(propertyFis);

		FileInputStream excelFis = new FileInputStream("./testData/testData.xlsx");
		Workbook workbook = WorkbookFactory.create(excelFis);
		Row testDataRow1 = workbook.getSheet("Agoda").getRow(1);

		// Test Data
		String testUrl = (String) prop.get("url");
		String from = testDataRow1.getCell(0).getStringCellValue();
		from = "" + from.substring(0, 1).toUpperCase() + from.substring(1, from.length()).toLowerCase();
		String to = testDataRow1.getCell(1).getStringCellValue();
		to = "" + to.substring(0, 1).toUpperCase() + to.substring(1, to.length()).toLowerCase();
		LocalDateTime departureDate = testDataRow1.getCell(2).getLocalDateTimeCellValue();
		int noOfPassengers = (int) testDataRow1.getCell(3).getNumericCellValue();
		String month = departureDate.getMonth().name();
		month = "" + month.charAt(0) + month.substring(1, 3).toLowerCase();
		int day = departureDate.getDayOfMonth();
		int year = departureDate.getYear();

		// Step 1: Open the browser and enter the Url
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		WebDriverWait explicitWait = new WebDriverWait(driver, 15);
		Actions action = new Actions(driver);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		driver.get(testUrl);
		explicitWait
				.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//button[@aria-label='Close Message']")));
		driver.findElement(By.xpath("//button[@aria-label='Close Message']")).click();

		// Step 2: Click on flights
		driver.findElement(By.id("tab-flight-tab")).click();

		// Step 3: Enter data into From and To text field
		driver.findElement(By.id("flight-origin-search-input")).sendKeys(from);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@aria-label,'" + from + "')]")));
		driver.findElement(By.xpath("//li[contains(@aria-label,'" + from + "')]")).click();
		driver.findElement(By.id("flight-destination-search-input")).sendKeys(to);
		explicitWait
				.until(ExpectedConditions.elementToBeClickable(By.xpath("//li[contains(@aria-label,'" + to + "')]")));
		driver.findElement(By.xpath("//li[contains(@aria-label,'" + to + "')]")).click();

		// Step 4: Selecting the given date
		for (;;) {
			try {
				driver.findElement(By.xpath("//div[contains(@aria-label,'" + month + " " + day + " " + year + "')]"))
						.click();
				break;
			} catch (NoSuchElementException e) {
				driver.findElement(By.xpath("//span[@aria-label='Next Month']")).click();
			}
		}

		// Step 5: Selecting the number of passangers
		if (noOfPassengers == 1) {
			action.click().perform();
		} else {
			while (noOfPassengers > 1) {
				driver.findElement(By.xpath("//button[@data-element-name='flight-occupancy-adult-increase']")).click();
				noOfPassengers--;
			}
		}

		// Step 6: Click on Search Button
		driver.findElement(By.xpath("//button[@data-selenium='searchButton']")).click();

		// Step 7: Counting the number of flights
		for (;;) {
			try {
				if (driver.findElement(By.xpath("//span[contains(@class,'OutboundList__loadingMore')]"))
						.isDisplayed()) {
					js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				} else {
					break;
				}
			} catch (Exception e) {
				js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
				break;
			}

		}
		List<WebElement> totalNumberOfFlights = driver.findElements(
				By.xpath("//div[@data-component='flight-card-container']//span[@data-component='mob-flight-price']"));
		System.out.println("The total number of flights availabel from " + from + " to " + to + " is "
				+ totalNumberOfFlights.size());
		List<Double> costOfFlight = new ArrayList<>();
		for (WebElement eachFlightPrice : totalNumberOfFlights) {
			costOfFlight.add(Double.parseDouble(eachFlightPrice.getText().replace(",", "")));
		}
		Collections.sort(costOfFlight);
		System.out.println("The lowest flight cost is " + costOfFlight.get(0));
	}

}
