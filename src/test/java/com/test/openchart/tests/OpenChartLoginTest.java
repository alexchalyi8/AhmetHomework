package com.test.openchart.tests;

import com.test.openchart.pages.OpenChartLoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenChartLoginTest extends OpenChartTestBase {
    @Test
    public void happyPathLogin() throws InterruptedException {
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        openChartLoginPage.loginPageFunctionality("demo","demo");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle().trim(),"Dashboard");
    }
    @Test
    public void validateNegative() throws InterruptedException {
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        openChartLoginPage.loginPageFunctionality("dedef","efce");
        Thread.sleep(2000);
        Assert.assertEquals(openChartLoginPage.errorMessage(),"No match for Username and/or Password.");
    }
}
