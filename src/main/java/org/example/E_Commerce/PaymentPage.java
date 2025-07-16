package org.example.E_Commerce;

import org.example.Utilis.PropertiesReader;
import org.example.base.CommonToAllPage;
import org.openqa.selenium.By;

import static org.example.Driver.DriverManager.driver;
import static org.example.Utilis.WaitHelper.checkVisiblity;

public class PaymentPage extends CommonToAllPage {
    private static By checkout=By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private static By place=By.xpath("//a[@class=\"btn btn-default check_out\"]");
    private static By cardname=By.xpath("//input[@name=\"name_on_card\"]");
    private static By cardno=By.xpath("//input[@name=\"card_number\"]");
    private static By cvv=By.xpath("//input[@name=\"cvc\"]");
    private static By exf_mon=By.xpath("//input[@name=\"expiry_month\"]");
    private static By exf_yy=By.xpath("//input[@name=\"expiry_year\"]");
    private static By log_last=By.xpath("//button[@id=\"submit\"]");

    public static void pay(){
        btnclick(checkout);
        checkVisiblity(driver,place,5);

        scrolltoele(place);
        btnclick(place);
        input(cardname, PropertiesReader.readkey("cardname"));
        input(cardno, PropertiesReader.readkey("cardno"));
        input(cvv, PropertiesReader.readkey("cvv"));
        input(exf_mon, PropertiesReader.readkey("exf_mon"));
        input(exf_yy, PropertiesReader.readkey("exf_yy"));
        btnclick(log_last);
        checkVisiblity(driver,place,5);




    }
}
