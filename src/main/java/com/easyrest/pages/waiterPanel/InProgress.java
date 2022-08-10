package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.InProgressOrderItem;
import com.easyrest.components.waiter.WaiterMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class InProgress extends BasePage {

    public InProgress(WebDriver driver) {
        super(driver);
    }

    public WaiterMenu getTabMenu() {
        return new WaiterMenu(driver);
    }

    public InProgressOrderItem getInProgressOrderItem() {
        return new InProgressOrderItem(driver);
    }
}
