package scripting;

import org.testng.annotations.Test;

import pomRepo.HomePage;
import pomRepo.WishListPage;
import unitTestingTool.BaseTest;

public class TC_ShoopperLogin_001 extends BaseTest{

	@Test
	public void removeProductFromWishList() {
		homePage = new HomePage(driver);
		homePage.getAccountSetting().click();
		homePage.getWishList().click();
		
		WishListPage wishListPage = new WishListPage(driver);
		wishListPage.getRemoveFromWishListButton().click();
	}
}
