package org.example.base;

import org.example.Driver.DriverManager;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import static org.example.Driver.DriverManager.driver;

public class CommonToAllTest {
    @BeforeMethod
    public void start(){
        DriverManager.init();
    }
    @AfterMethod
    public void tear(){

    }
}
