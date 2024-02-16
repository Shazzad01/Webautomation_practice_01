package LocatorLearning;

import org.openqa.selenium.By;
import org.openqa.selenium.WindowType;
import org.testng.annotations.Test;
import utilities.DriverSetup;

import java.util.ArrayList;
import java.util.List;

public class TC04Get_Navigate_Browser extends DriverSetup {
    @Test
    public void Navigate_to_newpage() throws InterruptedException {
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.barnesandnoble.com/");
        driver.navigate().back();
        Thread.sleep(3000);
        driver.navigate().forward();
        Thread.sleep(2000);
        driver.navigate().refresh();
        Thread.sleep(3000);

    }

    @Test
    public void handel_browser_window() throws InterruptedException {
        driver.navigate().to("https://www.barnesandnoble.com/");
        driver.switchTo().newWindow(WindowType.TAB);
        driver.get("https://www.google.com/");
        Thread.sleep(3000);
        driver.switchTo().newWindow(WindowType.WINDOW);
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        Thread.sleep(3000);

    }

    @Test
    public void browser_window() throws InterruptedException {
        driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/");
        System.out.println(driver.getTitle());
        driver.findElement(By.id("opentab")).click();
        System.out.println(driver.getTitle());
        driver.findElement(By.id("openwindow")).click();
        Thread.sleep(3000);
        System.out.println(driver.getTitle());
        //System.out.println(driver.getWindowHandle());
        List<String> window_handles = new ArrayList<>(driver.getWindowHandles());
        System.out.println(window_handles.get(0));
        System.out.println(window_handles.get(1));
        System.out.println(window_handles.get(2));

        driver.switchTo().window(window_handles.get(2));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(window_handles.get(0));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());

        driver.switchTo().window(window_handles.get(1));
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());




    }
}
