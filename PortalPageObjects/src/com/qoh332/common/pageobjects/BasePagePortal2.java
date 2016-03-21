package com.qoh332.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePagePortal2 {

	
	protected WebDriver driver;
	private By signInButton = By.linkText("Log in");
	private By baseFormHeading = By.id("HomeWelcome");
	private By headerWelcomeText = By.xpath("//h3[contains(.,'Welcome to Navigate Portal tomcat')]");
	private By headerWelcomeTextOther = By.xpath("//span[@id='specTitle']");
	String textWelcomeTextOther = "Navigate Portl";
	
	public BasePagePortal2(WebDriver driver) {
		this.driver = driver;
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
		//It should have a logic to click on images link
		//And it should navigate to google images page
	}
	
	public String getPageTitle(){
		System.out.println("EX7");
		String title = driver.getTitle();
		System.out.println("EX8");
		return title;
	}
	
	public boolean verifyBasePageTitle() {
		System.out.println("EX0");
		String expectedPageTitle="Welcome to Navigate Portal";
		System.out.println("EX1");
		return getPageTitle().contains(expectedPageTitle);
	}

	
	public boolean verifyBasePageHeadingText() {
		System.out.println("EX4");
		WebElement element = driver.findElement(headerWelcomeTextOther);
		String pageText = element.getText();
		//String expectedPageText = "Welcome to Navigate Portal tomcat";
		System.out.println("EX5");
		return pageText.contains(textWelcomeTextOther);
	}
	
	public String getBasePageHeadingText(){
		System.out.println("EX2");
		WebElement element2 = driver.findElement(headerWelcomeTextOther);
		String pageText = element2.getText();
		System.out.println("EX3");
		return pageText;
	}
	
	
	
	
	
//	public boolean verifySignInPageText() {
//		WebElement element = driver.findElement(headerPageText);
//		String pageText = element.getText();
//		String expectedPageText = "Sign in with your Google Account";
//		return pageText.contains(expectedPageText);
//	}
	
	
//	public boolean verifyBaseFormHeadingTest(){
//		
//		String expectedBaseFormHeadingText = getBaseFormHeading();
//		
//		return getBaseFormHeading().
//		
//	}
//	
}