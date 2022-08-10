package com.easyrest.components.waiter;

import com.easyrest.pages.waiterPanel.AssignedWaiterOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignedWaiterOrderItem {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("(//main//button)[1]");
    private final By startOrder = By.xpath("//span[contains(.,'Start order')]");

    public AssignedWaiterOrderItem(WebDriver driver) {
        this.driver = driver;
    }

    public AssignedWaiterOrderItem clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return new AssignedWaiterOrderItem(driver);
    }

    public AssignedWaiterOrders clickOnStartOrder() {
        driver.findElement(startOrder).click();
        return new AssignedWaiterOrders(driver);
    }
}
