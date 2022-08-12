package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseComponent {
    protected WebDriver driver;

    public BaseComponent(WebDriver driver){
        this.driver = driver;
    }

    protected void enterData(String data, By element, WebDriver driver){
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(data);
    }
    protected void clearWithKeysAndFillInput(By element, String inputText){
        WebElement webElement = this.driver.findElement(element);
        webElement.sendKeys(new CharSequence[]{Keys.chord(new CharSequence[]{Keys.CONTROL,"a"}),inputText});
    }
}
