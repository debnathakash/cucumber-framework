package stepDefinition;

import org.openqa.selenium.WebDriver;

import cucumber.api.java.After;

public class Hooks {

	public static WebDriver driver;
	
	@After
	public void afterCreateContact() {
		this.driver = BaseClass.driver;
		driver.quit();
	}
}
