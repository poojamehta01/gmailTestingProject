package com.automation.pages;

import java.util.List;
import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.AssertionUtils.*;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.DriverUtils.*;
import static com.automation.utils.ConfigUtils.*;
import static com.automation.utils.WebElementUtils.*;

public class SentMailsPage {
	public SentMailsPage() {
		PageFactory.initElements(getDriver(), this);
	}

	@FindBy(xpath = "//a[text()='Sent']")
	private WebElement sent;
	@FindBy(xpath = "//input[@type='password']")
	private WebElement passwordTextBox;
	@FindBy(xpath = "//span[text()='Next']")
	private WebElement NextButton;
	@FindBy(xpath = "//table[@class='F cf zt']/tbody/tr[@class='zA zE byw']")
	private List<WebElement> mails;
	@FindBy(xpath = "//table[@id=':2c']//tr[contains(@class, 'zA zE')][1]")
	private WebElement mailSentDetails;
	@FindBy(xpath = "//h2[contains(text(),'auto')]")
	private WebElement mailSentDetailsSubject;
	@FindBy(xpath = "//span[@class='go']")
	private WebElement mailSentDetailsFrom;

	public void mailSentDetails() throws InterruptedException {

		clickOnElement(sent);
		Log.debug("Open Sent Page");
		for (WebElement mail : mails) {
			if (mail.getText().indexOf(getPropertyByKey("message")) != -1) {
				mail.click();
				Log.debug("Mail Sent Clicked");

				break;
			}
		}

		Log.debug("assertion on subject");
		String subjectActual = getPropertyByKey("subject");
		String subjectExpected = mailSentDetailsSubject.getText();
		assertEquals(mailSentDetailsSubject, subjectActual, subjectExpected);

		Log.debug("assertion on from");
		String fromActual = getPropertyByKey("from");

		String fromExpected = mailSentDetailsFrom.getText();
		fromExpected = fromExpected.substring(1, fromExpected.length() - 1);
		assertEquals(mailSentDetailsFrom, fromActual, fromExpected);

	}

	public void mailSentVisible() {
		// TODO Auto-generated method stub
		waitForVisible(mailSentDetails);
		Log.debug("Mail Sent Details Visible");

	}
}
