package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.HomePage;
import pages.Payments;

public class CheckOutFlowTest {

	HomePage homepage = new HomePage();
	Payments ReviewOrder = new Payments();
	
	@Test
	public void verifyCheckOutFlow(){
	
		homepage.navigateToUrl();
		homepage.enterSearchDataAndAddItToCart("Suede Kohler K66266U","1");
		
		homepage.enterSearchDataAndAddItToCart("Cashmere Kohler K66266U","1");
		
		
		homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST","2");
		//homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST");
		homepage.clickOnCartBtn();
		
		ReviewOrder.FillingShippingAddress( "firstname","String lastname","companyname","String address1","String address2","32423","24234243234" );
		
		float tax = (float) 0;
		
		
		// in Florida the good of florida doesnot have any tax
		Assert.assertEquals(homepage.tax(), tax);
		
		Assert.assertEquals(homepage.totalActual(), homepage.totalExpected());
		
	}
	
}


