package pomRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class MyProfilePage {

	public MyProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
}
