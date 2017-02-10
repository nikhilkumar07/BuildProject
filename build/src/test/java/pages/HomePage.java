package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import common.CommonPage;

public class HomePage  extends CommonPage{

	public HomePage(WebDriver driver) {
			super(driver);
	}
	
	@FindBy(id = "search_txt")
	private WebElement searchBar;
	
	@FindBy(css = "button[class='button-primary search-site-search']")
	private WebElement searchBarImg;
	
	@FindBy(id = "add-to-cart-wrap")
	private WebElement addToCartBtn;
	
	@FindBy(xpath = "//input[@type='number']")
	private WebElement quantityText ;
		
	@FindBy(xpath = "//span[contains(text(),'Cart')]")
	private WebElement CartBtn;
				
	public void navigateToUrl(){
		getUrl("https://www.build.com");
	}
	
	public void enterSearchDataAndAddItToCart(String data) throws InterruptedException{
		pageToLoad(searchBar);
		sendText(searchBar, data);
		clickElement(searchBarImg);
		pageToLoad(addToCartBtn);
		clickElement(addToCartBtn);
		
	}
		
	public void enterSearchDataWithQuantityAddItToCart(String data) throws InterruptedException{
		pageToLoad(searchBar);
		sendText(searchBar, data);
		clickElement(searchBarImg);
		pageToLoad(quantityText);
		clearText(quantityText);
		sendText(quantityText,"2");
		clickElement(addToCartBtn);
		
	}
	
	public void clickOnCartBtn() throws InterruptedException{
		pageToLoad(CartBtn);
		clickElement(CartBtn);
	}
	
	public void enterSearchCashmereIteamAndAddItToCart(String data) throws InterruptedException{
		pageToLoad(searchBar);
		sendText(searchBar, data);
		clickElement(searchBarImg);
		pageToLoad(addToCartBtn);
		clickElement(addToCartBtn);	
	}
	
	
}
