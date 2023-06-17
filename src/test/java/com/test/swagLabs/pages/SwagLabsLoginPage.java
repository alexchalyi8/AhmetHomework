package com.test.swagLabs.pages;

import Utils.BrowsersUtils;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import static Utils.DriverHelper.driver;

public class SwagLabsLoginPage {
    public SwagLabsLoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#user-name")
    WebElement username;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#login-button")
    WebElement loginBtn;
    @FindBy(tagName = "h3")
    WebElement errorMessage;
    public void login(String username,String password) throws InterruptedException {
        this.username.sendKeys(username);
        Thread.sleep(2000);
        this.password.sendKeys(password);
        Thread.sleep(2000);
        loginBtn.click();


    }
    public String errorMessage(){
        return  BrowsersUtils.getText(errorMessage);
    }
}
