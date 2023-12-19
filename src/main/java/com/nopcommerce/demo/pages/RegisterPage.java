package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import net.bytebuddy.utility.RandomString;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

import java.util.Random;

/**
 * 6.RegisterPage - Register Text, male female radio, Firstname, lastname, Date of Birth drop down, email, Password, Confirm Password, Register Button, "First name is required.","Last name is required.", "Email is required.","Password is required.", "Password is required." error message,
 * "Your registration completed" message, "CONTINUE" button
 * Locators and it's actions
 */

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());

    //Click on Register Link
    @CacheLookup
    @FindBy(tagName = "h1")
    WebElement verifyRegisterText;

    //Click on "REGISTER" button
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickOnRegisterButton;

    //Verify the error message "First name is required
    @CacheLookup
    @FindBy(id = "FirstName-error")
    WebElement verifyErrorMessageFirstNameIsRequired;

    //Verify the error message "Last name is required."
    @CacheLookup
    @FindBy(id = "LastName-error")
    WebElement verifyErrorMessageLastNameIsRequired;

    //Verify the error message "Email is required."
    @CacheLookup
    @FindBy(id = "Email-error")
    WebElement verifyErrorMessageEmailIsRequired;

    //Verify the error message "Password is required."
    @CacheLookup
    @FindBy(id = "Password-error")
    WebElement verifyErrorMessagePasswordIsRequired;

    //Verify the error message "ConfirmPassword is required."
    @CacheLookup
    @FindBy(id = "ConfirmPassword-error")
    WebElement verifyErrorMessageConfirmPasswordIsRequired1;

    //Select gender "Male"
    @CacheLookup
    @FindBy(id = "gender-male")
    WebElement genderMale;

    //Select gender "Female"
    @CacheLookup
    @FindBy(id = "gender-female")
    WebElement genderFemale;

    //Enter firstname
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement enterFirstName;

    //Enter Lastname
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement enterLastName;

    //Select day
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateOfBirthDay;

    //Select month
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthOfBirthDay;

    //Select year
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearOfBirthDay;

    //Enter Email
    @CacheLookup
    @FindBy(id = "Email")
    WebElement enterEmailId;

    //Enter password
    @CacheLookup
    @FindBy(id = "Password")
    WebElement enterPassword;


    //Enter Confirm Password
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement enterConfirmPassword;

    //Click on continue
    @CacheLookup
    @FindBy(xpath = "//a[normalize-space()='Continue']")
    WebElement continueButton;

  //Verify message "Your registration completed"
  @CacheLookup
  @FindBy(className = "result")
  WebElement verifyMessageYourRegistrationCompleted;

    //_____________________________________________________________________________//


    public String getVerifyRegisterText() {
        String message = getTextFromElement(verifyRegisterText);
        log.info("Getting text from : " + verifyRegisterText.toString());
        return message;
    }

    public void clickOnRegisterButton() {
        clickOnElement(clickOnRegisterButton);
        log.info("Click on register button : " + clickOnRegisterButton.toString());
    }

    public String verifyErrorMessageFirstNameIsRequired() {
        String message = getTextFromElement(verifyErrorMessageFirstNameIsRequired);
        log.info("Getting Message from : " + verifyErrorMessageFirstNameIsRequired);
        return message;
    }


    public String verifyErrorMessageLastNameIsRequired() {
        String message = getTextFromElement(verifyErrorMessageLastNameIsRequired);
        log.info("Getting Message from : " + verifyErrorMessageLastNameIsRequired);
        return message;
    }

    public String verifyErrorMessageEmailIsRequired() {
        String message = getTextFromElement(verifyErrorMessageEmailIsRequired);
        log.info("Getting Message from : " +verifyErrorMessageEmailIsRequired);
        return message;

    }

    public String verifyErrorMessagePasswordIsRequired() {
        String message = getTextFromElement(verifyErrorMessagePasswordIsRequired);
        log.info("Getting Message from : " + verifyErrorMessagePasswordIsRequired);
        return message;
    }

    public String verifyErrorMessagePasswordIsRequired1() {
        String message = getTextFromElement(verifyErrorMessageConfirmPasswordIsRequired1);
        log.info("Getting Message from : " + verifyErrorMessageConfirmPasswordIsRequired1);
        return message;
    }

    public void selectGender(String maleOrFemale) {
        switch (maleOrFemale) {
            case "Male":
                clickOnElement(genderMale);
                break;
            case "Female":
                clickOnElement(genderFemale);
                break;
            default:
                break;
        }
        log.info("Select gender : " + maleOrFemale.toString());
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(enterFirstName,firstname);
        log.info("Enter first name : " + enterFirstName.toString());
    }

    public void enterLastName(String lastname) {
        sendTextToElement(enterLastName,lastname);
        log.info("Enter last name : " + enterLastName.toString());
    }

    public void dateOfBirthDay(String day) {
        selectByVisibleTextFromDropDown(dateOfBirthDay, day);
        log.info("Enter date of birthDay : " + dateOfBirthDay.toString());
    }

    public void dateOfBirthMonth(String month) {
        selectByVisibleTextFromDropDown(monthOfBirthDay, month);
        log.info("Enter date of birthMonth : " + monthOfBirthDay.toString());
    }

    public void dateOfBirthYear(String year) {
        selectByVisibleTextFromDropDown(yearOfBirthDay, year);
        log.info("Enter date of birthYear : " + yearOfBirthDay.toString());
    }

//    public void enterEmailID(String email) {
//        sendTextToElement(enterEmail, email);
//        CustomListeners.test.log(Status.PASS, "Enter EmailId" + email);
//    }
public static String generatedEmail;

    public void enterEmail() {
        Random randomPartOfEmailGenerator = new Random(5000);
        int randomNumberInEmail = randomPartOfEmailGenerator.nextInt();
        //random string generator - to use in email
        RandomString randomString = new RandomString(5);
        String randomStringInEmailGenerator = randomString.nextString();
        generatedEmail = "mary" + randomNumberInEmail + randomStringInEmailGenerator + "john@gmail.com";
        sendTextToElement(enterEmailId, generatedEmail);
        log.info("Enter EmailId : " + generatedEmail.toString());
    }

    public void enterPassword(String  password) {
        sendTextToElement(enterPassword,"Password");
        log.info("Enter password : " + enterPassword.toString());
    }
    public void enterConfirmPassword(String  confirmPassword) {
        sendTextToElement(enterConfirmPassword,"Password");
        log.info("Enter confirm password : " + enterConfirmPassword.toString());
    }

    public String verifyMessageYourRegistrationCompleted() {
        String message = getTextFromElement(verifyMessageYourRegistrationCompleted);
        log.info("Getting message : " + verifyMessageYourRegistrationCompleted.toString());
        return message;
    }

    public void clickOnContinue() {
        clickOnElement(continueButton);
        log.info("Click on continue button : " + continueButton.toString());
    }
}
