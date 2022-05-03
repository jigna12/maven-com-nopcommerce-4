package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class JewelryPage extends Utility {
    By jewelryPage = By.linkText("Jewelry");//click on the ‘Jewelry’ Tab
    //Verify the text ‘Jewelry’
    By verifyJewelryPageText = By.xpath("//body/div[6]/div[2]/ul[1]/li[6]/a[1]");

    public void clickOnJewelryPage(){
        clickOnElement(jewelryPage);
    }
    public String getVerifyJewelryPageText(){
        return getTextFromElement(verifyJewelryPageText);
    }
}
