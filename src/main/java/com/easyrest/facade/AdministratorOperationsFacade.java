package com.easyrest.facade;

import com.easyrest.components.administrator.AdministratorMenu;
import com.easyrest.components.administrator.OrderAction;
import com.easyrest.pages.AdministratorPage;
import com.easyrest.pages.administratorPanel.AcceptedOrders;
import com.easyrest.pages.administratorPanel.WaitingForConfirmOrders;
import org.openqa.selenium.WebDriver;

public class AdministratorOperationsFacade {
    private final AdministratorPage administratorPage;
    private final OrderAction orderAction;

    public AdministratorOperationsFacade(WebDriver driver) {
        this.administratorPage = new AdministratorPage(driver);
        this.orderAction = new OrderAction(driver);
    }

    public WaitingForConfirmOrders seeWaitingForConfirmOrders() {
        return goToTabMenu()
                .clickOnWaitingForConfirmOrdersTab();
    }

    public AcceptedOrders seeAcceptedOrders() {
        return goToTabMenu()
                .clickOnAcceptedOrdersTab();
    }

    public void seeAssignedWaitersOrders() {
        goToTabMenu()
                .clickOnAssignedWaitersTab();
    }

    public void seeWaiters() {
        goToTabMenu()
                .clickOnWaitersTab();
    }

    public void acceptOrder(int orderNumber) {
        seeWaitingForConfirmOrders()
                .getOrder()
                .clickOnExpandOrderDetails(orderNumber);
        orderAction.clickOnAcceptOrder();
    }

    public void assignWaiter(int orderNumber) {
        seeAcceptedOrders()
                .getOrder()
                .clickOnExpandOrderDetails(orderNumber);
        orderAction
                .clickOnPickWaiter()
                .clickOnAssignWaiter();
    }

    public Integer seeWaitingForConfirmOrdersCount() {
        return seeWaitingForConfirmOrders()
                .getOrdersCount();
    }

    public Integer seeAcceptedOrdersCount() {
        return seeAcceptedOrders()
                .getOrdersCount();
    }

    public String getSelectedTabName() {
        return goToTabMenu()
                .getSelectedTabName();
    }

    private AdministratorMenu goToTabMenu() {
        return administratorPage
                .getAdministratorTabMenu();
    }

}
