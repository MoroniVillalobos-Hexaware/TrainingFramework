package com.hxwr.steps;

import com.hxwr.DriverManager;
import com.hxwr.DriverManagerFactory;
import com.hxwr.DriverType;
import com.hxwr.utils.ExelManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

import java.io.IOException;
import java.util.Map;

public class hooks {
DriverManager driverManager;
public static WebDriver driver;
public static Map<String,String> properties;
    @Before
    public void beforeScenario() throws IOException {
        driverManager= DriverManagerFactory.getdriverManager(DriverType.CHROME);
        driver=driverManager.getWebDriver();
        ExelManager manager=new ExelManager();
        manager.initializeFile();
        properties=manager.readExelFIle();
    }


    @After
    public void afterScenario(){
        driverManager.quitWebDriver();
    }
}
