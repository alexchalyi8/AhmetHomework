package com.test.HomeWork3TestCase2.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3Case2RegisterPatientPage {
    public Homework3Case2RegisterPatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);

    }

    @FindBy(linkText = "Register a patient")
    WebElement registerPatientBtn;
    @FindBy(xpath = "//input[@name='givenName']")
    WebElement firstnameForPatientReg;
    @FindBy(xpath = "//input[@name='familyName']")
    WebElement lastnameForPatientReg;
    @FindBy(xpath = "//span[@id='genderLabel']")
    WebElement patientGenderBtn;
    @FindBy(xpath = "//select[@id='gender-field']")
    WebElement selectGenderBox;
    @FindBy(xpath = "//span[@id='birthdateLabel']")
    WebElement birthdayBtn;
    @FindBy(xpath = "//input[@id='birthdateDay-field']")
    WebElement birthdayDaybox;
    @FindBy(xpath = "//select[@id='birthdateMonth-field']")
    WebElement birthdayMonthbox;
    @FindBy(xpath = "//input[@id='birthdateYear-field']")
    WebElement bithdayYearbox;
    @FindBy(xpath = "//ul//li[@class='question-legend']//span[.='Address']")

    WebElement addressBtn;
    @FindBy(xpath = "//input[@id='address1']")
    WebElement addressBox;
    @FindBy(xpath = "//input[@id='cityVillage']")
    WebElement cityBox;
    @FindBy(xpath = "//input[@id='stateProvince']")
    WebElement stateBox;
    @FindBy(xpath = "//input[@id='country']")
    WebElement countryBox;
    @FindBy(xpath = "//input[@id='postalCode']")
    WebElement postalcodeBox;
    @FindBy(xpath = "//li[contains(@class,'question-legend')]//span[.='Phone Number']")
    //ul//li[@class='question-legend']//span[.='Phone Number']
    WebElement phoneNumberBtn;
    @FindBy(xpath = "//input[@name='phoneNumber']")
    WebElement phonenumberBox;
    @FindBy(xpath = "//span[@id='confirmation_label']")
    WebElement confirmationLabel;
    @FindBy(xpath = "//div[@id='confirmation']//div[@id='dataCanvas']")
    //div[@id='dataCanvas']
    WebElement namesScopeForValidation;
    @FindBy(xpath = "//input[@id='submit']")
    WebElement confirmButton;
    //    @FindBy(tagName = "h1")
//    WebElement newPatientNameForValidation;
    @FindBy(xpath = "//div[@class='identifiers']//span")
    WebElement newPatientId;
    @FindBy(css = ".logo")
    WebElement logoOpenMRS;
    @FindBy(linkText = "Find Patient Record")
    WebElement findPatientrecordBtn;
    @FindBy(xpath = "//input[@id='patient-search']")
    WebElement patientSearchBar;
    @FindBy(xpath = "//tr//td[1]")
    List<WebElement> identifiers;
    @FindBy(xpath = "//tr//td[2]")
    List<WebElement> patientNames;
    @FindBy(xpath = "//span[@class='PersonName-givenName']")
    WebElement firstNameforValidation;
    @FindBy(xpath = "//span[@class='PersonName-familyName']")
    WebElement lasNameForValidation;
    @FindBy(xpath = "//td[.='Alex Chalyi']")
    WebElement AlexChalyiForDelete;
    @FindBy(xpath = "//li//i[@class='icon-remove']")
    WebElement deletePatientBtn;
    @FindBy(xpath = "//input[@id='delete-reason']")
    WebElement deleteReasonBar;
    @FindBy(xpath = "//div[@id='delete-patient-creation-dialog']//div[@class='dialog-content']//button[@class='confirm right']")
    WebElement confirmBtnForPatientDelete;



    //***********
    @FindBy(xpath = "//input[@id='username']")
    WebElement usernameInput;
    @FindBy(xpath = "//input[@id='password']")
    WebElement passwordInput;
    @FindBy(xpath = "//li[@id='Laboratory']")
    WebElement laboratoryBtn;
    @FindBy(xpath = "//input[contains(@id,'loginButton')]")
    WebElement loginBtn;
    @FindBy(tagName = "h6")
    WebElement errorMessageWhenDelitingPatient;



    public void patientRegistration(WebDriver driver) throws InterruptedException {
        usernameInput.sendKeys("admin");
        passwordInput.sendKeys("Admin123");
        Thread.sleep(2000);
        laboratoryBtn.click();
        Thread.sleep(2000);
        loginBtn.click();

        registerPatientBtn.click();
        Thread.sleep(2000);
        firstnameForPatientReg.sendKeys("Alex");
        lastnameForPatientReg.sendKeys("Chalyi");
        patientGenderBtn.click();

        BrowsersUtils.selectBy(selectGenderBox, "M", "value");
        Thread.sleep(2000);
        birthdayBtn.click();
        Thread.sleep(2000);
        birthdayDaybox.sendKeys("20");
        BrowsersUtils.selectBy(birthdayMonthbox, "4", "value");
        bithdayYearbox.sendKeys("2000");
        Thread.sleep(2000);

        BrowsersUtils.clickWithJS(driver, addressBtn);
        addressBox.sendKeys("2200 E Devon ave");
        cityBox.sendKeys("Des Plains");
        stateBox.sendKeys("IL");
        countryBox.sendKeys("USA");
        postalcodeBox.sendKeys("60018");
        Thread.sleep(2000);
        phoneNumberBtn.click();
        phonenumberBox.sendKeys("996 52 18 0592");
        Thread.sleep(2000);
        confirmationLabel.click();
        Assert.assertTrue(BrowsersUtils.getText(namesScopeForValidation).contains("Alex"));
        // System.out.println(BrowsersUtils.getText(namesScopeForValidation));
        confirmButton.click();
        //System.out.println(BrowsersUtils.getText(newPatientNameForValidation));
        Assert.assertTrue(BrowsersUtils.getText(firstNameforValidation).equals("Alex"));
        Assert.assertTrue(BrowsersUtils.getText(lasNameForValidation).equals("Chalyi"));
        Assert.assertTrue(newPatientId.isDisplayed());
        logoOpenMRS.click();
        Thread.sleep(2000);
        findPatientrecordBtn.click();
        //  patientSearchBar.sendKeys("Alex Chalyi");
        int count = 0;
        for (int i = 0; i < patientNames.size(); i++) {

            Map<String, String> keysAndValues = new HashMap<>();
            keysAndValues.put(BrowsersUtils.getText(identifiers.get(i)), BrowsersUtils.getText(patientNames.get(i)));
            {
                if (keysAndValues.containsKey(identifiers.get(i))) {
                    count++;
                }
            }
            Assert.assertTrue(count <= 1);
        }
        Thread.sleep(2000);
        AlexChalyiForDelete.click();
        Thread.sleep(2000);
        deletePatientBtn.click();
        Thread.sleep(2000);
        confirmBtnForPatientDelete.click();
        Assert.assertEquals(BrowsersUtils.getText(errorMessageWhenDelitingPatient),"Reason cannot be empty");
        Thread.sleep(2000);
        deleteReasonBar.sendKeys("Moved");
        Thread.sleep(2000);
        confirmBtnForPatientDelete.click();




    }


}











