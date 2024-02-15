package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC03AdvanceLocator extends DriverSetup {
    @Test
    public void click_radiobutton02() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.findElement(By.xpath("//input[@value=\"radio2\"]")).click();
        Thread.sleep(3000);
    }

    @Test
    public void test_write() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        WebElement input_text = driver.findElement(By.id("autocomplete"));
        input_text.sendKeys("Test automation");
        Thread.sleep(3000);
        input_text.clear();
        Thread.sleep(3000);
    }

    @Test
    public void get_attribute_value() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//input[@value='radio3']")).getAttribute("class"));
        Thread.sleep(3000);
    }
    @Test
    public void get_element_text() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.xpath("//label[normalize-space()='Radio3']")).getText());
        Thread.sleep(3000);
    }

    @Test
    public void element_hide_show() throws InterruptedException {
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
        driver.findElement(By.id("hide-textbox")).click();
        System.out.println(driver.findElement(By.id("displayed-text")).isDisplayed());
        Thread.sleep(3000);
    }

}
