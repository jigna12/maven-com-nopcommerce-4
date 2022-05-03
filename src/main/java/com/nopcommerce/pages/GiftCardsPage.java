package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class GiftCardsPage extends Utility {
    By Giftcards = By.linkText("Gift Cards");//click on the ‘Gift Cards’ Tab
    //Verify the text ‘Gift Cards’
    By verifyGiftcardText = By.xpath("//body/div[6]/div[2]/ul[1]/li[7]/a[1]");

    public void clickOnGiftCards(){
        clickOnElement(Giftcards);
    }
    public String getVerifyGiftcardsText(){
        return getTextFromElement(verifyGiftcardText);
    }
}
