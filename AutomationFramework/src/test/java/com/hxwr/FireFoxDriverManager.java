package com.hxwr;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import java.io.File;
import java.util.concurrent.TimeUnit;

public class FireFoxDriverManager extends DriverManager{
    @Override
    protected void createWebDriver() {
        FirefoxOptions firefoxOptions=new FirefoxOptions();
        firefoxOptions.setBinary(firefoxbinary);
        String driverpath = System.getProperty("user.dir")+"\\src\\test\\resources\\Drivers\\geckodriver.exe";
        System.setProperty("webdriver.gecko.driver",driverpath);
        driver = new FirefoxDriver(firefoxOptions);
    }
}
