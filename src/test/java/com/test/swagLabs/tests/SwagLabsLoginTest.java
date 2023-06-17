package com.test.swagLabs.tests;

import com.test.swagLabs.pages.SwagLabsLoginPage;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SwagLabsLoginTest extends SwagLabsTestBase{
    @Test(dataProvider = "positiveLogin",dataProviderClass = SwagLabsAllData.class)
    public void validateSuccessfulLogin(String username, String password, String url) throws InterruptedException {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
        swagLabsLoginPage.login(username,password);
        Assert.assertEquals(driver.getCurrentUrl(),url);

    }
    @Test(dataProvider = "negativeLogin",dataProviderClass = SwagLabsAllData.class)
    public void validateNegativeLogin(String username, String password, String expectedMessage) throws InterruptedException {
        SwagLabsLoginPage swagLabsLoginPage = new SwagLabsLoginPage(driver);
        swagLabsLoginPage.login(username,password);
        Assert.assertEquals(swagLabsLoginPage.errorMessage(),expectedMessage);

    }



}
