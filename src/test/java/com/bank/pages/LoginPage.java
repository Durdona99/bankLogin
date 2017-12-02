package com.bank.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	WebDriver driver;

	public LoginPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="inUserID")
	public WebElement userName;
	
	@FindBy(id="inPassword")
	public WebElement password;
	
	@FindBy(id="mainContent_EWF_BUTTON_Continue")
	public WebElement continueButton;
}
