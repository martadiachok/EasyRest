package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TimePicker { // 1 minute = 6 degrees

    private final By amButton = By.xpath("//*[text()='AM']");
    private final By pmButton = By.xpath("//*[text()='PM']");
    private final By clockHand = By.xpath("//div[contains(@class,'MuiPickersClockPointer-pointer')]");
    private final By hoursInClock = By.xpath("//span[contains(@class,'MuiPickersClockNumber-clockNumber')]");
    private final By hour = By.xpath("//h2[contains (@class, 'MuiPickersToolbarButton')][1]");
    private final By minute = By.xpath("//h2[contains (@class, 'MuiPickersToolbarButton')][3]");


    protected WebDriver driver;
    public TimePicker(WebDriver driver) {
        this.driver = driver;
    }

    List<WebElement> hoursList = driver.findElements(hours);



}
