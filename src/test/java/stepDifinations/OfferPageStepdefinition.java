package stepDifinations;


import org.testng.Assert;

import Utils.TextContextSetup;
import io.cucumber.java.en.Then;
import pageObjects.LandingPage;
import pageObjects.OffersPage;

public class OfferPageStepdefinition {
	public String offerPageProductName;
	TextContextSetup textContextSetup;
	OffersPage offersPage;
	// single responsibility principle
	// loosely coupled
	// Factory design patterns

	public OfferPageStepdefinition(TextContextSetup textContextSetup) {
		this.textContextSetup = textContextSetup;
	}

	public void switchOffersPage() {
		// if switched already switched skip the below part
			LandingPage landingPage = textContextSetup.pageObjectManager.getLandingPage();
			landingPage.selectTopDealsPage();
			textContextSetup.genericUtils.switchTochild();
	}

	@Then("^user searched for the (.+) shortname in offers page$")
	public void user_searched_for_the_shortname_in_offers_page(String shortName) throws InterruptedException {
		switchOffersPage();
		OffersPage offersPage = textContextSetup.pageObjectManager.getOffersPage();
		offersPage.searchItem(shortName);
		
		Thread.sleep(2000);
		offerPageProductName = offersPage.getProductName();

	}

	@Then("validate product name in offers page matches with landing page")
	public void validate_product_name_in_offers_page_matches_with_landing_page() {
		Assert.assertEquals(offerPageProductName, textContextSetup.pageObjectManager.getOffersPage().getProductName());
	}
}
