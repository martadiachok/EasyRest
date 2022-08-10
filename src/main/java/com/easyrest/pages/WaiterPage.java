package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterPage extends BasePage {

    private final By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");

    private final By waiterPanel = By.xpath("//a[@role='menuitem']");
    private final By logOut = By.xpath("//li[@role='menuitem']");

    private final By allOrdersTab = By.xpath("//a[@href='/waiter/orders/']");
    private final By assignedWaitersTab = By.xpath("//a[contains(@href,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//a[contains(@href,'In progress')]");
    private final By ordersHistoryTab = By.xpath("//a[contains(@href,'History')]");

    private final By expandOrderDetails = By.xpath("(//main//button)[1]");
    private final By startOrder = By.xpath("//span[contains(.,'Start order')]");
    private final By closeOrder = By.xpath("//span[contains(.,'Close order')]");

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public WaiterPage clickOnUserMenu() {
        driver.findElement(userMenu).click();
        return this;
    }

    public WaiterPage clickOnWaiterPanel() {
        driver.findElement(waiterPanel).click();
        return this;
    }

    public SignInPage clickOnLogOut() {
        driver.findElement(logOut).click();
        return new SignInPage(driver);
    }

    public WaiterPage clickOnAllOrders() {
        driver.findElement(allOrdersTab).click();
        return this;
    }

    public WaiterPage clickOnAssignedWaiterOrders() {
        driver.findElement(assignedWaitersTab).click();
        return this;
    }

    public WaiterPage clickOnInProgressOrders() {
        driver.findElement(inProgressOrdersTab).click();
        return this;
    }

    public WaiterPage clickOnOrdersHistory() {
        driver.findElement(ordersHistoryTab).click();
        return this;
    }

    public WaiterPage clickOnStartOrder() {
        driver.findElement(startOrder).click();
        return this;
    }

    public WaiterPage clickOnCloseOrder() {
        driver.findElement(closeOrder).click();
        return this;
    }

    public WaiterPage clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

}
