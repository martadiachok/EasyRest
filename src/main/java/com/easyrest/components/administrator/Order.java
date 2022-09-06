package com.easyrest.components.administrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Order {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("//div[contains(@class,'ExpandItem')]/div[contains(@role,'button')]");

    public Order(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnExpandOrderDetails(int orderNumber) {
        driver
                .findElements(expandOrderDetails)
                .forEach(order -> {
            if (order.getText().contains(String.valueOf(orderNumber))) {
                order.click();
            }
        });
    }

}
