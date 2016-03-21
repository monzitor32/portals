package com.qoh332.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qoh332.base.TestBaseSetup;
import com.qoh332.common.pageobjects.BasePagePortal2;



	public class BasePageTestPortal2 extends TestBaseSetup{
		
		private WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
	
		@Test
		public void verifyHomePage() {
			System.out.println("Home page test...");
			BasePagePortal2 basePagePortal2 = new BasePagePortal2(driver);
			Assert.assertTrue(basePagePortal2.verifyBasePageTitle(), "Home Page title doesn't match");
			System.out.println(basePagePortal2.getPageTitle());
			String me = basePagePortal2.getBasePageHeadingText();
			System.out.println(me);
			System.out.println(basePagePortal2.verifyBasePageHeadingText());

			

//			System.out.println(basePagePortal2.getBaseFormHeading());
//			System.out.println(basePagePortal2.getBaseFormHeading());
			//Assert.assertTrue(condition, message);
			
		}

	}