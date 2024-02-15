package org.example;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class MyFirstTestClass extends DriverSetup {
    @Test
    public void testPageTitle() {
        driver.get("https://www.google.com/");

        Assert.assertEquals(driver.getTitle(), "Google");
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.google.com/");
        System.out.println(driver.getCurrentUrl());

    }
}
