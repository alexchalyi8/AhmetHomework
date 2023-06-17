package com.test.HomeWork3TestCase2.tests;

import com.test.HomeWork3TestCase2.pages.Homework3Case2RegisterPatientPage;
import org.testng.annotations.Test;

public class Homework3Case2RegisterPatientTest extends Case2TestBase{
    @Test
    public void patientInfoValidation() throws InterruptedException {
        Homework3Case2RegisterPatientPage homework3Case2RegisterPatientPage = new Homework3Case2RegisterPatientPage(driver);
        homework3Case2RegisterPatientPage.patientRegistration(driver);
    }
}
