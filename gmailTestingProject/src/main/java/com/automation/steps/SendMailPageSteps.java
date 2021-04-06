package com.automation.steps;

import static com.automation.utils.LogUtils.*;
import com.automation.pages.SendMailPage;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SendMailPageSteps {
	SendMailPage sendMailPage = new SendMailPage();

	@Then("^Verify sendMail open successfully$")
	public void verify_sendMail_open_successfully() throws Throwable {
		Log.info("Verifying that the New message popup opened successfully");
		sendMailPage.newMessagevisible();
	}

	@When("^User enters sendTo,Subject,messageBody on SendMail page$")
	public void user_enters_To_on_SendMail_page() throws Throwable {
		Log.info("User entering To, Subject, Message");
		sendMailPage.enterNewMailDetails();
	}

	@When("^User uploads attachment$")
	public void user_uploads_attachment() throws Throwable {
		Log.info("User uploading atachment");
		sendMailPage.uploadAttachment();

	}

	@When("^User clicks on send button on SendMail page$")
	public void user_clicks_on_send_button_on_SendMail_page() throws Throwable {
		Log.info("User clicking on the send mail button");
		sendMailPage.clickSendButton();
	}
}
