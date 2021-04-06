package com.automation.pages;

import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.DriverUtils.*;
import static com.automation.utils.WebElementUtils.*;
public class MainPage {

	public MainPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//div[text()='Compose']")
	private WebElement composeButton;
	@FindBy(xpath = "//span[text()='auto-generated mail']")
	private WebElement mailRecieved;
	@FindBy(xpath = "//div[@id=':22']")
	private WebElement mail;
	@FindBy(xpath = "//span[text()='Message sent.']")
	private WebElement msgSent;

	public void clicksOnComposeButton() {

		// clicks complose
		clickOnElement(composeButton);
		Log.debug("Clicks on Compose Button");

	}

	public void mailBoxisVisible() {

		waitForVisible(mail);
		Log.debug("mailBox is visible");

	}

	public void messageSent() {
		waitForVisible(msgSent);
		Log.debug("message Sent visible");

	}

}
