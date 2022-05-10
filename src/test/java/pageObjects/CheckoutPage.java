package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
	public WebDriver driver;
	public CheckoutPage(WebDriver driver) {
		 this.driver = driver;
	}
	 private By cartBag = By.cssSelector("img[alt='Cart']");
	 private By checkOutButton = By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']");
	 private By promoButton = By.cssSelector(".promoBtn");
	 private By placeOrder = By.xpath("//button[normalize-space()='Place Order']");

	 
	 public void checkoutItems() {
		 driver.findElement(cartBag).click();
		 driver.findElement(checkOutButton).click();
	 }
	 public boolean verifyPromoButton() {
		return driver.findElement(promoButton).isDisplayed();
	 }
	 public boolean verifyPlaceOrder() {
			return driver.findElement(placeOrder).isDisplayed();
		 }
}
