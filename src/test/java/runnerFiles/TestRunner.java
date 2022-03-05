package runnerFiles;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ={"src/test/java/features"},glue ="stepDefinition",tags = "@tag",plugin = {"pretty","html:target/CucumberReports"})
public class TestRunner {

}
