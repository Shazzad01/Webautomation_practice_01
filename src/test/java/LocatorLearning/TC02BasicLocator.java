package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC02BasicLocator extends DriverSetup {
    @Test
    public void testOption01() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
       WebElement option01 =  driver.findElement(By.id("checkBoxOption1"));
       option01.click();
       Thread.sleep(5000);

       WebElement radioBtn1 = driver.findElement(By.className("radioButton"));
       radioBtn1.click();
       Thread.sleep(5000);

       WebElement freeAccess = driver.findElement(By.linkText("Free Access to InterviewQues/ResumeAssistance/Material"));
        System.out.println(freeAccess.getText());
    }
}
