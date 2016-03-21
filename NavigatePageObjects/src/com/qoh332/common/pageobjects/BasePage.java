package com.qoh332.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
	
	protected WebDriver driver;
	private By signInButton = By.linkText("Sign in");
	String basePageConfig = "Navigate";
	String homeTitle = "Navigate Login";
	//String homeTitle = "MAPLE - posered by Lighthouse Navigate";


	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	
	public String getBasePageConfig() {
		return basePageConfig;
	}
	
	
	public SignInPage clickSignInBtn() {
//		System.out.println("clicking on sign in button");
//		WebElement signInBtnElement=driver.findElement(signInButton);
//		if(signInBtnElement.isDisplayed()||signInBtnElement.isEnabled())
//			signInBtnElement.click();
//		else System.out.println("Element not found");
		System.out.println("Element not found");
		
		return new SignInPage(driver);
	}
	
	public void clickImagesLink() {
		//It should have a logic to click on images link
		//And it should navigate to google images page
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		//String expectedPageTitle="Google";
		return getPageTitle().contains(this.homeTitle);
	}
}