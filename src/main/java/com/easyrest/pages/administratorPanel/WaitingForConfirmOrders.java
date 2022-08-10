package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.WaitingForConfirmOrderItem;
import com.easyrest.pages.AdministratorPage;
import org.openqa.selenium.WebDriver;

public class WaitingForConfirmOrders extends AdministratorPage {

    public WaitingForConfirmOrders(WebDriver driver) {
        super(driver);
    }

    public WaitingForConfirmOrderItem getWaitingForConfirmOrderItem() {
        return new WaitingForConfirmOrderItem(driver);
    }

}
