package com.test.openchart.tests;

import com.test.openchart.pages.OpenChartCustomerPage;
import com.test.openchart.pages.OpenChartLoginPage;
import com.test.openchart.pages.OpenChartMainPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class OpenChartCustomerTest extends OpenChartTestBase{

    @Test
    public void customerPageFunctionality() throws InterruptedException {
        OpenChartMainPage openChartMainPage = new OpenChartMainPage(driver);
        OpenChartLoginPage openChartLoginPage = new OpenChartLoginPage(driver);
        OpenChartCustomerPage openChartCustomerPage = new OpenChartCustomerPage(driver);
        openChartLoginPage.loginPageFunctionality("demo","demo");
        Thread.sleep(2000);
        Assert.assertEquals(driver.getTitle().trim(),"Dashboard");
        openChartMainPage.mainPageFunctionality();
        openChartCustomerPage.customerPageFunctionality("Alex","Chalyi","alex90@gmail.com","988384432","12334341dd",driver);
        Assert.assertEquals(openChartCustomerPage.errorMessage(),"Warning: You do not have permission to modify customers!");









    }
}
