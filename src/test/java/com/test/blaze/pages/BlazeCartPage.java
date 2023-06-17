package com.test.blaze.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.Arrays;
import java.util.List;

public class BlazeCartPage {
    public BlazeCartPage(WebDriver driver){
        PageFactory.initElements(driver, this);

    }
    @FindBy(xpath = "//tr[@class='success']//td")
    List<WebElement> productsNames;
    @FindBy(xpath = "//button[contains(text(),'Place Order')]")
    WebElement placeorderButton;



public void cartPageValidation( String a,String b){
    List<String>expected = Arrays.asList("",a,b,"");
    for(int i=1;i<productsNames.size()-1;i++){

        Assert.assertEquals(BrowsersUtils.getText(productsNames.get(i)),expected.get(i));

    }


}
public void AddtoCartClick(){
    placeorderButton.click();
}

}
