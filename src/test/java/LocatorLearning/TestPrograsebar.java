package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.time.Duration;

public class TestPrograsebar extends DriverSetup {
    @Test
    public void Prograsebar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demoqa.com/progress-bar");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.id("startStopButton")).click();
        WebElement Prograse_bar = driver.findElement(By.xpath("(//div[@role='progressbar'])"));
        boolean Prograse_bar_status = wait.until(ExpectedConditions.attributeContains(Prograse_bar, "aria-valuenow", "100"));
        if (Prograse_bar_status == true) {
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@id='resetButton'])"))).click();
        }
    }
}
