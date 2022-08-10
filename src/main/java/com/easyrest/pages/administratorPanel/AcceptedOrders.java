package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AcceptedOrderItem;
import com.easyrest.pages.AdministratorPage;
import org.openqa.selenium.WebDriver;

public class AcceptedOrders extends AdministratorPage {

    public AcceptedOrders(WebDriver driver) {
        super(driver);
    }

    public AcceptedOrderItem getAcceptedOrderItem() {
        return new AcceptedOrderItem(driver);
    }

}
