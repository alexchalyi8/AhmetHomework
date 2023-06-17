package com.test.HomeWork3TestCase2.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homework3Case2loginPage {
    public Homework3Case2loginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//li[@id='Laboratory']")
    WebElement laboratoryBtn;
    @FindBy(xpath = "//input[contains(@id,'loginButton')]")
    WebElement loginBtn;


    public void loginFunctionality(String username,String password) throws InterruptedException {
        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        laboratoryBtn.click();
        Thread.sleep(2000);
        loginBtn.click();

    }
}

