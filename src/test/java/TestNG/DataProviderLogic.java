package TestNG;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderLogic {
//    @DataProvider(name = "couples")
//    public Object[][] getData(){
//        return new Object[][]{
//                {"Ahemt","Leyla","Blue"},
//                {"Anna","Ivan","Black"},
//                {"Mavlen","Ayse","Brown"},
//                {"Zinah","Ozan","Blue"},
//                {"Nazgul","Nurik","Grey"}
//        };
//    }
    @Test(dataProvider = "couples",dataProviderClass = AllDataPractice.class)
    public void test1(String firstPerson,String secondPerson,String eyeColor){
        System.out.println(firstPerson+secondPerson+eyeColor);
    }
//    @Test
//    public void test2(){
//        System.out.println("Anna "+" Ivan");
//    }
//    @Test
//    public void test3(){
//        System.out.println("Mavlen "+ " Ayse");
//    }
//    @Test
//    public void test4(){
//        System.out.println("Zinah "+" Ozan");
//    }
//    @Test
//    public void test5(){
//        System.out.println("Nazgul "+" Nurik");
//    }
}
