package com.test.swagLabs.pages;

import Utils.BrowsersUtils;
import Utils.ConfigReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class SauceDemoMainPage {
    public SauceDemoMainPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(css = "#user-name")
    WebElement username;
    @FindBy(css = "#password")
    WebElement password;
    @FindBy(css = "#login-button")
    WebElement loginBtn;
    @FindBy (css = ".inventory_item_name")
    List<WebElement> products;
    @FindBy(xpath = "//div[@class='inventory_details_name large_size']")
    WebElement productHeader;
    @FindBy(xpath = "//div[@class='inventory_details_desc large_size']")
    WebElement productDescription;
    @FindBy(xpath = "//div[@class='inventory_details_price']")
    WebElement productPrice;
    public void loginToTheSite(){
        username.sendKeys(ConfigReader.readProperty("QA_sauceUsername"));
        password.sendKeys(ConfigReader.readProperty("QA_sausePassword"));
        loginBtn.click();
    }
    public void productChoose(String keyWord){

        for(WebElement product:products){
            if(BrowsersUtils.getText(product).equals(keyWord)){
                product.click();
                break;
            }
        }

    }
    public void productValidation(String header,String word,String price){
        Assert.assertEquals(BrowsersUtils.getText(productHeader),header);
        Assert.assertTrue(BrowsersUtils.getText(productDescription).contains(word));
        Assert.assertEquals(BrowsersUtils.getText(productPrice),price);


}




}
