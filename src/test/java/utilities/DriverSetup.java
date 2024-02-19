package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import java.io.File;

public class DriverSetup {
    public WebDriver driver;
    @BeforeSuite
    public void setDriver(){
        ChromeOptions options = new ChromeOptions();
        options.addExtensions(new File("./Extention/Adblock.crx"));
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();

    }
    @AfterSuite
    public void closeDriver(){
        driver.quit();

    }
}
