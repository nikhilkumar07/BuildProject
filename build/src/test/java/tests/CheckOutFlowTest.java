package tests;

import org.testng.annotations.Test;

import common.WebTest;
import pages.HomePage;

public class CheckOutFlowTest extends WebTest {
	
	
	@Test
	public void verifyCheckOutFlow() throws InterruptedException{
		HomePage homepage = new HomePage(getDriver());
		homepage.navigateToUrl();
		homepage.enterSearchDataAndAddItToCart("Suede Kohler K66266U");
		homepage.enterSearchDataWithQuantityAddItToCart("Kohler K-5180-ST");
		homepage.enterSearchCashmereIteamAndAddItToCart("Cashmere Kohler K66266U");
		homepage.clickOnCartBtn();
	}
	
}


