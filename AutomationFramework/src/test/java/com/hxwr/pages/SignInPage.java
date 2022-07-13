package com.hxwr.pages;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.Date;

import static com.hxwr.steps.hooks.*;

public class SignInPage {
    String failName="";
    public SignInPage(){
        driver= driverManager.getWebDriver();
    }

    By createAnAccountButton= By.xpath("//button[@id='SubmitCreate']");
    By emailInput= By.xpath("//input[@id='email_create']");
    By invalidEmailLabel=By.xpath("//*[contains(text(),'Invalid email address')]");
    By loginEmailInput=By.xpath("//input[@id='email']");
    By loginPasswordInput= By.xpath("//input[@id='passwd']");
    By loginSubmitButton=By.xpath("//button[@id='SubmitLogin']");
    public boolean enterEmailAddres(String email){
        Date date= new Date();
        String userEmail=email.split("@")[0];
        String emailDomain=email.split("@")[1];
        email=userEmail+date.getYear()+date.getMonth()+date.getDay()+date.getHours()+date.getMinutes()+date.getSeconds()+"@"+emailDomain;
        properties.put("email_address",email);
        try {
            failName="Enter Email Address";
            wait.until(ExpectedConditions.presenceOfElementLocated(emailInput));
            driver.findElement(emailInput).sendKeys(email);
            Thread.sleep(1000);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean clickOnCreateAccountbutton(){
        try {
            failName="Enter Email Address";
            wait.until(ExpectedConditions.elementToBeClickable(createAnAccountButton));
            driver.findElement(createAnAccountButton).click();
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean verifyThatErrorMessageIsDisplayed(){
        try {
            failName="Validate Invalid Email";
            wait.until(ExpectedConditions.visibilityOfElementLocated(invalidEmailLabel));

        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean enterInvalidEmail(String email){
        try {
            failName="Enter Invalid Email";
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
            driver.findElement(emailInput).sendKeys(email);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="type Enter";
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
            driver.findElement(emailInput).sendKeys(Keys.ENTER);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean enterYourEmailAndClickRegisterButton(String email){
        Date date= new Date();
        String userEmail=email.split("@")[0];
        String emailDomain=email.split("@")[1];
        email=userEmail+date.getYear()+date.getMonth()+date.getDay()+date.getHours()+date.getMinutes()+date.getSeconds()+"@"+emailDomain;
        properties.put("email_address",email);
        try {
            failName="type Email";
            wait.until(ExpectedConditions.visibilityOfElementLocated(emailInput));
            driver.findElement(emailInput).sendKeys(email);
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="Click register button";
            wait.until(ExpectedConditions.visibilityOfElementLocated(createAnAccountButton));
            driver.findElement(createAnAccountButton).click();
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
    public boolean loginToTheWebSite(){
        try {
            failName="Enter Email";
            wait.until(ExpectedConditions.visibilityOfElementLocated(loginEmailInput));
            driver.findElement(loginEmailInput).sendKeys(properties.get("email_address"));
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="Enter Password";
            driver.findElement(loginEmailInput).sendKeys(properties.get("password"));
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        try {
            failName="Click on Submit Button";
            driver.findElement(loginSubmitButton).click();
        }catch (Exception e){
            System.out.println(failName);
            return false;
        }
        return true;
    }
}
