package stepDifinations;

import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.CheckoutPage;

public class checkoutPageStepdefinition {

	public CheckoutPage checkoutPage;
	TextContextSetup textContextSetup;

	public checkoutPageStepdefinition(TextContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
		this.checkoutPage = textContextSetup.pageObjectManager.getCheckoutPage();
	}

	@Then("^verify user has ability to enter promo code and place the order$")
	public void verify_user_has_ability_to_enter_promo_code_and_place_the_order() throws Throwable {

		Assert.assertTrue(checkoutPage.verifyPromoButton());
		Assert.assertTrue(checkoutPage.verifyPlaceOrder());

	}

	@Then("^User proceed to Checkout and validate the (.+) items in checkout page$")
	public void user_proceed_to_checkout_and_validate_the_items_in_checkout_page(String name) throws Throwable {
		checkoutPage.checkoutItems();
	}

}
