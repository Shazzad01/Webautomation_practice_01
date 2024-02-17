package LocatorLearning;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class Practice_Alert extends DriverSetup {
    @Test
    public void practiceAlert01() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@name='commit']")).click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();
        Thread.sleep(3000);
    }

    @Test
    public void practiceAlert02() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='delayalert']")).click();
        Thread.sleep(6000);
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.accept();

    }
    @Test
    public void practiceAlert03(){
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='prompt']")).click();
        Alert alert = driver.switchTo().alert();
        System.out.println(alert.getText());
        alert.sendKeys("Shazzad");
        alert.dismiss();
    }

    @Test
    public void practiceAlert04() throws InterruptedException {
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='prompt']")).click();
        Alert alert = driver.switchTo().alert();
        //System.out.println(alert.getText());
        alert.sendKeys("Shazzad");
        alert.accept();
        String result = driver.findElement(By.xpath("//p[@id='Parademo']")).getText();
        System.out.println(result);
        Assert.assertEquals(result,"Hello Shazzad! How are you today?");
        Thread.sleep(3000);
    }

    @Test
    public void practiceAlert05(){
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='confirm']")).click();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        String result = driver.findElement(By.xpath("//p[@id='Parademo']")).getText();
        Assert.assertEquals(result,"You pressed OK!");

    }

    @Test
    public void practiceAlert06(){
        driver.get("https://qavbox.github.io/demo/alerts/");
        driver.findElement(By.xpath("//input[@id='confirm']")).click();
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
        String result = driver.findElement(By.xpath("//p[@id='Parademo']")).getText();
        Assert.assertEquals(result,"You pressed Cancel!");

    }
}
