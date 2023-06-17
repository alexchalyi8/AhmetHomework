package com.test.blaze.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlazeMacBookPage {
    public BlazeMacBookPage(WebDriver driver){
        PageFactory.initElements(driver, this);
}
    @FindBy(xpath = "//h2[@class='name']")
    WebElement MacBookProName;
    @FindBy(tagName = "h3")
    WebElement macBookPrice;
    @FindBy (xpath = "//div[@id='more-information']")
    WebElement macBookDescription;
    @FindBy(linkText = "Add to cart")
    WebElement addButton;

    public void macBookInfoValidation(String header,String price,String description) throws InterruptedException {
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(MacBookProName),header);
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(macBookPrice),price);
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(macBookDescription),description);


    }
    public void addedMacbookValidation(WebDriver driver,String alertMessage) throws InterruptedException {
        addButton.click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();

        Assert.assertEquals(alert.getText(),alertMessage);
        Thread.sleep(2000);
        alert.accept();
    }





}
