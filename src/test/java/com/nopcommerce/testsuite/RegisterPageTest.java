package com.nopcommerce.testsuite;

import com.nopcommerce.pages.HomePage;
import com.nopcommerce.pages.RegisterPage;
import com.nopcommerce.testbase.TestBase;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends TestBase {

    RegisterPage rPage = new RegisterPage();

    @Test
    public void userSholdRegisterAccountSuccessfully()
    {
        rPage.clickOnRegister();
        rPage.clickgendermale();
        rPage.clickgenderfemale();
        rPage.enterfirstname("Krishna");
        rPage.enterlastname("Gothadiya");
        rPage.enterDOBday("15");
        rPage.enterDOBmonth("July");
        rPage.enterDOByear("2010");
        rPage.enteremail("kag52@gmail.com");
        rPage.enterpassword("kag123");
        rPage.enterconfirmpassword("kag123");
        rPage.clickOnRegisterbutton();
        Assert.assertEquals("Your registration completed", rPage.verifyregister());

    }
}
