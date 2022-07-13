package com.hxwr.pages;

import com.hxwr.DriverManagerFactory;
import com.hxwr.DriverType;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.concurrent.TimeUnit;
import static com.hxwr.steps.hooks.*;

public class MainPage {

      String failName="";
    public MainPage(){
        driverManager= DriverManagerFactory.getdriverManager(DriverType.CHROME);
        driver= driverManager.getWebDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait= new WebDriverWait(driver, Duration.ofSeconds(6));
    }

    By signInButton= By.xpath("//a[@class='login']");
    By subMenuTShirtsButtom=By.xpath("(//li/a[@title='T-shirts'])[2]");
   public boolean navigateToUrl(String url){
       try {
           failName="navigate to Url:"+url;
            driver.get(url);
            driver.manage().window().maximize();
       }catch (Exception e){
           System.out.println(failName);
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
           return false;
       }
       return true;
   }
   public boolean clickOnSubMenuTShirts(){
       try {
           failName="Click On sub menu T-Shirts";
           wait.until(ExpectedConditions.elementToBeClickable(subMenuTShirtsButtom));
           driver.findElement(subMenuTShirtsButtom).click();
       }catch (Exception e){
           System.out.println(failName);
           return false;
       }
       return true;
   }
}
