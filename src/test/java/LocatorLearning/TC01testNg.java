package LocatorLearning;

import org.openqa.selenium.By;
import org.testng.annotations.*;
import utilities.DriverSetup;

public class TC01testNg extends DriverSetup {
    @Test(priority = 1)
    public void testcase1() {
        System.out.println("Normal test case1 ");
    }

    @Test(priority = 0)
    public void testcase2() {
        System.out.println("Normal test case2 ");
    }

    @BeforeMethod
    public void beforeMathod() {
        System.out.println("execute before every mathod");
    }

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("execute before every suit");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("execute before every test");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("execute before every class");
    }

    @BeforeGroups
    public void beforeGroups() {
        System.out.println("execute before every group");
    }

    @Test

    public void clickDarazLogin() throws InterruptedException {
        driver.get("https://www.daraz.com.bd/");
        driver.findElement(By.className("bld-txt")).click();
        Thread.sleep(5000);
    }
}
