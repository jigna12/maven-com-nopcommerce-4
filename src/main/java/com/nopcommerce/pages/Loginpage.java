package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class Loginpage extends Utility {
    By LoginbuttonField = By.linkText("Log in");//Find log in Link and Click on Login link
    By emailField = By.name("Email");//Find the Email field
    By passwordField = By.name("Password");//Find the password field
    By clickLoginField = By.xpath("//button[contains(text(),'Log in')]");//Find the login button field and click
    By verifyMessage = By.xpath("//div[@class='message-error validation-summary-errors']");

    public void clickOnLoginTab()
    {
        clickOnElement(LoginbuttonField);
    }
    public void enterEmail(String email)
    {
        sendTextToElement(emailField,email);
    }
    public void enterPassword(String password)
    {
        sendTextToElement(passwordField, password);
     }
    public void EnterLogin()
    {
        clickOnElement(clickLoginField);
    }
    public String getVerifyMessage(){
        return getTextFromElement(verifyMessage);

    }

}
