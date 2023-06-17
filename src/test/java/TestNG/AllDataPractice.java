package TestNG;

import org.testng.annotations.DataProvider;

public class AllDataPractice {


   @DataProvider(name = "couples")
    public Object[][] getData(){
        return new Object[][]{
               {"Ahemt","Leyla","Blue"},
               {"Anna","Ivan","Black"},
                {"Mavlen","Ayse","Brown"},
                {"Zinah","Ozan","Blue"},
                {"Nazgul","Nurik","Grey"}
       };
    }










}
