package com.hxwr.pages;

import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.hxwr.steps.hooks;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import static com.hxwr.steps.hooks.*;
public class AccountCreationPage {
    String failName="";


    By firstNameInput=By.xpath("//input[@id='customer_firstname']");
    By lastNameInput=By.xpath("//input[@id='customer_lastname']");
    By emailInput=By.xpath("//input[@id='email']");
    By passwordInput=By.xpath("//input[@id='passwd']");
    By firstNameAddressInput=By.xpath("//input[@id='firstname']");
    By lastNameAddressInput=By.xpath("//input[@id='lastname']");
    By addressInput=By.xpath("//input[@id='address1']");
    By cityInput=By.xpath("//input[@id='city']");
    By stateSelect=By.id("id_state");
    By postCodeInput=By.xpath("//input[@id='postcode']");
    By countrySelect=By.id("id_country");
    By mobilePhoneInput=By.xpath("//input[@id='phone_mobile']");
    By aliasInput=By.xpath("//input[@id='alias']");
    By registerButton=By.id("submitAccount");
    By errorMessagePhoneNumberBlank=By.xpath("//li[contains(text(),'You must register at least one phone number')]");
    By errorMessageLastNameBlank=By.xpath("//b[contains(text(),'lastname')]");
    By errorMessageFirstNameBlank=By.xpath("//b[contains(text(),'firstname')]");
    By errorMessagePassWordBlank=By.xpath("//b[contains(text(),'passwd')]");
    By errorMessageAddressBlank=By.xpath("//b[contains(text(),'address1')]");
    By errorMessageCityBlank=By.xpath("//b[contains(text(),'city')]");
    By errorMessagePstCodeBlank=By.xpath("//li[contains(text(),'The Zip/Postal code you')]");
    By errorMessageCountryBlank=By.xpath("//li[contains(text(),'This country requires you to choose a State.')]");

    public boolean enterYourPersonalInformation(){
        try {
            failName="Enter First Name";
            wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(firstNameInput));
           driver.findElement(firstNameInput).sendKeys(hooks.properties.get("first_name"));
        }catch (Exception e){
            System.out.println(failName);
            ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter Last Name";
            driver.findElement(lastNameInput).sendKeys(hooks.properties.get("last_name"));
        }catch (Exception e){
            System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter email";
            driver.findElement(emailInput).clear();
            driver.findElement(emailInput).sendKeys(hooks.properties.get("email_address"));
        }catch (Exception e){
            System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter password";
            driver.findElement(passwordInput).sendKeys(hooks.properties.get("password"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter First Name";
            driver.findElement(firstNameAddressInput).sendKeys(hooks.properties.get("first_name"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter Last Name Address";
            driver.findElement(lastNameAddressInput).sendKeys(hooks.properties.get("last_name"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter  Address";
            driver.findElement(addressInput).sendKeys(hooks.properties.get("address"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter City";
            driver.findElement(cityInput).sendKeys(hooks.properties.get("address"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter State";
            Select select= new Select(driver.findElement(stateSelect));
            String state=properties.get("state");
            select.selectByVisibleText(state);
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter post code";
            driver.findElement(postCodeInput).sendKeys(hooks.properties.get("zip_code"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter Country";
            Select select= new Select(driver.findElement(countrySelect));
            String country=properties.get("country");
            select.selectByVisibleText(country);
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter mobile phone";
            driver.findElement(mobilePhoneInput).sendKeys(hooks.properties.get("mobile_phone"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="Enter alias";
            driver.findElement(aliasInput).clear();
            driver.findElement(aliasInput).sendKeys(hooks.properties.get("address_alias"));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        return true;
    }
    public boolean clickOnRegisterButton(){
        try {
            failName="click on register Button";
            wait.until(ExpectedConditions.elementToBeClickable(registerButton));
            driver.findElement(registerButton).click();
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        return true;
    }
    public boolean leaveTheMandatoryFieldsMarkWithBlankAndClickRegisterButton(){
        try {
            failName="click on register Button";
            wait.until(ExpectedConditions.elementToBeClickable(registerButton));
            driver.findElement(registerButton).click();
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        return true;
    }
    public boolean verifyThatErrorHasBeenDisplayedForTheMandatoryFields(){
        try {
            failName="verify error message city Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageCityBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message country Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageCountryBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message last name Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageLastNameBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message post code Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessagePstCodeBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message address Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageAddressBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message phone number Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessagePhoneNumberBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message first name Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessageFirstNameBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        try {
            failName="verify error message password Blank ";
            wait.until(ExpectedConditions.visibilityOfElementLocated(errorMessagePassWordBlank));
        }catch (Exception e){
              System.out.println(failName);
               ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        return true;
    }
   public boolean enterIncorrectValuesInFieldsAndClickRegisterButton(){

       try {
           failName="Enter First Name";
           wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(firstNameInput));
           driver.findElement(firstNameInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter Last Name";
           driver.findElement(lastNameInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter email";
           driver.findElement(emailInput).clear();
           driver.findElement(emailInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter password";
           driver.findElement(passwordInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter First Name";
           driver.findElement(firstNameAddressInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter Last Name Address";
           driver.findElement(lastNameAddressInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter  Address";
           driver.findElement(addressInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter City";
           driver.findElement(cityInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }

       try {
           failName="Enter post code";
           driver.findElement(postCodeInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter Country";
           Select select= new Select(driver.findElement(countrySelect));
           String country=properties.get("country");
           select.selectByVisibleText(country);
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter mobile phone";
           driver.findElement(mobilePhoneInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
       try {
           failName="Enter alias";
           driver.findElement(aliasInput).clear();
           driver.findElement(aliasInput).sendKeys(hooks.properties.get("incorrect_string"));
       }catch (Exception e){
           System.out.println(failName);
           ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
           return false;
       }
        return true;
   }
}
