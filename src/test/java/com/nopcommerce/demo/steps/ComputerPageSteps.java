package com.nopcommerce.demo.steps;

import com.nopcommerce.demo.pages.BuildYourOwnComputerPage;
import com.nopcommerce.demo.pages.ComputerPage;
import com.nopcommerce.demo.pages.DeskTopPage;
import com.nopcommerce.demo.pages.HomePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;

public class ComputerPageSteps {
    @When("I Click on Computer tab")
    public void iClickOnComputerTab() {
        new HomePage().clickOnComputerTab();
    }

    @Then("I Verify {string} text")
    public void iVerifyText(String arg0) {
        String expectedMessage = "Computers";
        String actualMessage = new ComputerPage().verifyComputerText();
        Assert.assertEquals(actualMessage, expectedMessage, "Text is Displayed");
    }

    @And("I Click on Desktops link")
    public void iClickOnDesktopsLink() {
        new ComputerPage().clickOnDeskTops();
    }

    @And("I Click on product name {string}")
    public void iClickOnProductName(String arg0) {
        new DeskTopPage().clickOnBuildYourOwnComputer();
    }

    @And("I Select processor {string}")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerPage().selectProcessor(processor);
    }

    @And("I Select RAM {string}")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerPage().selectRAM(ram);
    }

    @And("I Select HDD {string}")
    public void iSelectHDD(String hdd) {
        new BuildYourOwnComputerPage().selectHDD(hdd);
    }

    @And("I Select OS {string}")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerPage().selectOS(os);
    }

    @And("I Select Software {string}")
    public void iSelectSoftware(String software) {
        new BuildYourOwnComputerPage().selectSoftware(software);
    }

    @And("I Click on {string} Button")
    public void iClickOnButton(String arg0) {
        new BuildYourOwnComputerPage().clickOnAddToCartLink();
    }

    @Then("I Verify message {string}.")
    public void iVerifyMessage(String arg0) {
        String expectedText = "The product has been added to your shopping cart";
        String actualText = new BuildYourOwnComputerPage().getMessageText();
        Assert.assertEquals(actualText, expectedText, "Text not displayed");
    }
}
