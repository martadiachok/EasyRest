package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TimePicker { // 1 minute = 6 degrees

    private final By amButton = By.xpath("//*[text()='AM']");
    private final By pmButton = By.xpath("//*[text()='PM']");
    private final By clockHand = By.xpath("//div[contains(@class,'MuiPickersClockPointer-pointer')]");
    private final By hours = By.xpath("//span[contains(@class,'MuiPickersClockNumber-clockNumber')]");

    protected WebDriver driver;
    public TimePicker(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement> hoursList = driver.findElements(hours);



}
