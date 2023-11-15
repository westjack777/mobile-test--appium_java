package com.vodqareactnative;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.InteractsWithApps;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.Alert;

import java.net.MalformedURLException;
import java.net.URL;

public class DriverFactory {
    private static AndroidDriver driver;

    @BeforeAll
    public static void setUp() {

        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("S21Plus");
        options.setCapability("platformName", "Android");
        options.setCapability("automationName", "UiAutomator2");
        options.setCapability("udid", "RFCNC0PAM7L");
        options.setCapability("autoGrantPermissions",true);
        options.setCapability("autoAcceptAlerts", true);
//        options.setCapability("fullReset", true);
//        options.setCapability("noReset", false);
//        options.setCapability("appPackage", "com.vodqareactnative");
//        options.setCapability("appActivity", "com.vodqareactnative.MainActivity");
        options.setApp("D:\\Documents\\QA\\mobiletesting\\src\\test\\resources\\apps\\appiumChallenge.apk");

        if (driver == null){
            try{
                driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), options);
            } catch (MalformedURLException e){
                e.printStackTrace();
            }
        }

        handleAlerts();
    }

    public AndroidDriver getDriver() {
        if(driver == null) {
            setUp();
        }
        return driver;
    }

    @AfterAll
    public static void tearDown() {
        driver.quit();
    }

    public static void handleAlerts(){
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }
}
