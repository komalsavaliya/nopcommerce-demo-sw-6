package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * baseUrl :https://demo.nopcommerce.com/
 * Page Object project with page factory with extent report, Use data provider, create runner.xml file to run test
 * Project name: nop-commerce-demo
 * Group-Id : com.nopcommerce.demo
 * Main package.
 * create all packages and class that you created for page object model
 * In Pages package
 * 1.LoginPage - Email, password, Login Button and "Welcome, Please Sign In!" text Locators and create appropriate methods for it.
 */

public class LoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(LoginPage.class.getName());

    //verify that "Welcome, Please Sign In!" message display
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Welcome, Please Sign In!']")
    WebElement welcomeText;

    //Enter EmailId
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement validEmailField;

    //Enter Password
    @CacheLookup
    @FindBy(name = "Password")
    WebElement passwordField;

    //Click on Login Button
   @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton;

   //Verify that the Error message
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-error validation-summary-errors']")
    WebElement errorMessage;

    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Log in']")
    WebElement loginButton1;

    public String getWelcomeText(){
        String text = getTextFromElement(welcomeText);
        log.info("Getting text from : " + welcomeText.toString());
        return text;

    }

    public void enterEmailID(String email) {
        sendTextToElement(emailField, email);
        log.info("Enter EmailId" + emailField.toString());
    }
    public void enterValidEmailID(String email) {
        sendTextToElement(validEmailField, email);
        log.info("Enter EmailId" + validEmailField.toString());
    }


    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
      log.info("Enter Password" +passwordField.toString());
    }

    public void clickOnLoginButton() {
        clickOnElement(loginButton);
        log.info("Click on login button " +loginButton.toString());
    }

    public String getErrorMessage(){
        String message = getTextFromElement(errorMessage);
        log.info("Getting text from : " + errorMessage.toString());
        return message;

    }

    public void clickOnLoginButton1() {
        clickOnElement(loginButton1);
        log.info("Click on login button " + loginButton1.toString());
    }

}




