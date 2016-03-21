package com.qoh332.common.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignInPage {

private WebDriver driver;

private By headerPageText = By.cssSelector(".hidden-small");
private By createAccountLink = By.id("link-signup");
private By emailTextBox = By.id("Email");
private By passwordTextBox = By.id("Passwd");
private By loginBtn = By.id("signIn");
private By errorMsgTxt = By.id("errormsg_0_Passwd");

private By passwordTextNavigate = By.id("j_password");
private By usernameTextNavigate = By.id("j_username");
private By loginButtonNavigate = By.xpath("//button[contains(text(),'Login')]");


String setupConfig = "Navigate SignInPage";


	
	public SignInPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public String getSignInPageTitle() {
		String pageTitle = driver.getTitle();
		return pageTitle;
	}
	
	public boolean verifySignInPageTitle() {
		//String expectedTitle = "Sign in - Google Accounts";
		String expectedTitle = "Navigate Login";
		return getSignInPageTitle().contains(expectedTitle);
	}
	
		
	public String getSetupConfig() {
		return setupConfig;
	}

	public boolean verifySignInPageText() {
		WebElement element = driver.findElement(headerPageText);
		String pageText = element.getText();
		String expectedPageText = "Sign in with your Google Account";
		return pageText.contains(expectedPageText);
	}
		public CreateAccountPage clickonCreateAnAccount() {
			WebElement element=driver.findElement(createAccountLink);
			if(element.isDisplayed()||element.isEnabled())
				element.click();
			return new CreateAccountPage(driver);
	}
		
		public boolean verifySignIn() {
			enterUserName("michael smith");
			enterPassword("Qwerty94");
			clickOnSignIn();
			return getErrorMessage().contains("incorrect");
		}
		
//		Original
//		public void enterUserName(String userName) {
//			WebElement emailTxtBox = driver.findElement(emailTextBox);
//			if(emailTxtBox.isDisplayed())
//				emailTxtBox.sendKeys(userName);
//		}
//		
		
		public void enterUserName(String userName) {
			WebElement emailTxtBox = driver.findElement(usernameTextNavigate);
			if(emailTxtBox.isDisplayed())
				emailTxtBox.sendKeys(userName);
		}
		
		
		public void enterPassword(String password) {
			WebElement passwordTxtBox = driver.findElement(passwordTextNavigate);
			if(passwordTxtBox.isDisplayed())
				passwordTxtBox.sendKeys(password);
		}
		

//Original		
//		public void clickOnSignIn() {
//			WebElement signInBtn = driver.findElement(loginBtn);
//			if(signInBtn.isDisplayed())
//				signInBtn.click();
//		}
		
		
		public void clickOnSignIn() {
			
			System.out.println("s1");
			WebElement signInBtn = driver.findElement(loginButtonNavigate);
			System.out.println("s2");
			if(signInBtn.isDisplayed())
				signInBtn.click();
		}
		
		public String getErrorMessage() {
			String strErrorMsg = null;
			WebElement errorMsg = driver.findElement(errorMsgTxt);
			if(errorMsg.isDisplayed()&&errorMsg.isEnabled())
				strErrorMsg = errorMsg.getText();
			return strErrorMsg;
		}
}