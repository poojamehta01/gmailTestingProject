package com.automation.steps;

import com.automation.pages.MainPage;
import cucumber.api.java.en.Then;
import static com.automation.utils.LogUtils.*;


public class MainPageSteps {
	MainPage mainpage = new MainPage();

	@Then("^Verify user is on Main page$")

	public void verify_user_is_on_Main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("Verfiying that the user is on the main page");
		mainpage.mailBoxisVisible();

	}

	@Then("^User clicks on compose button on Main page$")

	public void user_clicks_on_compose_button_on_Main_page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("User clicking on the compose button");
		mainpage.clicksOnComposeButton();
	}

	@Then("^Verify messageSent is visible on the Main Page$")

	public void verify_messageSent_is_visible_on_the_Main_Page() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("Verifying that the message Sent details is visible on the main page");
		mainpage.messageSent();
	}

}
