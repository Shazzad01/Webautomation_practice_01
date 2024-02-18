package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC07_iFrame extends DriverSetup {
    @Test
    public void test_IframeElement(){
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Actions actions = new Actions(driver);
        actions.scrollByAmount(0,20000);
        driver.switchTo().frame("courses-iframe");
        driver.findElement(By.linkText("Courses")).getText();
        driver.switchTo().defaultContent();
        System.out.println(driver.findElement(By.xpath("//legend[normalize-space()='iFrame Example']")).getText());

    }
}
