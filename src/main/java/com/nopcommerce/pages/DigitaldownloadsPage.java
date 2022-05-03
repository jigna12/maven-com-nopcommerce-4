package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class DigitaldownloadsPage extends Utility {
    By digitaldownloads = By.linkText("Digital downloads");// click on the ‘Digital downloads’ Tab
    //Verify the text ‘Digital downloads’
    By verifyDigitaldownloadsText = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    public void clickOnDigitaldownloads(){
        clickOnElement(digitaldownloads);
    }
    public String getVerifyElectronicText(){
        return getTextFromElement(verifyDigitaldownloadsText);
    }
}
