package Utils;

import org.openqa.selenium.WebDriver;

import pageObjects.PageObjectManager;


public class TextContextSetup {
	public WebDriver driver;
	public String landingPageProductName;
	public PageObjectManager pageObjectManager;
	public TestBase testBase;
	public GenericUtils genericUtils;
	
	public TextContextSetup(){
		testBase = new TestBase();
		pageObjectManager = new PageObjectManager(testBase.WebdriverManager());
		genericUtils = new GenericUtils(testBase.WebdriverManager());
		
	}
}
