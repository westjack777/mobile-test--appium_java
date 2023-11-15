package com.vodqareactnative.steps;

import com.vodqareactnative.screens.LoginScreen;
import com.vodqareactnative.screens.SamplesScreen;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SamplesScreenStepDefinition {
    SamplesScreen ss = new SamplesScreen();
    LoginScreen ls = new LoginScreen();

    @Given("The user is on Samples List screen")
    public void the_user_is_on_samples_list_screen() {
        ls.loginApp();
        ss.verifySamplesScreen();
    }

    @Then("the user should be in Samples List screen")
    public void theUserShouldBeInSamplesListScreen() {
        ss.verifySamplesScreen();
    }
}

