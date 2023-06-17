package com.test.etsy.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class EtsyHomePage {
    public EtsyHomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "#global-enhancements-search-query")
    WebElement searchBar;
    @FindBy(xpath = "//h3[contains(@class,'listing-card__title')]")
    List<WebElement> headers;

    public void searchIphone(String data) throws InterruptedException {
        searchBar.sendKeys(data);
        Thread.sleep(2000);
        searchBar.sendKeys(Keys.ENTER);
    }

    public void headerValidation(String brandName, String brandModel, String brandItem) {
        for (WebElement header : headers) {//70
            String text=BrowsersUtils.getText(header).toLowerCase();
            Assert.assertTrue(text.contains(brandName) || text.contains(brandModel) || text.contains(brandItem));
            {

            }
        }
    }
}
