package com.vodqareactnative;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.cucumber.java.en_scouse.An;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class AppiumBasic {
    private AndroidDriver driver;

    public AppiumBasic(){
        this.driver = new DriverFactory().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void verifyScreen(WebElement e){
        Assert.assertTrue(e.isDisplayed(), "This is not the expected screen");
    }

    public void click(WebElement e) {
        waitForVisibility(e);
        e.click();
    }

    public void clear(WebElement e) {
        waitForVisibility(e);
        e.clear();
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String getText(WebElement e, String text){
        waitForVisibility(e);
        return e.getText();
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void elementIsDisplayed(WebElement element){
        Assert.assertTrue(element.isDisplayed(), "Element is not displayed.");
    }
}