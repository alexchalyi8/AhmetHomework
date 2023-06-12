package com.test.spruceEats.tests;

import Utils.BrowsersUtils;
import Utils.DriverHelper;
import org.openqa.selenium.WebDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class SpruceTestBase {
    public WebDriver driver;


    @BeforeMethod
    public void setup(){
        driver= DriverHelper.getDriver();
        driver.get("https://www.thespruceeats.com/");
    }
    @AfterMethod
    public void tearDown(ITestResult iTestResult){
        if(!iTestResult.isSuccess()){
            BrowsersUtils.getScreenShot(driver,"sprucePictures");
        }
        driver.quit();
    }
}
