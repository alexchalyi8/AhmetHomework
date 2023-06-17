package com.test.swagLabs.tests;

import com.test.swagLabs.pages.SauceDemoMainPage;
import com.test.swagLabs.pages.SwagLabsLoginPage;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SauceDemoMainTest extends SwagLabsTestBase{
    @Test(dataProvider="loginNewAndValidation",dataProviderClass= SwagLabsAllData.class)
    public void mainPageTest(String keyword ,String header,String word,String price) throws InterruptedException {
        SauceDemoMainPage sauceDemoMainPage = new SauceDemoMainPage(driver);
        sauceDemoMainPage.loginToTheSite();
        sauceDemoMainPage.productChoose(keyword);
        sauceDemoMainPage.productValidation(header,word,price);


    }
}
