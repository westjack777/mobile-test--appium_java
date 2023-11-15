package com.vodqareactnative.screens;


import com.vodqareactnative.AppiumBasic;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class LoginScreen extends AppiumBasic {

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Login']")
    private WebElement loginScreenLocator;

    @AndroidFindBy(xpath = "//*[@content-desc='username']")
    private WebElement usernameInputField;

    @AndroidFindBy(xpath = "//*[@content-desc='password']")
    private WebElement passwordInputField;

    @AndroidFindBy(xpath = "//*[@content-desc='login']")
    private WebElement loginButton;

    @AndroidFindBy(id = "android:id/contentPanel")
    private WebElement oopsAlert;


    public LoginScreen() {
    }

    public void verifyLoginScreen(){
        verifyScreen(loginScreenLocator);
    }

    public void verifyOopsAlert(){
        //Assert.assertEquals(getText(oopsAlert),"message");
    }

    public LoginScreen typeUsername (String username) throws InterruptedException {
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
