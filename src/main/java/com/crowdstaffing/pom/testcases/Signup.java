package com.crowdstaffing.pom.testcases;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.crowdstaffing.pom.pages.SignupPage;
import com.crowdstaffing.pom.testcases.base.BaseTest;
import com.crowdstaffing.pom.util.Log;

public class Signup extends BaseTest {
	public SignupPage signupTest;

	@BeforeMethod
	public void startUpTest() {
		init("Chrome");
		signupTest = new SignupPage();
	}

	@Test(priority = 0)
	public void signUp() throws Throwable {
		startExtent = extent.startTest("End To End Scenario");
		Log.startLog("inventorySearchzz");
		signupTest.logIn(startExtent);
		signupTest.homePage(startExtent);
		Log.endLog("inventorySearch");
	}

}
