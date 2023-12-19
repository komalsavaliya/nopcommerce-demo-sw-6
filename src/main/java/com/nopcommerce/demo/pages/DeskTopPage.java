package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

/**
 * 4.DesktopsPage - Desktops text, Sortby, Display, selectProductList Locators and it's actions
 */
public class DeskTopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DeskTopPage.class.getName());


    //Verify "Desktops" text
    @CacheLookup
    @FindBy(xpath = "//h1[normalize-space()='Desktops']")
    WebElement verifyDeskTopsText;

    //Click on product name "Build your own computer"
    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']//a[normalize-space()='Build your own computer']")
    WebElement clickOnBuildYourOwnComputer;

    //___________________________________________________________________________//
    public String verifyDeskTopsText() {
        String message = getTextFromElement(verifyDeskTopsText);
        log.info("Getting message from : " + verifyDeskTopsText.toString());
        return message;
    }
    public void clickOnBuildYourOwnComputer(){
        String message = getTextFromElement(clickOnBuildYourOwnComputer);
        log.info("Getting message from : " + clickOnBuildYourOwnComputer.toString());
        clickOnElement(clickOnBuildYourOwnComputer);
    }
}