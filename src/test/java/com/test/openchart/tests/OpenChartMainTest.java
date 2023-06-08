package com.test.openchart.tests;

import com.test.openchart.pages.OpenChartLoginPage;
import com.test.openchart.pages.OpenChartMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenChartMainTest extends OpenChartTestBase{
    @Test
    public void mainPageFunctionality() throws InterruptedException {
        OpenChartMainPage openChartMainPage = new OpenChartMainPage(driver);
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        openChartLoginPage.loginPageFunctionality("demo","demo");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle().trim(),"Dashboard");
        openChartMainPage.mainPageFunctionality();

    }
}
