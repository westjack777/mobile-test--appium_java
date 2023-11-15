package com.vodqareactnative.steps;

import com.vodqareactnative.screens.MapScreen;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CommonStepDefinition {
    MapScreen ms = new MapScreen();

    @Then("a message {string} should be displayed")
    public void a_message_should_be_displayed(String message) {
        ms.verifyAlert(message);
    }

    @When("the user navigates to {string} page")
    public void theUserNavigatesToPage(String page) {
        ms.navigatePage(page);
    }
}
