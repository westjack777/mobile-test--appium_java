package com.vodqareactnative.screens;

import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;

public class SamplesScreen extends AppiumBasic {

    @AndroidFindBy(xpath = "//*[@text='Samples List']")
    private WebElement samplesScreenLocator;

    @AndroidFindBy(xpath = "//*[@text='Back']")
    private WebElement backButton;

    public void verifySamplesScreen(){
        verifyScreen(samplesScreenLocator);
    }

    public void samplesListScreen(){
            verifyScreen(samplesScreenLocator);
    }
}
