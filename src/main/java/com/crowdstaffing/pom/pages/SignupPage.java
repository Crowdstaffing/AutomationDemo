package com.crowdstaffing.pom.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.crowdstaffing.pom.base.BasePage;
import com.crowdstaffing.pom.util.Constants;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class SignupPage extends BasePage {
	WebDriverWait wait = new WebDriverWait(driver, 30);
	private By usrName = By.xpath("//input[@name='user.login']");
	private By passWord = By.xpath("//input[@name='user.password']");
	private By logIn = By.xpath("//button[text()='LOGIN']");	
	private By humbergerMenu = By.xpath("//div[@class='sc-cSFexR gTFDsB']");
	private By systemAdministration = By.xpath("(//div[@class='cursor-pointer text-cs-gray-5'])[5]");
	private By clientManagement = By.xpath("(//span[@class='sc-hIpXjV gLPgBw'])[2]");
	
    public void logIn(ExtentTest test) throws Throwable {
		test.log(LogStatus.INFO, "Sign into Crowdstaffing");
		wait.until(ExpectedConditions.visibilityOfElementLocated(usrName)).sendKeys(Constants.STAGE_USERNAME);
		wait.until(ExpectedConditions.visibilityOfElementLocated(passWord)).sendKeys(Constants.STAGE_PASSWORD);
		wait.until(ExpectedConditions.visibilityOfElementLocated(logIn)).click();
	}
	public void homePage(ExtentTest test) throws Throwable {
		test.log(LogStatus.INFO, "Humberger Menu");
		//Thread.sleep(10000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(humbergerMenu)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(systemAdministration)).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(clientManagement)).click();
	}
	
	
	
		
}