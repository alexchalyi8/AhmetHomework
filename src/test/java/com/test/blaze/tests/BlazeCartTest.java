package com.test.blaze.tests;

import Utils.ConfigReader;
import com.test.blaze.pages.*;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazeCartTest extends BlazeTestBase{
    @Parameters({"product","model","alert_message"})
    @Test
    public void cartPageValidation(String product,String model,String alert_message) throws InterruptedException {
        BlazeMainPage blazeMainPage = new BlazeMainPage(driver);
        BlazeMacBookPage blazeMacBookPage = new BlazeMacBookPage(driver);
        BlazeLaptopPage blazeLaptopPage = new BlazeLaptopPage(driver);

        blazeMainPage.mainPageFunctionality(product);

        blazeLaptopPage.blazeLaptopFunctionality(model);


        blazeMacBookPage.addedMacbookValidation(driver,alert_message);
        blazeMainPage.cartButtonClick();
        BlazeCartPage blazeCartPage = new BlazeCartPage(driver);
        blazeCartPage.cartPageValidation(ConfigReader.readProperty("QA_Blaze_Laptop_Brand"),ConfigReader.readProperty("QA_Blaze_Laptop_Price"));


    }
}
