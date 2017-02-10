package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonPage;

public class Payments extends CommonPage{
	
	
	//shipping Address Web Elements
	
	public Payments(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}


	@FindBy(id="shippingfirstname")
	private WebElement SFirstName;
	
	@FindBy(id="shippinglastname")
	private WebElement SLastName;
	
	@FindBy(id="shippingcompany")
	private WebElement ScompanyName;
	
	@FindBy(id="shippingaddress1")
	private WebElement SAddress1;
	
	@FindBy(id="shippingaddress2")
	private WebElement SAddress2;
	
	@FindBy(id="shippingpostalcode")
	private WebElement Szipcode;
	
	

	@FindBy(id="shippingcity")
	private WebElement Scity;
	
	@FindBy(id="shippingstate_1")
	private WebElement SState;
	
	@FindBy(id="shippingpostalcode")
	private WebElement SzipCode;
	
	@FindBy(id="shippingcountryID")
	private WebElement ScountryID;
	
	@FindBy(id="shippingphonenumber")
	private WebElement SPhoneNumber;
	
	
	
	
	// Card Details  Web Elements
	@FindBy(id="creditCardNumber")
	private WebElement CardNumber;
	
	

	@FindBy(id="creditCardMonth")
	private WebElement CardMonth;
	
	@FindBy(id="creditCardYear")
	private WebElement CardYear;
	
	@FindBy(id="creditcardname")
	private WebElement CCName;
	
	@FindBy(id="creditcardcvv2")
	private WebElement CCcvv;
	
	@FindBy(id="delEditCard")
	private WebElement CheckBoxCC;
	
	
	//Functions for filling shipping address.
	
public void FillingShippingAddress(String firstname,String lastname,String companyname,String address1,String address2,String zipcode  ){
		
		sendText(SFirstName,firstname );
		sendText(SLastName,lastname );
		sendText(ScompanyName,companyname );
		sendText(SAddress1,address1 );
		sendText(SAddress2,address2 );
		sendText(Szipcode,zipcode );
		
		//clickElement(loginBtn);
	}
	
	
	
	
	
	
	
}
