package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.pages.RegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class RegisterPageSteps {
    @When("Click on Register Link")
    public void clickOnRegisterLink() {
        new HomePage().clickOnRegisterLink();
    }

    @Then("Verify {string} text")
    public void verifyText(String arg0) {
        String expectedMessage = "Register";
        String actualMessage = new RegisterPage().getVerifyRegisterText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is Displayed");
    }

    @And("I Click on {string} button")
    public void iClickOnButton(String arg0) {
        new RegisterPage().clickOnRegisterButton();
    }

    @And("I Verify the error message {string}")
    public void iVerifyTheErrorMessage(String arg0) {
        new RegisterPage().verifyErrorMessageFirstNameIsRequired();
        new RegisterPage().verifyErrorMessageLastNameIsRequired();
        new RegisterPage().verifyErrorMessageEmailIsRequired();
        new RegisterPage().verifyErrorMessagePasswordIsRequired();
        new RegisterPage().verifyErrorMessagePasswordIsRequired1();
    }

    @And("I Select gender {string}")
    public void iSelectGender(String arg0) {
        new RegisterPage().selectGender("Female");
    }

    @And("I Enter firstname")
    public void iEnterFirstname() {
        new RegisterPage().enterFirstName("Mary");
    }

    @And("I Enter lastname")
    public void iEnterLastname() {
        new RegisterPage().enterLastName("John");
    }

    @And("I Select day")
    public void iSelectDay() {
        new RegisterPage().dateOfBirthDay("6");
    }

    @And("I Select month")
    public void iSelectMonth() {
        new RegisterPage().dateOfBirthMonth("June");
    }

    @And("I Select year")
    public void iSelectYear() {
        new RegisterPage().dateOfBirthYear("1966");
    }

    @And("I Enter email")
    public void iEnterEmail() {
        new RegisterPage().enterEmail();
    }

    @And("I Enter password")
    public void iEnterPassword() {
        new RegisterPage().enterPassword("123456");
    }

    @And("I Enter Confirm Password")
    public void iEnterConfirmPassword() {
        new RegisterPage().enterConfirmPassword("123456");
    }

    @Then("I Verify message {string}")
    public void iVerifyMessage(String arg0) {
        String expectedMessage = "Your registration completed";
        String actualMessage = new RegisterPage().verifyMessageYourRegistrationCompleted();
        Assert.assertEquals(actualMessage, expectedMessage,"Message Displayed");
    }
}
