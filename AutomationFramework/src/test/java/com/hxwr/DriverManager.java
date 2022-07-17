package com.hxwr;
import com.hxwr.steps.hooks;
import org.openqa.selenium.WebDriver;

public abstract class DriverManager {
    protected WebDriver driver;
    public static String firefoxbinary= hooks.properties.get("firefox_binary");
    protected  abstract void createWebDriver();
    public void quitWebDriver(){
        if(null!=driver){
            driver.quit();
            driver=null;
        }
    }
    public WebDriver getWebDriver(){
        if(null== driver){
            createWebDriver();
        }
        return driver;
    }
}
