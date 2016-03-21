package com.custman.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.custman.logger.Log;

public class BasePage {
	protected WebDriver driver;
	
// iffy use the login button instead	
	private By signInButton = By.linkText("Log in");
		
	private By loginButton = By.xpath("//input[@type='submit']");
	private By usernameBox = By.name("j_username");
	private By passwordBox = By.name("j_password");
	private By pageHeadingText = By.xpath("//h3[contains(.,'Welcome to Portal')]");
	private By pageWelcomeText = By.xpath("//p[contains(.,'This is the default Portal home welcome message.')]");
	private By pageLoginErrorText = By.xpath("//h3[contains(.,'There was a problem logging into your account')]");
	
//	private By resetPasswordButton = By.
//	private By createAccountButton = By
//	private By contactUsButton = By
//	private By helpButton = By

//	private By homeButton = By
//	private By findLicenceButton = By
//	private By logoUsed = By
//	private By homeLeftPanel = By
//	private By homeRightPanel = By
	
//	Add  these last
//	private By copyrightButton = By
//	private By disclaimerButton = By
//	private By privacyButton = By
//	private By rightToInformationButton = By
//	private By accessibilityButton = By
//	
	
	String headingText = "Welcome to Portal";
	String welcomeText = "This is the default Portal home welcome message.";
	
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	
	public boolean verifyWelcomeText(){
		
		String theText;

		Log.info("Start verifyWelcome Text.");
		
		Log.info("S10 .....");
		try{
			
		WebElement verifyWelcome = driver.findElement(pageWelcomeText);
	
		Log.info("S11 .....");
		theText = verifyWelcome.getText();
		Log.info("S12 .....");
		}
		catch (NoSuchElementException e){
			theText = "empty";
		}
		Log.info("S13 .....");
		
		Log.info("End verifyWelcome Text.");
		return theText.contains(welcomeText);
	}
	
	
	public boolean verifyPageHeadingText(){
		
		String theText;
		
		Log.info("S1 .....");
		try{
			
		WebElement verifyHeading = driver.findElement(pageHeadingText);
	
		Log.info("S2 .....");
		theText = verifyHeading.getText();
		Log.info("S3 .....");
		}
		catch (NoSuchElementException e){
			theText = "empty";
		}
		Log.info("S4 .....");
		return theText.contains(headingText);
	}
	
	
	public SignInPage clickSignInBtn() {
		System.out.println("clicking on sign in button");
		WebElement signInBtnElement=driver.findElement(signInButton);
		if(signInBtnElement.isDisplayed()||signInBtnElement.isEnabled())
			signInBtnElement.click();
		else System.out.println("Element not found");
		return new SignInPage(driver);
	}
	
	public void clickImagesLink() {
		//Portal Images??
		//Navigate Images??
		//Where the heck did I put them?
		//LUCAS/images/portal		
	}
	
	public String getPageTitle(){
		String title = driver.getTitle();
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		String expectedPageTitle="Welcome to Portal";
		return getPageTitle().contains(expectedPageTitle);
	}
}