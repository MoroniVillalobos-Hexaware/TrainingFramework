package com.hxwr.steps;

import com.hxwr.DriverManager;
import com.hxwr.utils.ExelManager;
import io.cucumber.java.After;
import io.cucumber.java.AfterAll;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeAll;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
public class hooks {
public static DriverManager driverManager;
public static WebDriverWait wait;
public static WebDriver driver;
public static SoftAssert softAssert;
public static Map<String,String> properties;
public static String FailureTestMessage;

    @BeforeAll
    public static void beforeAllScenario(){
      //  softAssert=new SoftAssert();
    }
    @Before
    public void beforeScenario() throws IOException {
        ExelManager manager=new ExelManager();
        manager.initializeFile();
        properties=manager.readExelFIle();
        softAssert = new SoftAssert();
        FailureTestMessage="";
    }


    @After
    public void afterScenario(){
      driverManager.getWebDriver().quit();
    }

    @AfterAll
    public static void before_or_after_all(){
    //softAssert.assertAll();
    }
}
