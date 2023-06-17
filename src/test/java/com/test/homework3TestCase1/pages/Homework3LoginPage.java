package com.test.homework3TestCase1.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.List;

public class Homework3LoginPage {
    public Homework3LoginPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//input[@name='username']")
    WebElement usernameBox;
    @FindBy(xpath = "//input[@name='password']")
    WebElement passwordBox;

    @FindBy(xpath = "//button[contains(@name,'loginbtn')]")
    WebElement loginButton;
    @FindBy(linkText = "username")
    WebElement usernameLogo;
    @FindBy(xpath = "//div[@class='row disp']//button[contains(@class,'btn-primary')]")
    List<WebElement> addButtons;
    @FindBy(tagName = "h5")
    List<WebElement>productTitles;
    @FindBy(xpath = "//div[@class='row']//a[.='Cart']")
    WebElement cartBtn;
    @FindBy(tagName = "td[2]")
    List<WebElement>vaccineNames;

    public void customerRegistartion(String Username,String Password,String name) throws InterruptedException {
        usernameBox.clear();
        Thread.sleep(2000);
        passwordBox.clear();

        usernameBox.sendKeys(Username);
        passwordBox.clear();
        Thread.sleep(1000);
        passwordBox.sendKeys(Password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(usernameLogo),name);

    }
    public void customerRegistartionTesting(String Username,String Password,String name) throws InterruptedException {
        usernameBox.clear();
        Thread.sleep(2000);
        passwordBox.clear();

        usernameBox.sendKeys(Username);
        passwordBox.clear();
        Thread.sleep(1000);
        passwordBox.sendKeys(Password);
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        Assert.assertEquals(BrowsersUtils.getText(usernameLogo),name);

    }






public void cartAddingValidation(WebDriver driver,String item1,String item2) throws InterruptedException {
        for(int i=0;i< productTitles.size();i++){
            String name= BrowsersUtils.getText(productTitles.get(i));
            if(name.contains(item1)||name.contains(item2)){
                Thread.sleep(2000);
               BrowsersUtils.clickWithJS(driver, addButtons.get(i));

            }

        }


    }

    public void cartItemsValidation(String item1,String item2) throws InterruptedException {
        cartBtn.click();
        Thread.sleep(2000);
        for(WebElement vaccine:vaccineNames){
            Assert.assertTrue(BrowsersUtils.getText(vaccine).equals(item1)||BrowsersUtils.getText(vaccine).equals(item2));
        }



}





}
