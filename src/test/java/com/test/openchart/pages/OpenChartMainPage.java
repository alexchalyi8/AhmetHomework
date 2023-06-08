package com.test.openchart.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenChartMainPage {
    public OpenChartMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (css = ".btn-close")
    WebElement closeButton;
    @FindBy(css = "#menu-customer")
    WebElement customerMainButton;
    @FindBy(xpath = "//ul[@class='collapse show']//a[contains(text(),'Customers')]")
    WebElement customerSubButton;

    public void mainPageFunctionality() throws InterruptedException {
        closeButton.click();
        Thread.sleep(2000);
        customerMainButton.click();
        Thread.sleep(2000);
        customerSubButton.click();
    }









}
