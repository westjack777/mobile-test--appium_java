package com.vodqareactnative.screens;

import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class DoubleTapScreen extends AppiumBasic {

    @AndroidFindBy(accessibility="doubleTapMe")
    private WebElement tapButton;

    public void doubleTap() {
        doubleTap(tapButton);
    }
}
