package com.test.spruceEats.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class SpruceFishAndSeafoodPage {
    public SpruceFishAndSeafoodPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#search-form-input")
    WebElement findReceiptWindow;




    public void findReceipt(WebDriver driver,String receipt) throws InterruptedException {
        Thread.sleep(2000);
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].ScrollIntoView(true)",findReceiptWindow);
        Actions actions = new Actions(driver);
        actions.moveToElement(findReceiptWindow);
        Thread.sleep(2000);
        findReceiptWindow.sendKeys(receipt);
        Thread.sleep(2000);
        findReceiptWindow.sendKeys(Keys.ENTER);

    }
}
