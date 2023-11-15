package com.vodqareactnative.steps;

import com.vodqareactnative.screens.SamplesScreen;
import io.cucumber.java.en.Then;

public class SamplesScreenStepDefinition {
    SamplesScreen ss = new SamplesScreen();

    @Then("the user should be in Samples List screen")
    public void the_user_should_be_in_samples_list_screen() {
        ss.verifySamplesScreen();
    }
}
