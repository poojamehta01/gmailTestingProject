package com.automation.steps;

import static com.automation.utils.LogUtils.*;

import com.automation.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class LoginPageSteps {
	LoginPage loginpage = new LoginPage();

	@Given("^User is on Login Page of the application$")

	public void user_is_on_Login_Page_of_the_application() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("Veriying that the user is on the login page");
		loginpage.verifyUserOnLoginpage();
	}

	@When("^User logs in with username and password$")

	public void user_logs_in_with_username_and_password() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		Log.info("User logging in with userName and password");
		loginpage.login();
	}

}
