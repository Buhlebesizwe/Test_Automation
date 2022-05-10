package cucumberOptions;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "@target/failed_scenarios.txt", 
				glue = "stepDifinations"
		, monochrome = true,
		plugin= {"html:target/cucumber.html", "json:target/cucumber.jason",
				"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})
public class FailedNGTestRunner extends AbstractTestNGCucumberTests {
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios(){
		return super.scenarios();
	}
}
