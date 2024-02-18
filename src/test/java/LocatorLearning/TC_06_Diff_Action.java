package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import javax.swing.*;

public class TC_06_Diff_Action extends DriverSetup {
    @Test
    public void testDifferentAction() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/");
        Actions actions = new Actions(driver);
        WebElement auto_mobile = driver.findElement(By.xpath("//span[normalize-space()='Automotive & Motorbike']"));
        actions.clickAndHold(auto_mobile).build().perform();
        Thread.sleep(2000);
        WebElement vhicle_Care = driver.findElement(By.linkText("Vehicle Care"));
        actions.clickAndHold(vhicle_Care).build().perform();
        driver.findElement(By.linkText("Cleaners and Kits")).click();
        Thread.sleep(3000);
    }
    @Test
    public void scrollTo() throws InterruptedException {
        //driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.get("https://www.daraz.com.bd/");
        Actions actions = new Actions(driver);
        //actions.scrollByAmount(0,200000).build().perform();
        //actions.scrollToElement(driver.findElement(By.id("mousehover"))).build().perform();
        actions.scrollToElement(driver.findElement(By.linkText("About Daraz"))).build().perform();
        Thread.sleep(4000);
//        driver.findElement(By.linkText("About Daraz")).click();
//        Thread.sleep(5000);
    }
}
