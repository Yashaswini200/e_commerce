package org.example.E_Commerce;

import org.example.base.CommonToAllPage;
import org.example.Utilis.PropertiesReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.example.Driver.DriverManager.driver;
import static org.example.Utilis.WaitHelper.checkVisiblity;

public class LoginPage extends CommonToAllPage {
//    WebDriver driver;
//
//    public LoginPage(WebDriver driver) {
//        this.driver = driver;
//    }
    private By login= By.xpath("//a[@href=\"/login\"]");
    private By username=By.xpath("//input[@placeholder=\"Email Address\"]");
    private By password=By.xpath("//input[@placeholder=\"Password\"]");
    private By logbtn=By.xpath("//button[@class=\"btn btn-default\"]");
    private By after=By.xpath("//a[@href=\"/products\"]");
    public void Login(){
        openurl();
        maximum();
        btnclick(login);
        checkVisiblity(driver,username,5);
        input(username, PropertiesReader.readkey("username"));
        input(password,PropertiesReader.readkey("password"));
        btnclick(logbtn);
        checkVisiblity(driver,after,5);


    }


}



//public void Login(String username_,String password_){
//    openurl();
//    maximum();
//    btnclick(login);
//    checkVisiblity(driver,username,5);
//    input(username, username_);
//    input(password,username_);
//    btnclick(logbtn);
//    checkVisiblity(driver,after,5);
//
//
//}
