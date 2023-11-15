package com.vodqareactnative.steps;

import com.vodqareactnative.screens.DoubleTapScreen;
import io.cucumber.java.en.When;

public class DoubleTapStepDefinition {

    DoubleTapScreen dt = new DoubleTapScreen();



    @When("the user double tap the {string} button")
    public void the_user_double_tap_the_button(String buttonName) {
        dt.doubleTap();
    }
}
