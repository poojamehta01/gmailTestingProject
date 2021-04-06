package com.automation.pages;

import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.ConfigUtils.*;
import static com.automation.utils.DriverUtils.*;

public class LoginPage {
	public LoginPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//input[@id='identifierId']")
	private WebElement emailTextBox;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//span[text()='Next']/following-sibling::div")
	private WebElement NextButton;

	public void verifyUserOnLoginpage() {

		assertPageTitle(getPropertyByKey("LoginPage.title"));
		Log.debug("Login Page Title found");
	}

	public void login() {

		assertPresent(emailTextBox);
		sendKeysTo(emailTextBox, getPropertyByKey("username"));
		Log.debug("Entered userName");

		clickOnElement(NextButton);
		Log.debug("Clicked NextButton");

		sendKeysTo(passwordTextBox, getPropertyByKey("password"));
		Log.debug("Entered password");

		clickOnElement(NextButton);
		Log.debug("Clicked NextButton");
	}

}
