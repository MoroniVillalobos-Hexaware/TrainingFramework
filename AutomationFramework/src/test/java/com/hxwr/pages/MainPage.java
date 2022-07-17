package com.hxwr.pages;
import com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter;
import com.hxwr.steps.hooks;
import com.hxwr.DriverManagerFactory;
import com.hxwr.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.asserts.SoftAssert;

import java.lang.reflect.Method;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static com.hxwr.steps.hooks.*;

public class MainPage {

      String failName="";
        Method method;

    public void init_driver(DriverType browser){
        driverManager= DriverManagerFactory.getdriverManager(browser);
        driver= driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait= new WebDriverWait(driver, Duration.ofSeconds(6));
    }

    By signInButton= By.xpath("//a[@class='login']");
    By subMenuTShirtsButtom=By.xpath("(//a[@title='T-shirts'])[1]");

    By womanLink=By.xpath("//a[@title='Women']");
   public boolean navigateToUrl(String url,String browser){
       try {
           failName="navigate to Url:"+url;
            if(browser.equals("CHROME"))
                init_driver(DriverType.CHROME);
           if(browser.equals("FIREFOX"))
               init_driver(DriverType.FIREFOX);
            driver.get(url);
            driver.manage().window().maximize();
       }catch (Exception e){
           System.out.println(failName);
            ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
        return false;
       }
       return true;
   }
   public boolean clickOnSignButton(){
       try {
           failName="Click On Sign Button";
           wait.until(ExpectedConditions.elementToBeClickable(signInButton));
           driver.findElement(signInButton).click();

       }catch (Exception e){
             System.out.println(failName);
              ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
       }
       return true;
   }
   public boolean clickOnSubMenuTShirts(){
       try {
           failName="Click On sub menu T-Shirts";
           wait.until(ExpectedConditions.visibilityOfElementLocated(subMenuTShirtsButtom));
           wait.until(ExpectedConditions.elementToBeClickable(subMenuTShirtsButtom));
           driver.findElement(subMenuTShirtsButtom).click();
       }catch (Exception e){
             System.out.println(failName);
              ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
       }
       return true;
   }
   public boolean moveTheCursorOverWomanSLink(){
        try {
            failName="move Cursor over Women link";
            Actions a = new Actions(driver);
            a.moveToElement(driver.findElement(womanLink)).perform();
        }catch (Exception e){
            System.out.println(failName);
            ExtentCucumberAdapter.addTestStepLog("STEP FAILED: "+failName);
            return false;
        }
        return true;
    }
}
