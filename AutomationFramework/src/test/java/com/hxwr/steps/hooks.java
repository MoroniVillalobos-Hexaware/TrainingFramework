package com.hxwr.steps;

import com.hxwr.DriverManager;
import com.hxwr.utils.ExelManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.util.Map;
public class hooks {
public static DriverManager driverManager;
public static WebDriverWait wait;
public static WebDriver driver;
public static Map<String,String> properties;
    @Before
    public void beforeScenario() throws IOException {
        ExelManager manager=new ExelManager();
        manager.initializeFile();
        properties=manager.readExelFIle();
    }


    @After
    public void afterScenario(){
      driverManager.getWebDriver().quit();
    }
}
