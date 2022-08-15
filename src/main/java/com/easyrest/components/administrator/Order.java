package com.easyrest.components.administrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");

    public Order(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
    }
}
