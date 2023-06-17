package TestNG;

import org.testng.annotations.*;

public class TestNGAnnotation {
    @BeforeSuite
    public void beforeSuite(){//I will delete all cookies overthere, clear the cache
        System.out.println("Im afterSuite annotation");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Im beforeTest annotation");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("Im before class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am before method annotation");
    }
    @Test
    public void test1(){
        System.out.println("Iam test1 annotation");
    }
    @Test
    public void test2(){
        System.out.println("Iam test2 annotation");
    }
    @AfterMethod
    public void afterMethod(){// teardown driver and screenshot
        System.out.println("Im afterMethod annotation");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("Im after class annotation");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("Im after test annotation");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("Im afterSuite annotation");
    }
}
