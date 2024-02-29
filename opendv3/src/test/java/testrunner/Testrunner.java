package testrunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"src/test/resources/Features/v3login.feature"
		                    },
                 glue = "Stepdefinitions",
                 dryRun = true,
                 monochrome = true,
                 plugin = "html:test-output/log-test-data" 
		        )

public class Testrunner 
{
  
}