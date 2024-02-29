package takescreen;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListner extends BaseClass implements ITestListener{

	@Override
	public void onTestFailure(ITestResult result) {
		try {
			captureScreenShot(result.getTestName()+".jpg");
		} catch (IOException e) {
			
			e.printStackTrace();
		}
	}
	
	

}
