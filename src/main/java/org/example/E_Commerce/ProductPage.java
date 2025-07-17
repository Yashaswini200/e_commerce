package org.example.E_Commerce;

import org.example.Utilis.PropertiesReader;
import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import static org.example.Driver.DriverManager.driver;
import static org.example.Utilis.WaitHelper.checkVisiblity;

public class ProductPage extends CommonToAllPage {
    private static By pro_btn=By.xpath("//a[@href=\"/products\"]");
    private static By pro_in=By.xpath("//input[@name=\"search\"]");
private static By pro_serach=By.xpath("//button[@id=\"submit_search\"]");
private static By img=By.xpath("//a[@data-product-id=\"8\"]");
private static By onhover=By.xpath("//img[@src=\"/get_product_picture/8\"]");
private static By view=By.xpath("//a[@href=\"/view_cart\"]");
    public static void product(){
        btnclick(pro_btn);
        input(pro_in, PropertiesReader.readkey("cloth"));
        btnclick(pro_serach);
        checkVisiblity(driver,img,15);
       scrolltoele(onhover);

        btnclick(img);
        checkVisiblity(driver,view,5);
        btnclick(view);
        checkVisiblity(driver,view,5);



    }
}
