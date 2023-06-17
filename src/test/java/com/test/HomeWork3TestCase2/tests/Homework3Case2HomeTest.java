package com.test.HomeWork3TestCase2.tests;

import com.test.HomeWork3TestCase2.pages.Homework3Case2HomePage;
import com.test.HomeWork3TestCase2.pages.Homework3Case2loginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Homework3Case2HomeTest extends Case2TestBase{

    @Parameters({"username","password","laboratoryExpectedMessage","location","pharmacyExpectedMessage"})
    @Test
    public void homePageFunctionality(String username, String password, String laboratoryExpectedMessage ,String location,String pharmacyExpectedMessage) throws InterruptedException {
        Homework3Case2loginPage homework3Case2loginPage = new Homework3Case2loginPage(driver);
        homework3Case2loginPage.loginFunctionality(username,password);
        Homework3Case2HomePage homework3Case2HomePage = new Homework3Case2HomePage(driver);
        homework3Case2HomePage.locationsValidations(laboratoryExpectedMessage,location,pharmacyExpectedMessage);
    }
}
