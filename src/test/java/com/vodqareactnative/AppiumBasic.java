package com.vodqareactnative;

import com.vodqareactnative.utils.AndroidActions;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;
import io.cucumber.java.AfterAll;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import java.time.Duration;

public class AppiumBasic {
    private AndroidDriver driver;
    AndroidActions actions = new AndroidActions();

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

    public WebElement getElement (String locator){
        return driver.findElement(By.xpath(locator));
    }

    public void sendKeys(WebElement e, String txt) {
        waitForVisibility(e);
        e.sendKeys(txt);
    }

    public String getText(WebElement e){
        waitForVisibility(e);
        return e.getText();
    }

    public void waitForVisibility(WebElement e) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        wait.until(ExpectedConditions.visibilityOf(e));
    }

    public void doubleTap(WebElement e){
        actions.doubleClickAction(e);
    }

    public void moveSlider(double d, WebElement e){
        actions.moveSlider(d, e);
    }

//    public boolean elementIsDisplayed(WebElement e){
//        if (e.isDisplayed()){
//            System.out.println();
//            return true;
//        }
//        else return false;
//    }
}