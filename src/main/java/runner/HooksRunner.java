package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features={"src/main/java/feature/demo.feature"},glue="step_definition",tags="@tag2",plugin= {"pretty","html:target/CucumberReports"})
public class HooksRunner {

}
