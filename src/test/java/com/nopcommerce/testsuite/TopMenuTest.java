package com.nopcommerce.testsuite;

import com.nopcommerce.pages.*;
import com.nopcommerce.testbase.TestBase;
import org.testng.annotations.Test;


public class TopMenuTest extends TestBase {
    HomePage homePage = new HomePage();
    ComputersPage cpage = new ComputersPage();
    ElectronicsPage epage = new ElectronicsPage();
    ApparelPage apage = new ApparelPage();
    DigitaldownloadsPage dpage = new DigitaldownloadsPage();
    BooksPage bpage = new BooksPage();
    JewelryPage jpage = new JewelryPage();
    GiftCardsPage gpage = new GiftCardsPage();
    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        cpage.clickOnComputers();
    }
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        epage.clickOnElectronic();
    }
    public void userShouldNavigateToApparelPageSuccessfully(){
        apage.clickOnApparel();
    }
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully(){
        dpage.clickOnDigitaldownloads();
    }
    public void userShouldNavigateToBooksPageSuccessfully(){
        bpage.clickOnBooksPage();
    }
    public void userShouldNavigateToGiftCardsPageSuccessfully()
    {
       gpage.clickOnGiftCards();
    }
}
