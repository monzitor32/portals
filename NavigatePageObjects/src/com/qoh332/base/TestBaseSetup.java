package com.qoh332.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class TestBaseSetup {

	private WebDriver driver;
	static String driverPath = "C:/chromedriver_win32/";
	String setupNavigate = "Navigate Setup";

	public WebDriver getDriver() {
		return driver;
	}

	private void setDriver(String browserType, String appURL) {
		switch (browserType) {
		case "chrome":
			driver = initChromeDriver(appURL);
			break;
		case "firefox":
			driver = initFirefoxDriver(appURL);
			break;
		default:
			System.out.println("browser : " + browserType
					+ " is invalid, Launching Firefox as browser of choice..");
			driver = initFirefoxDriver(appURL);
		}
	}

	private static WebDriver initChromeDriver(String appURL) {
		System.out.println("Launching google chrome with new profile..");
		System.setProperty("webdriver.chrome.driver", driverPath
				+ "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}

	private static WebDriver initFirefoxDriver(String appURL) {
		System.out.println("Launching Firefox browser..");
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to(appURL);
		return driver;
	}
	
	

	public String getSetupNavigate() {
		return setupNavigate;
	}

	@Parameters({ "browserType", "appURL" })
	@BeforeClass
	public void initializeTestBaseSetup(String browserType, String appURL) {
		try {
			setDriver(browserType, appURL);

		} catch (Exception e) {
			System.out.println("Error....." + e.getStackTrace());
		}
	}
	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}
}




//
//
//<!DOCTYPE suite SYSTEM "http://testng.org/testng-1.0.dtd">
//<suite name="Page Object test example">
//<parameter name="appURL" value="https://www.google.co.in/"/>
//<parameter name="browserType" value="firefox"/>
//  <test name="sample test">
//    <classes>
//      <class name="com.pack.common.tests.HomePageTest"/>
//      <class name="com.pack.common.tests.SignInPageTest"/>
//      <class name="com.pack.common.tests.CreateAnAccounTest"/>
//    </classes>
//  </test>
//</suite>
//
//

