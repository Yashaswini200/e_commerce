package org.example.Test;

import org.apache.commons.math3.stat.descriptive.summary.Product;
import org.example.E_Commerce.LoginPage;
import org.example.E_Commerce.PaymentPage;
import org.example.E_Commerce.ProductPage;
import org.example.UtilsExcel.UtilExcel;
import org.example.base.CommonToAllTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

import static org.example.Driver.DriverManager.driver;
import static org.example.Utilis.WaitHelper.checkVisiblity;

public class E_Commerce_Test  extends CommonToAllTest {
    @Test
    public void e_commerce_login(){
        LoginPage loginPage=new LoginPage();
        loginPage.Login();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
        ProductPage product_=new ProductPage();
        product_.product();
        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
        PaymentPage paymentPage=new PaymentPage();
        paymentPage.pay();
        Assert.assertTrue(driver.getCurrentUrl().contains("https://automationexercise.com/payment_done"));
    }
}

//package org.example.Test;r5ttttt0
//
//import org.apache.commons.math3.stat.descriptive.summary.Product;
//import org.example.E_Commerce.LoginPage;
//import org.example.E_Commerce.PaymentPage;
//import org.example.E_Commerce.ProductPage;
//import org.example.UtilsExcel.UtilExcel;
//import org.example.base.CommonToAllTest;
//import org.openqa.selenium.support.ui.ExpectedConditions;
//import org.openqa.selenium.support.ui.WebDriverWait;
//import org.testng.Assert;
//import org.testng.annotations.DataProvider;
//import org.testng.annotations.Test;
//
//import java.time.Duration;
//
//import static org.example.Driver.DriverManager.driver;
//import static org.example.Utilis.WaitHelper.checkVisiblity;
//
//public class E_Commerce_Test  extends CommonToAllTest {
//    @Test(dataProvider = "getData")
//    public void e_commerce_login(String username,String password){
//        LoginPage loginPage=new LoginPage();
//        loginPage.Login(username,password);
//        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/");
//        ProductPage product_=new ProductPage();
//        product_.product();
//        Assert.assertEquals(driver.getCurrentUrl(),"https://automationexercise.com/view_cart");
//        PaymentPage paymentPage=new PaymentPage();
//        paymentPage.pay();
//        Assert.assertTrue(driver.getCurrentUrl().contains("https://automationexercise.com/payment_done"));
//    }
//    @DataProvider(parallel = true)
//    public Object[][] getData(){
//        // READ THE DATA FROM THE EXCEL FILE
//        // GIVE THEM IN THE 2D ARRAY
//        return UtilExcel.getTestDataFromExcel("Sheet1");
//
//    }
//}
