package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AcceptedOrderItem;
import com.easyrest.components.administrator.AdministratorMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class AcceptedOrders extends BasePage {

    public AcceptedOrders(WebDriver driver) {
        super(driver);
    }

    public AdministratorMenu getAdministratorTabMenu() {
        return new AdministratorMenu(driver);
    }

    public AcceptedOrderItem getAcceptedOrderItem() {
        return new AcceptedOrderItem(driver);
    }
}
