package com.test.HomeWork3TestCase2.tests;

import com.test.HomeWork3TestCase2.pages.Homework3Case2loginPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Homework3Case2LoginTest extends Case2TestBase{
    @Parameters({"username","password"})
    @Test
    public void loginFunctionalityValidation(String username,String password) throws InterruptedException {
        Homework3Case2loginPage homework3Case2loginPage = new Homework3Case2loginPage(driver);
        homework3Case2loginPage.loginFunctionality(username,password);
    }
}
