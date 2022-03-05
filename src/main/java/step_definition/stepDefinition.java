package step_definition;

import java.io.FileInputStream;
import java.util.List;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class stepDefinition {

	  public static WebDriver driver;
	  public static Properties prop;
	  @Given("^User is on login page$") public void user_is_on_login_page()
	  { 
	  /*System.setProperty("webdriver.chrome.driver",
	  System.getProperty("user.dir")+"\\drivers\\chromedriver.exe"); WebDriver
	  driver = new ChromeDriver(); driver.manage().window().maximize();
	  driver.get("https://ui.cogmento.com");*/
		  }
	  
	  @When("^User enters the username and password") 
	  public void user_enters_the_username(DataTable dataSet){ 
		  List<List<String>> data =  dataSet.raw();
		  System.out.println("username is "+data.get(0).get(0));
		   }
	  
	  @When("^User clicks on Login button$") public void
	  user_clicks_on_login_button() {  
		  
	  }
	  
	  @Then("^User logs into the application successfully$") public void
	  user_logs_into_the_application_successfully() { 
		  
	  }
	  
	  @And("^User enters the \"([^\"]*)\"$") 
	  public void user_enters_the_password(String Arg1)
	  {  
	  }
	  
	  @When("^User enters the following details (.+) and (.+)$")
	    public void user_enters_the_and(String usernamedetails, String password) throws Throwable {
	        System.out.println("username details are "+usernamedetails+" password "+password);
	    }
	  
	  @Given("^User opens correct browser$")
	    public void user_opens_correct_browser() throws Throwable {
	        prop = new Properties();
	        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\application.properties");
	        prop.load(fis);
	        if (prop.getProperty("BrowserName").equalsIgnoreCase("chrome")) {
	        	System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"\\drivers\\chromedriver.exe"); 
	            driver = new ChromeDriver(); 
	            driver.manage().window().maximize();
			}
	    }

	    @When("^User navigates to correct url$")
	    public void user_navigates_to_correct_url() throws Throwable {
	        driver.get(prop.getProperty("URL"));
	    }

	    @Then("^Validate user is on correct url$")
	    public void validate_user_is_on_correct_url() throws Throwable {
	        String urlNavigated = driver.getCurrentUrl();
	        if(urlNavigated.equalsIgnoreCase("https://ui.cogmento.com/")) {
	        	System.out.println("passed the url check");
	        }
	        else {
	        	System.out.println("failed the url check");
	        }
	    }
	 
}
