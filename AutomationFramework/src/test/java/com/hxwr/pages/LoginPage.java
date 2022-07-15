package com.hxwr.pages;

import com.hxwr.DriverManager;
import com.hxwr.steps.hooks;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class LoginPage {
    DriverManager driverManager;
    String stepName="";
    WebDriver driver;
    public LoginPage(){
        driver=hooks.driver;
    }
    public boolean navigateToURL(String urltype){

        try{
        stepName = "Go to the desired merchant site: ";
        if(urltype.equals("1")){
             driver.get(hooks.properties.get("URL1"));
             driver.manage().window().maximize();}
        else{
            driver.get(hooks.properties.get("URL2"));
            driver.manage().window().maximize();}
             driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }catch(Exception e){
        System.out.println(e.getMessage());
        return false;
    }
        return true;
    }
}
