package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.Order;
import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.WebDriver;

public class InProgressOrders extends WaiterPage {

    public InProgressOrders(WebDriver driver) {
        super(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }
}
