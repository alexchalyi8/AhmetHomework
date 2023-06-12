package com.test.spruceEats.tests;

import com.test.spruceEats.pages.SpruceFishAndSeafoodPage;
import com.test.spruceEats.pages.SpruceMainPage;
import com.test.spruceEats.pages.SpruceRecipePage;
import org.testng.annotations.Test;

public class SpruseProductSelectioTest extends SpruceTestBase{
    @Test
    public void productSelection() throws InterruptedException {
        SpruceMainPage spruceMainPage = new SpruceMainPage(driver);
        spruceMainPage.ingredientSelection(driver);
        SpruceFishAndSeafoodPage spruceFishAndSeafoodPage = new SpruceFishAndSeafoodPage(driver);
        spruceFishAndSeafoodPage.findReceipt(driver,"Fish for dinner");
        SpruceRecipePage spruceRecipePage= new SpruceRecipePage(driver);
        spruceRecipePage.productSelection(driver,"6-Ingredient Roasted Salmon Fillets");
    }
}
