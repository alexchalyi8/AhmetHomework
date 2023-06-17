package com.test.blaze.tests;

import org.testng.annotations.DataProvider;

public class BlazeData {
    @DataProvider(name="orderData")
    public Object[][] getData(){
        return new Object[][]{
                {"Phones","Nokia lumia 1520","Product added","Alex","Ukraine","Sumy","324325","08","2025","Thank you for your purchase!","https://www.demoblaze.com/index.html"},
                {"Phones","Samsung galaxy s6","Product added","John","Estonia","Kiev","4545","09","2027","Thank you for your purchase!","https://www.demoblaze.com/index.html"},
                {"Laptops","Sony vaio i5","Product added","Alex","Ukraine","Rome","324325","08","2023","Thank you for your purchase!","https://www.demoblaze.com/index.html"},
                {"Laptops","2017 Dell 15.6 Inch","Product added","Bob","Ukraine","London","324325","08","2024","Thank you for your purchase!","https://www.demoblaze.com/index.html"},
                {"Monitors","Apple monitor 24","Product added","Bred","Ukraine","Minsk","324325","08","2021","Thank you for your purchase!","https://www.demoblaze.com/index.html"},
                {"Monitors","ASUS Full HD","Product added","Anna","Ukraine","Washington","324325","08","2022","Thank you for your purchase!","https://www.demoblaze.com/index.html"}
        };
    }
}
