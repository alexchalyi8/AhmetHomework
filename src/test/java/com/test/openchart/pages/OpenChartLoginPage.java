package com.test.openchart.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class OpenChartLoginPage {
    public OpenChartLoginPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }
    @FindBy(css = "#input-username")
    WebElement userName;
    @FindBy(css = "#input-password")
    WebElement password;
    @FindBy(tagName = "button")
    WebElement loginButton;
    @FindBy (css = "#alert")
    WebElement errorMessage;



    public void loginPageFunctionality(String userName,String password) throws InterruptedException {
        this.userName.sendKeys(userName);
        Thread.sleep(2000);
        this.password.sendKeys(password);
        Thread.sleep(2000);
        loginButton.click();

    }
    public String errorMessage(){
        return BrowsersUtils.getText(errorMessage);
    }
    public void titleValidation(WebDriver driver,String expectedTitle){
        String actualTitle = driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitle);
    }
}

