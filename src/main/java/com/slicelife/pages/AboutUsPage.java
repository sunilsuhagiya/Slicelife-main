package com.slicelife.pages;

import com.slicelife.utility.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.testng.Reporter;

public class AboutUsPage extends Utility {

    public AboutUsPage(){
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(.,'FOR THE LOVEOF INDEPENDENTS')]")
    WebElement text;

    public String verifyText(){
        Reporter.log("Verify Text " + text.getText());
        return getTextFromElement(text);
    }
}
