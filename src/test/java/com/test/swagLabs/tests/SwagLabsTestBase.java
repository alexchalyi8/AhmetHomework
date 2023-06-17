package com.test.swagLabs.tests;

import Utils.BrowsersUtils;
import Utils.ConfigReader;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SwagLabsTestBase {
    public WebDriver driver;

    @BeforeMethod
    public void setup() {
        driver = DriverHelper.getDriver();
        driver.get(ConfigReader.readProperty("QA_swagLabs"));
    }

    @AfterMethod
    public void tearDown(ITestResult iTestResult) {
        if (!iTestResult.isSuccess()) {
            BrowsersUtils.getScreenShot(driver, "swagLabsPictures");
        }
       // driver.quit();
    }
}

