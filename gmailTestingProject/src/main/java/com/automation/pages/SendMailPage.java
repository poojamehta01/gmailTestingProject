package com.automation.pages;

import static com.automation.utils.LogUtils.*;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static com.automation.utils.WebElementUtils.*;
import static com.automation.utils.CommonUtils.*;
import static com.automation.utils.DriverUtils.*;
import static com.automation.utils.ConfigUtils.*;

public class SendMailPage {
	public SendMailPage() {
		PageFactory.initElements(getDriver(), this);
	}


	@FindBy(xpath = "//span[text()='New Message']")
	private WebElement newMessage;
	@FindBy(xpath = "//img[@alt='Pop-out']")
	private WebElement popout;
	@FindBy(xpath = "//textarea[@aria-label='To']")
	private WebElement to;
	@FindBy(xpath = "//input[@aria-label='Subject']")
	private WebElement subject;
	@FindBy(xpath = "//div[@aria-label='Message Body']")
	private WebElement message;
	@FindBy(xpath = "//input[@name='Filedata']")
	private WebElement addAttachment;
	@FindBy(xpath = "//div[text()='Send']")
	private WebElement send;

	public void newMessagevisible() {
		waitForVisible(newMessage);
	}

	public void enterNewMailDetails() {
		
		waitForVisible(popout);
		clickOnElement(popout);
		Log.debug("Page Pop-outs");
		
		waitForVisible(to);
		sendKeysTo(to, getPropertyByKey("to"));
		Log.debug("To Detail Entered");
		
		waitForVisible(subject);
		sendKeysTo(subject, getPropertyByKey("subject"));
		Log.debug("Subject Details Entered");
		
		waitForVisible(message);
		sendKeysTo(message, getPropertyByKey("message"));
		Log.debug("Message Details Entered");
	}

	public void uploadAttachment() {
		
		
		upload(addAttachment, "C:\\dummytest.txt");
		Log.debug("Attachment Uploaded");
	}

	public void clickSendButton() {
		
		waitForVisible(send);
		clickOnElement(send);
		Log.debug("Mail Sent");
	}

}
