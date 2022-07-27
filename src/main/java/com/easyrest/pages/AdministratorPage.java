package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorPage extends BasePage {

    private By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");
    private By administratorPanel = By.xpath("//ul/a");

    private By waitingForConfirmOrdersTab = By.xpath("//span[contains(.,'Waiting for confirm')]");
    private By acceptedOrdersTab = By.xpath("//span[contains(.,'Accepted')]");
    private By assignedWaitersTab = By.xpath("//span[contains(.,'Assigned waiter')]");
    private By waitersTab = By.xpath("//span[contains(.,'Waiters')]");

    private By expandOrder = By.xpath("//div[contains(@role,'button')][contains(@tabindex,'-1')]");
    private By acceptOrder = By.xpath("//span[contains(.,'Accept')]");
    private By pickWaiter = By.xpath("//input[contains(@name,'waiters')]");
    private By assignWaiter = By.xpath("//span[contains(.,'Assign')]");
    private By expandWaiterOrders = By.xpath("//div[contains(@role,'button')][contains(@tabindex,'-1')]");

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public void acceptOrder() {
        getWaitingForConfirmOrders();
        expandOrder();
        driver.findElement(acceptOrder).click();
    }

    public void assignWaiter() {
        getAcceptedOrders();
        expandOrder();
        pickWaiter();
        driver.findElement(assignWaiter).click();
    }

    public void pickWaiter() {
        driver.findElement(pickWaiter).click();
    }

    public void expandOrder() {
        driver.findElement(expandOrder).click();
    }

    public void expandWaiterOrders() {
        getWaiters();
        driver.findElement(expandWaiterOrders).click();
    }

    public void getWaitingForConfirmOrders() {
        goToAdministratorPanel();
        driver.findElement(waitingForConfirmOrdersTab).click();
    }

    public void getAcceptedOrders() {
        goToAdministratorPanel();
        driver.findElement(acceptedOrdersTab).click();
    }

    public void getAssignedWaiters() {
        goToAdministratorPanel();
        driver.findElement(assignedWaitersTab).click();
    }

    public void getWaiters() {
        goToAdministratorPanel();
        driver.findElement(waitersTab).click();
    }

    public void goToAdministratorPanel() {
        driver.findElement(userMenu);
        driver.findElement(administratorPanel).click();
    }
}
