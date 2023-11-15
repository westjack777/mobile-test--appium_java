package com.vodqareactnative.utils;

import com.google.common.collect.ImmutableMap;
import com.vodqareactnative.AppiumBasic;
import com.vodqareactnative.DriverFactory;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.touch.offset.PointOption;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.PageFactory;

public class AndroidActions {

    private AndroidDriver driver;

    public AndroidActions(){
        this.driver = new DriverFactory().getDriver();
        PageFactory.initElements(new AppiumFieldDecorator(this.driver),this);
    }

    public void doubleClickAction(WebElement e) {
        ((JavascriptExecutor) driver).executeScript("mobile: doubleClickGesture", ImmutableMap.of(
                "elementId", ((RemoteWebElement) e).getId()
        ));
    }

    public void longPressAction(WebElement e) {
        ((JavascriptExecutor)driver).executeScript("mobile: longClickGesture",
                ImmutableMap.of("elementId",((RemoteWebElement)e).getId(),
                        "duration",2000));
    }

    public void moveSlider(double d, WebElement slider) {
        int start = slider.getLocation().getX();
        int y = slider.getLocation().getY();
        int end = start + slider.getSize().getWidth();

        TouchAction action = new TouchAction(driver);

        int moveTo = (int) (end * d);

        action.longPress(PointOption.point(start, y))
                .moveTo(PointOption.point(moveTo, y))
                .release().perform();
    }

}
