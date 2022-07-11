package com.hxwr;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeDriverManager extends DriverManager {
    @Override
    protected void createWebDriver() {
        ChromeOptions options= new ChromeOptions();
        System.setProperty("webdriver.chrome.driver","C:\\TriningFramework\\AutomationFramework\\src\\main\\resources\\Drivers\\chromedriver.exe");
        this.driver=new ChromeDriver(options);
    }
}
