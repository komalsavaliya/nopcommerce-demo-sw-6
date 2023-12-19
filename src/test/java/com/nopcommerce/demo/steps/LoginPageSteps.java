package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.LoginPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class LoginPageSteps {
    @Given("I am on homepage")
    public void iAmOnHomepage() {
    }

    @When("I click on login link")
    public void iClickOnLoginLink() {
        new HomePage().clickOnLoginLink();
    }

    @Then("I should navigate to login page successfully")
    public void iShouldNavigateToLoginPageSuccessfully() {
        String expectedMessage = "Welcome, Please Sign In!";
        String actualMessage = new LoginPage().getWelcomeText();
        Assert.assertEquals(actualMessage, expectedMessage, "Login page not displayed");
    }

    @And("Enter EmailId")
    public void enterEmailId() {
        new LoginPage().enterEmailID("maryjohn@gmail.com");
    }

    @And("Enter Password")
    public void enterPassword() {
        new LoginPage().enterPassword("123456");
    }

    @And("Click on Login Button")
    public void clickOnLoginButton() {
        new LoginPage().clickOnLoginButton();
    }

    @Then("Verify that the Error message")
    public void verifyThatTheErrorMessage() {
        String expectedMessage = "Login was unsuccessful. Please correct the errors and try again.\n"
                + "No customer account found";
        String actualMessage = new LoginPage().getErrorMessage();
        Assert.assertEquals(actualMessage, expectedMessage, "Error message not displayed");
    }

    @Then("Verify that LogOut link is display")
    public void verifyThatLogOutLinkIsDisplay() {
        String expectedErrorMessage = "Log out";
        String actualErrorMessage = new HomePage().verifyLogOutLink();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "LogOut Link Is Not Displayed");
    }

    @And("Enter ValidEmailId")
    public void enterValidEmailId() {
        new LoginPage().enterValidEmailID("johnmary@gmail.com");
    }

    @And("Click on LogOut Link")
    public void clickOnLogOutLink() {
        new HomePage().clickOnLogOutLink();

    }

    @And("Verify that LogIn Link Display")
    public void verifyThatLogInLinkDisplay() {
        String expectedErrorMessage = "Login";
        String actualErrorMessage = new HomePage().verifyLogInLink();
        Assert.assertEquals(actualErrorMessage, expectedErrorMessage, "Error Message");
    }
}


