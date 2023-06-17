package com.test.blaze.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class BlazePlaceOrder {
    public  BlazePlaceOrder(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='name']")
    WebElement name;
    @FindBy(xpath = "//input[@id='country']")
    WebElement country;
    @FindBy(xpath = "//input[@id='city']")
    WebElement city;
    @FindBy(xpath = "//input[@id='card']")
    WebElement card;
    @FindBy(xpath = "//input[@id='month']")
    WebElement month;
    @FindBy(xpath = "//input[@id='year']")
    WebElement year;
    @FindBy (xpath = "//button[@onclick='purchaseOrder()']")
    WebElement purchaseBtn;
    @FindBy(xpath = "//div[@class='sweet-alert  showSweetAlert visible']//h2[.='Thank you for your purchase!']")
    WebElement alertMessage;
    @FindBy(xpath = "//button[.='OK']")
    WebElement okButton;
    public void placeOrderInfo(String name1,String country1,String city1,String card1,String month1,String year1,String message) throws InterruptedException {
        name.sendKeys(name1);
        country.sendKeys(country1);
        city.sendKeys(city1);
        card.sendKeys(card1);
        month.sendKeys(month1);
        year.sendKeys(year1);
        purchaseBtn.click();
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(alertMessage),message);
        okButton.click();
    }

}
