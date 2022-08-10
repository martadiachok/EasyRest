package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.Order;
import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AssignedWaiterOrders extends WaiterPage {

    public AssignedWaiterOrders(WebDriver driver) {
        super(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }

}
