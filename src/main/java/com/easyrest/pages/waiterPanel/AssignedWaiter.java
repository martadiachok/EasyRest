package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.AssignedWaiterOrderItem;
import com.easyrest.components.waiter.WaiterMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class AssignedWaiter extends BasePage {

    public AssignedWaiter(WebDriver driver) {
        super(driver);
    }

    public WaiterMenu getTabMenu() {
        return new WaiterMenu(driver);
    }

    public AssignedWaiterOrderItem getAssignedWaiterOrderItem() {
        return new AssignedWaiterOrderItem(driver);
    }

}
