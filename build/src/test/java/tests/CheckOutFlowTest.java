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
		
		// searching for first product with quantity one 1
		
		homepage.enterSearchDataAndAddItToCart("Suede Kohler K66266U","1");
		
		// searching for second product with quantity one 1
		
		homepage.enterSearchDataAndAddItToCart("Cashmere Kohler K66266U","1");
		// searching for third product with quantity two
		
		homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST","2");
		//homepage.enterSearchDataAndAddItToCart("Kohler K-5180-ST");
		homepage.clickOnCartBtn();
		// filling shipping and card details if the user not saved any information shipping information
		ReviewOrder.FillingShippingAddress( "firstname","String lastname","companyname","String address1","String address2","32423","24234243234" );
		/*
		Many Florida citizens are not aware that this Florida has a "use tax." Use tax normally applies to items purchased outside Florida which are brought or delivered into the state and would have been taxed if purchased in Florida. This includes purchases made over the internet. The use tax rate is the same as the sales tax rate, 6%. Build.com is an out-of-state seller so it is your responsibility to comply with Florida law. You must submit payment directly to the Florida Department of Revenue. This payment is required by section 212.06(8), Florida Statutes. You can file and pay use tax online or complete an Out-of-State Purchase Return (Form DR-15MO).
		*/
		float tax = (float) 0;
		
		// asserting grand tax and grand total.
		// in Florida the good of florida doesnot have any tax
		Assert.assertEquals(homepage.tax(), tax);
		
		Assert.assertEquals(homepage.totalActual(), homepage.totalExpected());
		
	}
	
}


