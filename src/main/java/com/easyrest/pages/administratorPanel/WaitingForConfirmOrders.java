package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AdministratorHeader;
import com.easyrest.components.administrator.WaitingForConfirmOrderItem;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class WaitingForConfirmOrders extends BasePage {

    public WaitingForConfirmOrders(WebDriver driver) {
        super(driver);
    }

    public AdministratorHeader getAdministratorTabMenu() {
        return new AdministratorHeader(driver);
    }

    public WaitingForConfirmOrderItem getWaitingForConfirmOrderItem() {
        return new WaitingForConfirmOrderItem(driver);
    }
}
