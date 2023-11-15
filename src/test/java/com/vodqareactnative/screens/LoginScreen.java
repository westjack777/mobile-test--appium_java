package com.vodqareactnative.screens;


import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginScreen extends AppiumBasic {

    @AndroidFindBy(xpath = "//*[@text='Login']")
    private WebElement loginScreenLocator;

    @AndroidFindBy(xpath = "//*[@content-desc='username']")
    private WebElement usernameInputField;

    @AndroidFindBy(xpath = "//*[@content-desc='password']")
    private WebElement passwordInputField;

    @AndroidFindBy(xpath = "//*[@content-desc='login']")
    private WebElement loginButton;

    @AndroidFindBy(xpath = "//*[@text='Back']")
    private WebElement backButton;

    @AndroidFindBy(id = "android:id/message")
    private WebElement alert;


    public LoginScreen() {
    }

    public void verifyLoginScreen(){
        try {
            verifyScreen(loginScreenLocator);
        } catch (NoSuchElementException e) {
            click(backButton);
        }
    }

    public void verifyAlert(String message){
        Assert.assertEquals(getText(alert), message);
    }

    public LoginScreen typeUsername (String username) {
        clear(usernameInputField);
        sendKeys(usernameInputField, username);
        return this;
    }

    public LoginScreen typePassword(String password) {
        clear(passwordInputField);
        sendKeys(passwordInputField, password);
        return this;
    }

    public MapScreen pressLoginButton() {
        click(loginButton);
        return new MapScreen();
    }
}
