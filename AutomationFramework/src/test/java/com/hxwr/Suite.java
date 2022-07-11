package com.hxwr;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class Suite {
    DriverManager driverManager;
    WebDriver driver;


    @Test
    public void navigateToGoogleTest(){
        driverManager=DriverManagerFactory.getdriverManager(DriverType.CHROME);
        driver=driverManager.getWebDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
        driver.quit();
    }

}
