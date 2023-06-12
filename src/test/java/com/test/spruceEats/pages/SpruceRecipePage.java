package com.test.spruceEats.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

public class SpruceRecipePage {
    public SpruceRecipePage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "//input[@id='starRating_score_4Star']")
    WebElement ratingCheckBox;
    @FindBy(xpath = "//label[@for='pop_search_editor']")
    WebElement editorChoiceBox;
    @FindBy(xpath = "//h4[@class='card__title']")
    WebElement productName;
    public void productSelection(WebDriver driver , String expectedProductName) throws InterruptedException {

        if(!ratingCheckBox.isSelected()){
            Thread.sleep(4000);
            BrowsersUtils.clickWithJS(driver,ratingCheckBox);

        }
        Thread.sleep(2000);

        if(editorChoiceBox.isDisplayed()&&!editorChoiceBox.isSelected()){
            Thread.sleep(4000);
            BrowsersUtils.clickWithJS(driver,editorChoiceBox);
        }
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(productName),expectedProductName);
    }
}
