package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 3.ComputerPage - Computers text, DesktopsLink, NotebooksLink,
 * SoftwareLink Locators and create appropriate methods for it.
 */

public class ComputerPage extends Utility {
    private static final Logger log = LogManager.getLogger(ComputerPage.class.getName());

    //Verify "Computer" text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Computers']")
    WebElement verifyComputerText;

    //Click on Desktops link
    @CacheLookup
    @FindBy(xpath = "//a[@title='Show products in category Desktops'][normalize-space()='Desktops']")
    WebElement clickOnDeskTops;


    //___________________________________________________________________________________________________//

    public String verifyComputerText() {
        String text = getTextFromElement(verifyComputerText);
        log.info("Getting text from : " + verifyComputerText.toString());
        return text;
    }

    public void clickOnDeskTops(){
        clickOnElement(clickOnDeskTops);
        log.info("Click on desktop : " + clickOnDeskTops.toString());
    }
}
