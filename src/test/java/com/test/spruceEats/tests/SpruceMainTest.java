package com.test.spruceEats.tests;

import com.test.spruceEats.pages.SpruceMainPage;
import org.testng.annotations.Test;

public class SpruceMainTest extends SpruceTestBase{
    @Test
    public void mainPageOptionSelection() throws InterruptedException {
        SpruceMainPage spruceMainPage = new SpruceMainPage(driver);
        spruceMainPage.ingredientSelection(driver);
    }
}
