package com.qoh332.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qoh332.base.TestBaseSetup;

import com.qoh332.common.pageobjects.BasePageNavigateQH;
import com.qoh332.common.pageobjects.SignInPageNavigateQH;

public class SignInPageTestNavigateQH extends TestBaseSetup{
private WebDriver driver;
private SignInPageNavigateQH signInPage;
private BasePageNavigateQH basePage;
	
	@BeforeClass
	public void setUp() {
		driver=getDriver();
	}
		
	@Test
	public void verifySignInFunction() {
		System.out.println("Sign In functionality details...");
		basePage = new BasePageNavigateQH(driver);
		signInPage = signInPage.clickSignInBtn();
		Assert.assertTrue(signInPage.verifySignInPageTitle(), "Sign In page title doesn't match");
		Assert.assertTrue(signInPage.verifySignInPageText(), "Page text not matching");
		Assert.assertTrue(signInPage.verifySignIn(), "Unable to sign in");

	}

}