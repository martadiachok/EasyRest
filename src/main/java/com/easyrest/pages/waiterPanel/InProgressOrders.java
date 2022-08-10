package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.InProgressOrderItem;
import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.WebDriver;

public class InProgressOrders extends WaiterPage {

    public InProgressOrders(WebDriver driver) {
        super(driver);
    }

    public InProgressOrderItem getInProgressOrderItem() {
        return new InProgressOrderItem(driver);
    }
}
