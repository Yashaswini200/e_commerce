package org.example.base;

import org.example.Utilis.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import static org.example.Driver.DriverManager.driver;
import static org.example.Driver.DriverManager.getDriver;

public class CommonToAllPage {
    public  static void openurl(){
getDriver().get(PropertiesReader.readkey("url"));
    }
    public  static void input(By by, String input){
        getDriver().findElement(by).sendKeys(input);
    }
    public  static WebElement justin(By by){
       WebElement one= getDriver().findElement(by);
       return one;
    }
    public static void btnclick(By by){
        getDriver().findElement(by).click();
    }
    public static void maximum(){
        getDriver().manage().window().maximize(); // Optional: for better visibility

    }
    public static void scrolltoele(By one){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", justin(one));
    }
}
