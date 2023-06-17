package com.test.homework3TestCase1.tests;

import com.test.homework3TestCase1.pages.Homework3LoginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Homeork3LoginTest extends Homework3TestBase{
    @Parameters({"Username","Password","name","item1","item2"})
    @Test
    public void customerLogin(String Username,String Password,String name,String item1,String item2) throws InterruptedException {
        Homework3LoginPage homework3LoginPage = new Homework3LoginPage(driver);
        homework3LoginPage.customerRegistartion(Username,Password,name);
        homework3LoginPage.cartAddingValidation(driver,item1,item2);
        homework3LoginPage.cartItemsValidation(item1,item2);
    }


  }


