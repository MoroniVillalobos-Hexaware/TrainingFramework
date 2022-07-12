import com.hxwr.DriverManager;
import com.hxwr.DriverManagerFactory;
import com.hxwr.DriverType;
import com.hxwr.utils.ExelManager;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


public class Suite {
    DriverManager driverManager;
    WebDriver driver;
    Map<String,String> properties=new HashMap<String,String>();

    @AfterClass
    public void setup() throws IOException {
        ExelManager exel= new ExelManager();
        exel.initializeFile();
       properties= exel.readExelFIle();
    }
    @Test
    public void navigateToGoogleTest(){
        driverManager= DriverManagerFactory.getdriverManager(DriverType.CHROME);
        driver=driverManager.getWebDriver();
        driver.get("https://www.google.com");
        Assert.assertEquals("Google",driver.getTitle());
        driver.quit();
    }

}
