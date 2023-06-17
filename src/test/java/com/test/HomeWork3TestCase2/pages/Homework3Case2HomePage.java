package com.test.HomeWork3TestCase2.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class Homework3Case2HomePage {
    public Homework3Case2HomePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(tagName = "h4")
    WebElement laboratoryActualMessage;
    @FindBy(tagName = "span")
    WebElement locationDropDown;
    @FindBy(xpath = "//li[@locationname='Pharmacy']")
    WebElement pharmacyBtn;
    @FindBy(css = ".logo")
    WebElement logoOpenMRS;
    @FindBy(xpath = "//h4[contains(text(),'Pharmacy')]")
    WebElement pharmacyActualMessage;
    @FindBy(linkText = "Find Patient Record")
    WebElement findPatientrecordBtn;






public void locationsValidations(String laboratoryExpectedMessage,String location, String pharmacyExpectedMessage) throws InterruptedException {
    Assert.assertEquals(BrowsersUtils.getText(laboratoryActualMessage),laboratoryExpectedMessage);
    Assert.assertEquals(BrowsersUtils.getText(locationDropDown),location);
    Thread.sleep(2000);
    locationDropDown.click();
    Thread.sleep(1000);
    pharmacyBtn.click();
    Thread.sleep(2000);
    logoOpenMRS.click();
    Assert.assertEquals(BrowsersUtils.getText(pharmacyActualMessage),pharmacyExpectedMessage);
    Thread.sleep(2000);
    findPatientrecordBtn.click();
}

}
