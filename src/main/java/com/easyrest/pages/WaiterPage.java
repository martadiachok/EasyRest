package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterPage extends BasePage {

    private final By logo = By.xpath("//a[text()='Easy-rest']");
    private final By home = By.xpath("//span[contains(.,'Home')]");
    private final By restaurantList = By.xpath("//span[contains(.,'Restaurants List')]");
    private final By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");

    private final By waiterPanel = By.xpath("//ul/a[contains(.,'Waiter panel')]");
    private final By logOut = By.xpath("//ul/li[contains(.,'Log Out')]");

    private final By allOrdersTab = By.xpath("//span[contains(.,'All')]");
    private final By assignedWaitersTab = By.xpath("//span[contains(.,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//span[contains(.,'In progress')]");
    private final By ordersHistoryTab = By.xpath("//span[contains(.,'History')]");

    private final By expandOrder = By.xpath("//button[contains(@aria-label,'Show more')]/child::node()");
    private final By startOrder = By.xpath("//span[contains(.,'Start order')]");
    private final By closeOrder = By.xpath("//span[contains(.,'Close order')]");

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public HomePage clickOnLogo() {
        driver.findElement(logo).click();
        return new HomePage(driver);
    }

    public HomePage clickOnHome() {
        driver.findElement(home).click();
        return new HomePage(driver);
    }

    public RestaurantsList clickOnRestaurantList() {
        driver.findElement(restaurantList).click();
        return new RestaurantsList(driver);
    }

    public WaiterPage clickOnUserMenu() {
        driver.findElement(userMenu).click();
        return this;
    }

    public WaiterPage clickOnWaiterPanel() {
        driver.findElement(waiterPanel).click();
        return this;
    }

    private SignInPage clickOnLogOut() {
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

    public WaiterPage clickOnExpandOrder() {
        driver.findElement(expandOrder).click();
        return this;
    }

    public SignInPage logOut() {
        return clickOnUserMenu().clickOnLogOut();
    }

}
