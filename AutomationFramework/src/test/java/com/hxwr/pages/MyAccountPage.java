package com.hxwr.pages;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static com.hxwr.steps.hooks.*;

public class MyAccountPage {
    String failName="";


    By accountCreatedLabel= By.xpath("//*[contains(text(),'Welcome to your account')]");
   public boolean validateThatUserIsCreated(){
       try {
           failName="validate Label User Is Created";
           wait.until(ExpectedConditions.visibilityOfElementLocated(accountCreatedLabel));
           driver.findElement(accountCreatedLabel);
           Thread.sleep(1000);
       }catch (Exception e){
            System.out.println(failName);
             ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
       }
       return true;
   }
}
