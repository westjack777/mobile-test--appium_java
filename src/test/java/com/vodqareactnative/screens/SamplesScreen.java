package com.vodqareactnative.screens;

import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class SamplesScreen extends AppiumBasic {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Samples List']")
    private WebElement samplesScreenLocator;

    public void verifySamplesScreen(){
        verifyScreen(samplesScreenLocator);
    }
}
