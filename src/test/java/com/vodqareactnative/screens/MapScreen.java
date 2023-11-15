package com.vodqareactnative.screens;

import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import io.appium.java_client.TouchAction;

public class MapScreen extends AppiumBasic {


    @AndroidFindBy(id = "android:id/message")
    private WebElement alert;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement okButton;


    public void verifyAlert(String message) {

        Assert.assertEquals(getText(alert), message);
    }

    public void navigatePage(String page) {
        String pageLocator = "//*[@text='" + page + "']";
        getElement(pageLocator).click();
    }

    public void dismissPopUp(){
        okButton.click();
    }
//
//    public void clickByLocator(String button) {
//        String buttonLocator = "//*[@text='" + button + "']";
//        getElement(buttonLocator).click();
//    }
}
