package com.qoh332.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qoh332.base.TestBaseSetup;
import com.qoh332.common.pageobjects.BasePage;

import com.qoh332.common.pageobjects.SignInPage;

public class BasePageTest extends TestBaseSetup{
	
	private WebDriver driver;
	private SignInPage signInPage;
	
	
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
	
	@Test
	public void verifyHomePage() {
		System.out.println("Home page test...");
		BasePage basePage = new BasePage(driver);
		
		signInPage = basePage.clickSignInBtn();
		
		String me = signInPage.getSetupConfig();
		System.out.println("SignInpage config test = " + me);
		
		System.out.println("BasePage Title = " + basePage.getPageTitle());
		
		Assert.assertTrue(basePage.verifyBasePageTitle(), "Home page title doesn't match");
		
		System.out.println("Home Page title match was successful..");
		
		
		
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		System.out.println("SignInPage title match was successful..");
		
		//Skip this test for now.......
		//Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		//System.out.println("SignInPage Text match was successful..");
		
		Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");
		System.out.println("Login to Navigate was successful..");
		
		
		
		
	}

}