package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility{
    By loginLink = By.linkText("Log in");// click on the ‘Login’ link
    By registerLink = By.linkText("Register");//

    public void clickOnLogInlink(){
        clickOnElement(loginLink);
    }
    public void clickOnRegisterLink(){
        clickOnRegisterLink();
    }





}
