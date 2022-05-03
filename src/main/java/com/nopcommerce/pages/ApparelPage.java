package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class ApparelPage extends Utility {
    By apparelpage = By.linkText("Apparel");//click on the ‘Apparel’ Tab
    //Verify the text ‘Apparel’
    By verifyApparelText = By.xpath("//body/div[6]/div[2]/ul[1]/li[2]/a[1]");

    public void clickOnApparel(){
        clickOnElement(apparelpage);
    }
    public String getVerifyApparelText(){
        return getTextFromElement(verifyApparelText);
    }
}
