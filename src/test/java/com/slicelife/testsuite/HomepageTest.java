package com.slicelife.testsuite;

import com.slicelife.pages.AboutUsPage;
import com.slicelife.pages.HomePage;
import com.slicelife.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class HomepageTest extends BaseTest {

    HomePage homePage;
    AboutUsPage aboutUsPage;

    @BeforeMethod(alwaysRun = true)
    public void inIt(){
        homePage=new HomePage();
        aboutUsPage = new AboutUsPage();
    }

    @Test()
    public void userShouldNavigateToAboutUsPage(){
        homePage.clickOnAboutUs();
        Assert.assertEquals(aboutUsPage.verifyText(),"FOR THE LOVE\n" +
                "OF INDEPENDENTS","Message not displayed");
        System.out.println("This is 1st change");
    }

}
