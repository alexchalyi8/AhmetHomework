package com.test.blaze.tests;

import Utils.ConfigReader;
import com.test.blaze.pages.BlazeLaptopPage;
import com.test.blaze.pages.BlazeMacBookPage;
import com.test.blaze.pages.BlazeMainPage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazeInfoTest extends BlazeTestBase {
    @Parameters({"product","model","modelLaptop","priceForMac","alert_message"})
    @Test
    public void macBookValidation(String product,String model,String modelLaptop,String priceForMac,String alert_message) throws InterruptedException {
        BlazeMainPage blazeMainPage = new BlazeMainPage(driver);
        BlazeMacBookPage blazeMacBookPage = new BlazeMacBookPage(driver);
        BlazeLaptopPage blazeLaptopPage = new BlazeLaptopPage(driver);

        blazeMainPage.mainPageFunctionality(product);

        blazeLaptopPage.blazeLaptopFunctionality(model);

        blazeMacBookPage.macBookInfoValidation(modelLaptop,priceForMac, ConfigReader.readProperty("productionDescription"));

        blazeMacBookPage.addedMacbookValidation(driver,alert_message);
    }

}
