package com.nopcommerce.pages;

import com.nopcommerce.utility.Utility;
import org.openqa.selenium.By;

public class RegisterPage extends Utility {
    By Register = By.linkText("Register");//click on the ‘Register’ link
    By gendermale = By.id("gender-male");//click on the ‘Register’ link
    By genderfemale = By.id("gender-female");
    By firstname = By.id("FirstName");//Enter First name
    By lastname = By.id("LastName");//Enter Last name
    By dateofbirthday = By.name("DateOfBirthDay");//Select Day Month and Year
    By dateofbirthmonth = By.name("DateOfBirthMonth");
    By dateofbirthyear = By.name("DateOfBirthYear");
    By emailfield = By.id("Email");// Enter Email address
    By passwordfield = By.name("Password");//Enter Password
    By confirmpassword = By.name("ConfirmPassword");// Enter Confirm password
    By registerbutton = By.name("register-button");// Click on REGISTER button
    By verifyMessage = By.xpath("//div[contains(text(),'Your registration completed')]");//Verify the text 'Your registration completed'


    public void clickOnRegister()
    {
        clickOnElement(Register);
    }
    public void clickgendermale()
    {
        clickOnElement(gendermale);
    }
    public void clickgenderfemale()
    {
       clickOnElement(genderfemale);
    }
    public void enterfirstname(String Fname)
    {
        sendTextToElement(firstname,Fname);
    }
    public void enterlastname(String Lname)
    {
        sendTextToElement(lastname,Lname);
    }
    public void enterDOBday(String day)
    {
        sendTextToElement(dateofbirthday,day);
    }
    public void enterDOBmonth(String month)
    {
        sendTextToElement(dateofbirthmonth,month);
    }
    public void enterDOByear(String year)
    {
        sendTextToElement(dateofbirthyear,year);
    }
    public void enteremail(String email)
    {
        sendTextToElement(emailfield,email);
    }
    public void enterpassword(String password)
    {
        sendTextToElement(passwordfield,password);
    }
    public void enterconfirmpassword(String cpassword)
    {
        sendTextToElement(confirmpassword,cpassword);
    }
    public void clickOnRegisterbutton()
    {
        clickOnElement(registerbutton);
    }
    public String verifyregister()
    {
      return getTextFromElement(verifyMessage);
    }

}