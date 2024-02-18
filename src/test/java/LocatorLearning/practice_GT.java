package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.DriverSetup;

public class practice_GT extends DriverSetup {
    @Test
    public void google_translate() throws InterruptedException {

        driver.get("https://translate.google.com/");
        WebElement try_to_click01 = driver.findElement(By.xpath("(//button[@jsname=\"SHEbFd\"])"));
        try_to_click01.click();
        Thread.sleep(2000);
        WebElement try_to_click02 = driver.findElement(By.xpath("(//button[@jsname=\"qDeCrf\"])"));
        try_to_click02.click();
        Thread.sleep(2000);
        WebElement try_to_click03 = driver.findElement(By.xpath("(//button[@jsname=\"n87sxd\"])"));
        try_to_click03.click();
        Thread.sleep(2000);


    }

    @Test
    public void drop_down_click() throws InterruptedException {

        driver.get("https://translate.google.com/");
        WebElement try_to_click01 = driver.findElement(By.xpath("(//button[@jsname=\"RCbdJd\"])"));
        try_to_click01.click();
        Thread.sleep(3000);
        WebElement data = driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[1]/div[3]/div[1]/div[3]/div[13]/div[2]"));
        data.click();
        WebElement type = driver.findElement(By.xpath("//body/c-wiz[1]/div[1]/div[2]/c-wiz[1]/div[2]/c-wiz[1]/div[1]/div[2]/div[2]/c-wiz[1]/span[1]/span[1]/div[1]/textarea[1]"));
        type.sendKeys("ভাল");
        Thread.sleep(6000);
    }
}
