package com.vodqareactnative.steps;

import com.vodqareactnative.AppiumBasic;
import com.vodqareactnative.DriverFactory;
import com.vodqareactnative.screens.LoginScreen;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.net.MalformedURLException;

public class LoginScreenStepDefinition {
    LoginScreen ls = new LoginScreen();

    @Given("The user is on login screen")
    public void the_user_is_on_login_screen() throws InterruptedException{
        ls.verifyLoginScreen();
    }

    @When("the user authenticates using {string} username and {string} password")
    public void the_user_authenticates_using_username_and_password(String username, String password) throws InterruptedException {
        ls.typeUsername(username);
        ls.typePassword(password);
        ls.pressLoginButton();
    }

    @Then("an error message {string} should be displayed")
    public void an_error_message_should_be_displayed(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}
