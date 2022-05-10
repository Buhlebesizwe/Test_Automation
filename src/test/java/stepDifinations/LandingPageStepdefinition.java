package stepDifinations;

import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import pageObjects.LandingPage;


public class LandingPageStepdefinition {
	
	public LandingPage landingPage;
	TextContextSetup textContextSetup;
	
	public LandingPageStepdefinition(TextContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		this.landingPage = textContextSetup.pageObjectManager.getLandingPage();
	}
	@Given("User is on GreenCart Landing page")
	public void user_is_on_green_cart_landing_page() {
		Assert.assertTrue(landingPage.getTitleLandingPage().contains("GreenKart"));
	}

	@When("^user searched with shortname (.+) and etracted the actual name of the product$")
	public void user_searched_with_shortname_and_etracted_the_actual_name_of_the_product(String shortName)
			throws InterruptedException {
		landingPage.searchItem(shortName);
		Thread.sleep(2000);
		textContextSetup.landingPageProductName = landingPage.getProductName();
		System.out.println(textContextSetup.landingPageProductName + " is extracted from home page");
	}
	 @When("^Added \"([^\"]*)\" items of the selected product to cart$")
	    public void added_items_of_the_selected_product_to_cart(String quantity) throws Throwable {
	        landingPage.incrementQuantity(Integer.parseInt(quantity));
	        landingPage.addToCart();
	        
	    }
}
