package com.easyrest.components.waiter;

import com.easyrest.pages.waiterPanel.InProgressOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InProgressOrderItem {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("(//main//button)[1]");
    private final By closeOrder = By.xpath("(//span[contains(.,'Close order')])[1]");

    public InProgressOrderItem(WebDriver driver) {
        this.driver = driver;
    }

    public InProgressOrderItem clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return new InProgressOrderItem(driver);
    }

    public InProgressOrders clickOnCloseOrder() {
        driver.findElement(closeOrder).click();
        return new InProgressOrders(driver);
    }
}
