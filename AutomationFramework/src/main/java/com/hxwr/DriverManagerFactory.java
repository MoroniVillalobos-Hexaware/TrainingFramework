package com.hxwr;

public class DriverManagerFactory {
    public static DriverManager getdriverManager(DriverType type){
        DriverManager driverManager;
        switch (type){
            case FIREFOX:
                driverManager=new FireFoxDriverManager();
                break;
            case CHROME:
                driverManager= new ChromeDriverManager();
            default:
                driverManager= new ChromeDriverManager();
                break;
        }
        return driverManager;
    }
}
