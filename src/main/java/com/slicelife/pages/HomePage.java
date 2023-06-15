package com.slicelife.pages;

import com.slicelife.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

import java.security.PublicKey;

public class HomePage extends Utility {
    public HomePage(){

    }
    @CacheLookup
    @FindBy(xpath = "//a[@href='https://slicelife.com/pages/about-us']")
    WebElement aboutUs;

    public void clickOnAboutUs(){
        Reporter.log("Click on Aboutus button" + aboutUs.toString());
        clickOnElement(aboutUs);
    }
}
