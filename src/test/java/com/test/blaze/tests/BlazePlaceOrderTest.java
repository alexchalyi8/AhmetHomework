package com.test.blaze.tests;

import com.test.blaze.pages.*;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BlazePlaceOrderTest extends BlazeTestBase{
    @Parameters({"product","model","alert_message","modelLaptop","price","name","country","city","card","month","year","message","expectedURL"})
    @Test
    public void BlazeOrderValidation(String product,String model,String alert_message ,String modelLaptop,String price, String name,String country,String city,String card,String month,String year,String message,String url) throws InterruptedException {
        BlazeMainPage blazeMainPage = new BlazeMainPage(driver);
        BlazeMacBookPage blazeMacBookPage = new BlazeMacBookPage(driver);
        BlazeLaptopPage blazeLaptopPage = new BlazeLaptopPage(driver);

        blazeMainPage.mainPageFunctionality(product);

        blazeLaptopPage.blazeLaptopFunctionality(model);


        blazeMacBookPage.addedMacbookValidation(driver,alert_message);
        blazeMainPage.cartButtonClick();
        BlazeCartPage blazeCartPage = new BlazeCartPage(driver);
        blazeCartPage.cartPageValidation(modelLaptop,price);
        BlazePlaceOrder blazePlaceOrder = new BlazePlaceOrder(driver);
        blazePlaceOrder.placeOrderInfo(name,country,city,card,month,year,message);
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }

    @Test(dataProvider="orderData",dataProviderClass = BlazeData.class)
    public void BlazeOrderValidation1(String product,String model,String alert_message , String name,String country,String city,String card,String month,String year,String message,String url) throws InterruptedException {
        BlazeMainPage blazeMainPage = new BlazeMainPage(driver);
        BlazeMacBookPage blazeMacBookPage = new BlazeMacBookPage(driver);
        BlazeLaptopPage blazeLaptopPage = new BlazeLaptopPage(driver);

        blazeMainPage.mainPageFunctionality(product);

        blazeLaptopPage.blazeLaptopFunctionality(model);


        blazeMacBookPage.addedMacbookValidation(driver,alert_message);
        blazeMainPage.cartButtonClick();
       BlazeCartPage blazeCartPage = new BlazeCartPage(driver);
       blazeCartPage.AddtoCartClick();
//        blazeCartPage.cartPageValidation(phone,price);
        BlazePlaceOrder blazePlaceOrder = new BlazePlaceOrder(driver);
        blazePlaceOrder.placeOrderInfo(name,country,city,card,month,year,message);
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }
}
