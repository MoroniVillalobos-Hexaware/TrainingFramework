package com.hxwr;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        ChromeOptions options= new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\TrainingFramework\\AutomationFramework\\src\\test\\resources\\Drivers\\chromedriver.exe");
        this.driver=new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
