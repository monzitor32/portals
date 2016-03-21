package com.custman.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.custman.base.TestBaseSetup;
import com.custman.common.pageobjects.BasePage;
import com.custman.logger.Log;
import org.apache.log4j.xml.DOMConfigurator;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


import java.util.concurrent.TimeUnit;


public class BasePageTest extends TestBaseSetup{
	
	private WebDriver driver;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	
	
	@Test
	public void verifyHomePage() {
	
		
	       // configure log4j properties file
	      PropertyConfigurator.configure("Log4j.properties");
		
		//DOMConfigurator.configure("log4j.xml");
		/////BasicConfigurator.configure();
		Log.startTestCase("Starting Portal test run");
		Log.info("Staring verify HomePage");
		Log.info("Home page test...");
		BasePage basePage = new BasePage(driver);
		
		Log.info("Start Base Test .....");
		Log.info("basePage verifyPageHeadingText result = " + basePage.verifyPageHeadingText());
		Log.info("basePage verifyWelcomeText result = " + basePage.verifyWelcomeText());
		Log.info("End Base Test .....");
		Log.endTestCase("End of Test RUN");
		
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
	}

}