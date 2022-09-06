package com.crowdstaffing.pom.testcases;

import java.io.IOException;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.crowdstaffing.pom.pages.SignupPage;
import com.crowdstaffing.pom.testcases.base.BaseTest;
import com.crowdstaffing.pom.util.Log;

public class Signout extends BaseTest {		
	public SignupPage signupTest;
	@Test(priority = 0)
	public void login() throws IOException, InterruptedException {
		//launchBrowser();
		startExtent = extent.startTest("End To End Scenario");
		Log.startLog("inventorySearch");
	//	signupTest.signout(startExtent, driver);
		Log.endLog("inventorySearch");
	}			
	
	@AfterMethod
	public void quit() {
		if (extent != null) {
			extent.endTest(startExtent);
			extent.flush();
		}
		if (driver != null) {
			try {
				driver.quit();
			} catch (Exception e) {
				driver.quit();
			}
		}
	}
}
