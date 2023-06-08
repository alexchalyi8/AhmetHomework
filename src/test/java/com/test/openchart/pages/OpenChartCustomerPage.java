package com.test.openchart.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OpenChartCustomerPage {
   public OpenChartCustomerPage(WebDriver driver){
       PageFactory.initElements(driver,this);

   }
@FindBy (xpath = "//a[@aria-label='Add New']")
    WebElement addCustomerButton;
   @FindBy (css ="#input-firstname")
    WebElement firstName;
   @FindBy(css= "#input-lastname")
    WebElement lastName;
   @FindBy(xpath = "//input[@id='input-email']")
    WebElement email;
   @FindBy(xpath = "//input[@id='input-telephone']")
    WebElement telephone;
   @FindBy(xpath = "//input[@id='input-password']")
    WebElement password;
   @FindBy(xpath = "//input[@id='input-confirm']")
    WebElement passwordConfirm;
   @FindBy(css = "#input-newsletter")
    WebElement newslatterButton;
   @FindBy(css = "#input-status")
    WebElement statusButton;
   @FindBy(css = "#input-safe")
    WebElement safeButton;
   @FindBy(xpath = "//button[@form='form-customer']")
    WebElement saveButton;
   @FindBy(xpath = "//div[@class='alert alert-danger alert-dismissible']")
   WebElement errorMessage;



   public void customerPageFunctionality(String firstname,String lastname,String email,String telephone,String password,WebDriver driver) throws InterruptedException {
       addCustomerButton.click();
       Thread.sleep(2000);
       firstName.sendKeys(firstname);
       lastName.sendKeys(lastname);
       this.email.sendKeys(email);
       this.telephone.sendKeys(telephone);
       Thread.sleep(2000);
       this.password.sendKeys(password);
       passwordConfirm.sendKeys(password);
       Thread.sleep(2000);
       JavascriptExecutor js = (JavascriptExecutor) driver;
       js.executeScript("arguments[0].scrollIntoView(true)",newslatterButton);
       if(newslatterButton.isDisplayed() && !newslatterButton.isSelected()){
           Thread.sleep(2000);
           newslatterButton.click();
       }
       if(statusButton.isDisplayed()&&!statusButton.isSelected()){
           Thread.sleep(2000);
           statusButton.click();
       }
        if(safeButton.isDisplayed()&&!safeButton.isSelected()){
            Thread.sleep(2000);
            safeButton.click();
        }

       js.executeScript("arguments[0].scrollIntoView(true)",saveButton);
       Thread.sleep(2000);


        saveButton.click();


   }
public String errorMessage(){
       return this.errorMessage.getText().trim();
}









}
