package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AdministratorMenu;
import com.easyrest.components.administrator.WaitingForConfirmOrderItem;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class WaitingForConfirmOrders extends BasePage {

    public WaitingForConfirmOrders(WebDriver driver) {
        super(driver);
    }

    public AdministratorMenu getAdministratorTabMenu() {
        return new AdministratorMenu(driver);
    }

    public WaitingForConfirmOrderItem getWaitingForConfirmOrderItem() {
        return new WaitingForConfirmOrderItem(driver);
    }
}
