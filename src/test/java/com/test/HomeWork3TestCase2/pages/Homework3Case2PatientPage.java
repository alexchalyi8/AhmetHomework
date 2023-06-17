package com.test.HomeWork3TestCase2.pages;

import Utils.BrowsersUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Homework3Case2PatientPage {
    public Homework3Case2PatientPage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//input[@id='patient-search']")
    WebElement patientSearchBar;
    //    @FindBy(xpath = "//td[contains(text(),'John johns')]")
//    WebElement patientJonh;
    @FindBy(xpath = "//tr//td[1]")
    List<WebElement> identifiers;
    @FindBy(xpath = "//tr//td[2]")
    List<WebElement> patientNames;

    public void patientValidation(String patientName) throws InterruptedException {
        patientSearchBar.sendKeys(patientName);
        patientSearchBar.sendKeys(Keys.ENTER);
        Thread.sleep(2000);
//        patientJonh.click();
        int count = 0;
        for (int i = 0; i < patientNames.size(); i++) {

            Map<String, String> keysAndValues = new HashMap<>();
            keysAndValues.put(BrowsersUtils.getText(identifiers.get(i)), BrowsersUtils.getText(patientNames.get(i)));
            for (Map.Entry<String, String> entry : keysAndValues.entrySet()) {
                if (entry.getValue().contains(patientName)) {
                    System.out.println(entry.getValue());
                    count++;
                }


            }
            Assert.assertTrue(count <= 1);


        }
    }
}
