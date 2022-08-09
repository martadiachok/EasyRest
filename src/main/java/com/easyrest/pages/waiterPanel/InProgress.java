package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.InProgressOrderItem;
import com.easyrest.components.waiter.WaiterHeader;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class InProgress extends BasePage {

    public InProgress(WebDriver driver) {
        super(driver);
    }

    public WaiterHeader getTabMenu() {
        return new WaiterHeader(driver);
    }

    public InProgressOrderItem getInProgressOrderItem() {
        return new InProgressOrderItem(driver);
    }
}
