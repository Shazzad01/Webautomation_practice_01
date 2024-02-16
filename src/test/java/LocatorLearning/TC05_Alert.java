package LocatorLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class TC05_Alert extends DriverSetup {
    @Test
    public void handel_deferantetype_alert() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result, "You successfully clicked an alert");
        Thread.sleep(3000);

    }

    @Test
    public void handel_deferantetype_alert02() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();

        String result = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result, "You clicked: Ok");
        Thread.sleep(3000);

    }

    @Test
    public void handel_deferantetype_alert03() throws InterruptedException {
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("SHAZZAD");
        alert.accept();


        String result = driver.findElement(By.id("result")).getText();

        Assert.assertEquals(result, "You entered: SHAZZAD");
        Thread.sleep(3000);

    }
}
