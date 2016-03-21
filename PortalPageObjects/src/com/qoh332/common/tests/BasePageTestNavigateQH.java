package com.qoh332.common.tests;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.qoh332.base.TestBaseSetup;
import com.qoh332.common.pageobjects.BasePagePortal2;



	public class BasePageTestNavigateQH extends TestBaseSetup{
		
		private WebDriver driver;
		
		@BeforeClass
		public void setUp() {
			driver=getDriver();
		}
	
		@Test
		public void verifyHomePage() {
			System.out.println("Qh Navigate Home page test begins...");
			BasePagePortal2 basePageNavigateQH = new basePageNavigateQH(driver);
			Assert.assertTrue(basePageNavigateQH.verifyBasePageTitle(), "Home Page title doesn't match");
			System.out.println(basePageNavigateQH.getPageTitle());
			String me = basePageNavigateQH.getBasePageHeadingText();
			System.out.println(me);
			System.out.println(basePageNavigateQH.verifyBasePageHeadingText());

			

//			System.out.println(basePagePortal2.getBaseFormHeading());
//			System.out.println(basePagePortal2.getBaseFormHeading());
			//Assert.assertTrue(condition, message);
			
		}

	}