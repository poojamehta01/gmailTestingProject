package com.automation.steps;

import com.automation.pages.SentMailsPage;
import cucumber.api.java.en.Then;
import static com.automation.utils.LogUtils.*;


public class SentMailsPageSteps {
	SentMailsPage sentMailsPage = new SentMailsPage();

	@Then("^verify mailSent on the SentMails Page$")

	public void verify_mailSent_on_the_SentMails_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("Verifying send mail details are visible successfully on the Sent mail page");
		sentMailsPage.mailSentVisible();
		
		sentMailsPage.mailSentDetails();
	}

}
