package com.test.spruceEats.tests;

import com.test.spruceEats.pages.SpruceFishAndSeafoodPage;
import com.test.spruceEats.pages.SpruceMainPage;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SpruceFishAndSeafoodTest extends SpruceTestBase{
    @Test
    public void seafoodOptions() throws InterruptedException {
        SpruceMainPage spruceMainPage = new SpruceMainPage(driver);
        spruceMainPage.ingredientSelection(driver);
        SpruceFishAndSeafoodPage spruceFishAndSeafoodPage = new SpruceFishAndSeafoodPage(driver);
        spruceFishAndSeafoodPage.findReceipt(driver,"Fish for dinner");
    }

}
