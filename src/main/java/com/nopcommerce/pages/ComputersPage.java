package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ComputersPage extends Utility {
    By computers = By.linkText("Computers");//click on the ‘Computers’ Tab
    //Verify the text ‘Computers’
    By verifyComputerText = By.xpath("//h1[contains(text(),'Computers')]");

    public void clickOnComputers(){
        clickOnElement(computers);
    }
    public String getVerifyComputerText(){
        return getTextFromElement(verifyComputerText);
    }
}
