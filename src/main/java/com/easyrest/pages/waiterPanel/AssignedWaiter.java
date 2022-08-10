package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.AssignedWaiterOrderItem;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class AssignedWaiter extends BasePage {

    public AssignedWaiter(WebDriver driver) {
        super(driver);
    }

    public AssignedWaiterOrderItem getAssignedWaiterOrderItem() {
        return new AssignedWaiterOrderItem(driver);
    }

}
