package com.test.swagLabs.tests;

import org.testng.annotations.DataProvider;

public class SwagLabsAllData {
    @DataProvider(name = "positiveLogin")
    public Object[][] getData() {
        return new Object[][]{
                {"standard_user", "secret_sauce", "https://www.saucedemo.com/inventory.html"},
//               {"problem_user","secret_sauce","https://www.saucedemo.com/inventory.html"},
//               {"performance_glitch_user","secret_sauce","https://www.saucedemo.com/inventory.html"}

        };

    }

    @DataProvider(name = "negativeLogin")
    public Object[][] getDataNegative() {
        return new Object[][]{
                {"wrongUsername", "wrongPassword", "Epic sadface: Username and password do not match any user in this service"},
                {"", "wrongPassword", "Epic sadface: Username is required"},
                {"performance_glitch_user", "", "Epic sadface: Password is required"},
                {"", "", "Epic sadface: Username is required"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
        };

    }

    @DataProvider(name = "mainpage")
    public Object[][] getDataMainPage() {
        return new Object[][]{
                {"wrongUsername", "wrongPassword", "Epic sadface: Username and password do not match any user in this service"},
                {"", "wrongPassword", "Epic sadface: Username is required"},
                {"performance_glitch_user", "", "Epic sadface: Password is required"},
                {"", "", "Epic sadface: Username is required"},
                {"locked_out_user", "secret_sauce", "Epic sadface: Sorry, this user has been locked out."},
        };

    }

    @DataProvider(name = "loginNewAndValidation")
    public Object[][] getDataNew() {
        return new Object[][]{
                {"Sauce Labs Backpack", "Sauce Labs Backpack", "Sly Pack", "$29.99"},
                {"Sauce Labs Bike Light", "Sauce Labs Bike Light", "Water-resistant", "$9.99"},
                {"Sauce Labs Bolt T-Shirt", "Sauce Labs Bolt T-Shirt", "American Apparel", "$15.99"},
                {"Sauce Labs Fleece Jacket", "Sauce Labs Fleece Jacket", "midweight quarter-zip fleece", "$49.99"},
                {"Sauce Labs Onesie", "Sauce Labs Onesie", "Reinforced 3-snap bottom closure,", "$7.99"},
                {"Test.allTheThings() T-Shirt (Red)", "Test.allTheThings() T-Shirt (Red)", "comfy ringspun combed cotton", "$15.99"},

        };

    }
}
