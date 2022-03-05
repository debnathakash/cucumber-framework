package stepDefinition;

import static org.testng.Assert.assertEquals;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class CreateNewContact {

	public static WebDriver driver;
	public static Properties prop;
	
	@Given("^user opens correct browser$")
	public void user_opens_correct_browser() throws Exception {
		driver = BaseClass.getDriver();
		prop = BaseClass.prop;
	}
	
	@When("^user gives proper URL$")
	public void user_gives_proper_URL() throws Exception {
		driver.get(prop.getProperty("URL"));
		Thread.sleep(3000L);
		//String actual = driver.findElement(By.xpath("//a[text()='Forgot your password?']")).getText();
		//Assert.assertEquals(actual, "Forgot your password?");
		//Assert.assertEquals(actual, actual);
	}
	
	@Then("^user gives username and password$")
	public void user_gives_username_and_password() throws Exception {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys(prop.getProperty("userName"));
		Thread.sleep(4000L);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(prop.getProperty("password"));
	}
	
	@Then("^User clicks on login button$")
	public void User_clicks_on_login_button() throws Exception {
		//driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(2000L);
	}
	
	@Then("^user is logged in successfully$")
	public void user_is_logged_in_successfully() throws Exception {
		Thread.sleep(2000L);
		Assert.assertEquals(driver.findElement(By.xpath("//*[text()='Akash T Solutions']")).isDisplayed(), true);
		
	}
	
	@When("^user click on contact$")
	public void user_click_on_contact() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    driver.findElement(By.linkText("Contacts")).click();
	}

	@Then("^new button should be displayed$")
	public void new_button_should_be_displayed() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).isDisplayed(), true);
		////*[@id="dashboard-toolbar"]/div[2]/div/a/button
	    if (driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).isDisplayed()) {
	    	driver.findElement(By.xpath("//*[@id=\"dashboard-toolbar\"]/div[2]/div/a/button")).click();	
		}
	    
	    Thread.sleep(5000L);
	         
	}
	
	@Then("^user enters all the required fields$")
    public void user_enters_all_the_required_fields(DataTable tabledata) throws Exception {
        List<List<String>> data = tabledata.raw();
        
        driver.findElement(By.xpath("//input[@name='first_name']")).sendKeys(data.get(0).get(0));
        driver.findElement(By.xpath("//input[@name='last_name']")).sendKeys(data.get(0).get(1));
        driver.findElement(By.xpath("//input[@name='middle_name']")).sendKeys(data.get(0).get(2));
        driver.findElement(By.xpath("//*[@placeholder='Email address']")).sendKeys(data.get(0).get(3));
        driver.findElement(By.xpath("//div[@name='company']/input")).sendKeys(data.get(0).get(4));
        Thread.sleep(1000L);
        driver.findElement(By.xpath("//div[@name='company']/i")).click();
        
        //driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
        
    }  
	
	
	@When("^user clicks on save button$")
	public void user_clicks_on_save_button() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.xpath("//button[@class='ui linkedin button']")).click();
		Thread.sleep(3000L);
	}
	
	@Then("^contact should be saved successfully$")
	public void contact_should_be_saved_successfully() {
	    // Write code here that turns the phrase above into concrete actions
	    //Assert.assertEquals(driver.findElement(By.xpath("//button[@class='ui button icon']/i")).isDisplayed(), true);
	    //Assert.assertEquals(driver.findElement(By.xpath("//i[@class='large user red icon']")).getText(), "Elston Desa");
		Assert.assertEquals(driver.findElement(By.xpath("//p[text()='Diago']")).getText(), "Diago");
		/*
		 * if (driver.findElement(By.xpath("//p[text()='Diago']")).getText().
		 * equalsIgnoreCase("Diago")) { System.out.println("Test case passed"); }
		 */
	}
	//
}
