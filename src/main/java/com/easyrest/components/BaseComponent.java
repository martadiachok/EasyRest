package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class BaseComponent {
    protected WebDriver driver;

    public BaseComponent(WebDriver driver){
        this.driver = driver;
    }

    protected void enterData(String data, By element, WebDriver driver){
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(data);
    }

}
