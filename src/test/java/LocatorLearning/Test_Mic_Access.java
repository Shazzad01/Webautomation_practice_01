package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Test_Mic_Access {
    @Test
    public void test_mice_access() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();

        options.addArguments("--use-fake-ui-for-media-stream");
        options.addArguments("--use-fake-device-for-media-stream");

        WebDriver driver = new ChromeDriver(options);
        driver.get("https://translate.google.com/?sl=en&tl=es&op=translate");
        Thread.sleep(3000);

        driver.findElement(By.xpath("(//button[@aria-label='Translate by voice'])[2]")).click();
        Thread.sleep(3000);
    }
}