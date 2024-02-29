package arun;

import org.testng.annotations.DataProvider;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions( features = "src/test/resources/Parallel/arun.feature",
                  glue = "arun",
                  dryRun = false,
                  monochrome = true,
                  plugin = {"pretty","html:Report/login-data"}
		
		)


public class ParallelRunner  extends AbstractTestNGCucumberTests
{
	@Override
	@DataProvider(parallel = true)
	public Object[][] scenarios()
	{
		return super.scenarios();
	}
	
}





