package pomRepo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WishListPage {

	public WebDriver driver;
	
	public WishListPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	
	@FindBy(xpath="//button[text()='remove from wishlist?']")
	private WebElement removeFromWishListButton;

	public WebElement getRemoveFromWishListButton() {
		return removeFromWishListButton;
	}

	public void clickOnProduct(String productName) {
		driver.findElement(By.xpath("")).click();
	}
	
	
	
}
