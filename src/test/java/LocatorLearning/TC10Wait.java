package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.xml.sax.Locator;
import utilities.DriverSetup;

import java.time.Duration;

public class TC10Wait extends DriverSetup {
    @Test
    public void testimplicitlyWait() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.get("https://qavbox.github.io/demo/delay/");
        driver.findElement(By.id("loaderStart")).click();
        System.out.println(driver.findElement(By.id("loaderdelay")).getText());
        Assert.assertEquals(driver.findElement(By.id("loaderdelay")).getText(), "I appeared after 5 sec loading");


    }

    @Test
    public void testWebdriverWait() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        Actions actions = new Actions(driver);
        driver.get("https://demoqa.com/alerts");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/alerts");
        driver.findElement(By.id("timerAlertButton")).click();

        Thread.sleep(9000);


    }

    @Test
    public void Prograsebar() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        driver.get("https://demoqa.com/progress-bar");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://demoqa.com/progress-bar");
        driver.findElement(By.id("startStopButton")).click();
        WebElement Prograse_bar= driver.findElement(By.xpath("(//div[@role='progressbar'])"));
        boolean Prograse_bar_status = wait.until(ExpectedConditions.attributeContains(Prograse_bar, "aria-valuenow", "100"));
        if (Prograse_bar_status==true){
            wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("(//button[@id='resetButton'])"))).click();
        }
    }


}
