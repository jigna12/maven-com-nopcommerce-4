package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class BooksPage extends Utility {
    By booksPage = By.linkText("Books");//click on the ‘Books’ Tab
    // Verify the text ‘Books’
    By verifyBooksText = By.xpath("//body/div[6]/div[2]/ul[1]/li[5]/a[1]");

    public void clickOnBooksPage(){
        clickOnElement(booksPage);
    }
    public String getVerifyBooksPageText(){
        return getTextFromElement(verifyBooksText);
    }
}
