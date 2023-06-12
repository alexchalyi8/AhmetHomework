package com.test.spruceEats.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SpruceMainPage {
    public SpruceMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy (xpath = "//span[.='Ingredients']")
    WebElement ingredientsButton;
    @FindBy(xpath = "//li[@class='global-nav__sub-list-item']//a[.='Fish & Seafood']")
    WebElement fishAndSeafood;


public void ingredientSelection(WebDriver driver) throws InterruptedException {
    Actions actions= new Actions(driver);
    actions.moveToElement(ingredientsButton).perform();
    Thread.sleep(2000);
    actions.moveToElement(fishAndSeafood).perform();
    Thread.sleep(2000);
    actions.click(fishAndSeafood).perform();

}

}

