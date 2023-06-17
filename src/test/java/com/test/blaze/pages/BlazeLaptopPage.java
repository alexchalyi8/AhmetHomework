package com.test.blaze.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class BlazeLaptopPage {
    public BlazeLaptopPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//h4[@class='card-title']")
    List<WebElement> laptopNames;
    public void blazeLaptopFunctionality(String laptopModel) throws InterruptedException {
        Thread.sleep(2000);
        for(WebElement laptopName:laptopNames){
            if(BrowsersUtils.getText(laptopName).equals(laptopModel)){
                laptopName.click();break;
            }
        }
    }
}