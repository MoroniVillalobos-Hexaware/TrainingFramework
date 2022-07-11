package com.hxwr;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
public class FireFoxDriverManager extends DriverManager{

    @Override
    protected void createWebDriver() {
         FirefoxOptions options= new FirefoxOptions();
        this.driver=new FirefoxDriver(options);
    }
}