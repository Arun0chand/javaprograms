package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions( features = "./features/arun.feature",
                  glue = "steps",
                  dryRun = false,
                  monochrome = true,
                  plugin = {"pretty","html:Report/login-data"}
		
		)


public class LoginRunner {

}
