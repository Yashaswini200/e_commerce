package org.example.Driver;

import org.example.Utilis.PropertiesReader;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverManager  {
    public static WebDriver driver;

    public static void setDriver(WebDriver driver) {
        DriverManager.driver = driver;
    }

    public  static WebDriver getDriver() {
        return driver;
    }
    public static void init(){
        String browser= PropertiesReader.readkey("browser");
        switch (browser){
            case "edge":
                driver=new EdgeDriver();
                break;
            case "chrome":
                driver=new ChromeDriver();
                break;
            case "firefox":
                driver=new FirefoxDriver();
                break;
            default:
                System.out.println("enter edge,chrome or firefox");

        }
    }
    public static void down(){
        if(getDriver()!=null){
            driver.quit();
            driver=null;
        }
    }
}
