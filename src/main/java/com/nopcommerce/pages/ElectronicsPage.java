package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ElectronicsPage extends Utility {
    By electronic = By.linkText("Electronics");//click on the ‘Electronics’ Tab
    //Verify the text ‘Electronics’
    By verifyElectronicsText = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    public void clickOnElectronic(){
        clickOnElement(electronic);
    }
    public String getVerifyElectronicText(){
        return getTextFromElement(verifyElectronicsText);
    }
}
