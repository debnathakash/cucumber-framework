package step_definition;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class HooksDefinition {

	@Given("^I want to write a step with precondition$")
    public void i_want_to_write_a_step_with_precondition() throws Throwable {
        
    }

    @When("^I complete action$")
    public void i_complete_action() throws Throwable {
        
    }

    @Then("^I validate the outcomes$")
    public void i_validate_the_outcomes() throws Throwable {
        
    }

    @And("^some other precondition$")
    public void some_other_precondition() throws Throwable {
        
    }

    @And("^some other action$")
    public void some_other_action() throws Throwable {
        
    }

    @And("^yet another action$")
    public void yet_another_action() throws Throwable {
        
    }

    @And("^check more outcomes$")
    public void check_more_outcomes() throws Throwable {
        
    }
    
    @Given("^I want to write a step with (.+)$")
    public void i_want_to_write_a_step_with(String name) throws Throwable {
        System.out.println("the name is "+name);
    }

    @When("^I check for the (.+) in step$")
    public void i_check_for_the_in_step(String value) throws Throwable {
        System.out.println("the value is "+value);
    }

    @Then("^I verify the (.+) in step$")
    public void i_verify_the_in_step(String status) throws Throwable {
     System.out.println("the status is"+status);   
    }
	
}
