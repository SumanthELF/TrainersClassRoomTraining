package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//button[@aria-label='Account settings']")
	private WebElement accountSetting;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logout;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;

	@FindBy(xpath="//li[text()='Wish List']")
	private WebElement wishList;

	public WebElement getAccountSetting() {
		return accountSetting;
	}

	public WebElement getLogout() {
		return logout;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getWishList() {
		return wishList;
	}
	
	
}
