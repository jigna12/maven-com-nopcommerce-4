package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.Loginpage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends TestBase {
    HomePage homePage = new HomePage();
    Loginpage loginpage = new Loginpage();
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        loginpage.clickOnLoginTab();
        loginpage.enterEmail("kag1@gmail.com");
        loginpage.enterPassword("kag1234");
        loginpage.EnterLogin();
    }
    @Test
    public void verifyTheErrorMessage() {
        loginpage.clickOnLoginTab();
        loginpage.enterEmail("kag1@gmail.com");
        loginpage.enterPassword("kag1234");
        loginpage.EnterLogin();

        Assert.assertEquals("Login was unsuccessful. Please correct the errors and try again.\n"+"No customer account found",loginpage.getVerifyMessage());
    }
    }


