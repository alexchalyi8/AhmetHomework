package com.test.etsy.tests;

import com.test.etsy.pages.EtsyHomePage;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class EtsySearchTest extends EtsyTestBase{
    @Parameters({"data","brandName","brandModel","brandItem"})
    @Test
    public void etsySearchValidation(String data,String brandName,String brandModel,String brandItem) throws InterruptedException {
        EtsyHomePage etsyHomePage=new EtsyHomePage(driver);
        etsyHomePage.searchIphone(data);
        etsyHomePage.headerValidation(brandName,brandModel,brandItem);

    }
}
