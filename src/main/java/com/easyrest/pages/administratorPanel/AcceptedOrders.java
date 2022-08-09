package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AcceptedOrderItem;
import com.easyrest.components.administrator.AdministratorHeader;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class AcceptedOrders extends BasePage {

    public AcceptedOrders(WebDriver driver) {
        super(driver);
    }

    public AdministratorHeader getAdministratorTabMenu() {
        return new AdministratorHeader(driver);
    }

    public AcceptedOrderItem getAcceptedOrderItem() {
        return new AcceptedOrderItem(driver);
    }
}
