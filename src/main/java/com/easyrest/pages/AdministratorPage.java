package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorPage extends BasePage {

    private final By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");

    private final By administratorPanel = By.xpath("//a[@role='menuitem']");
    private final By logOut = By.xpath("//li[@role='menuitem']");

    private final By waitingForConfirmOrdersTab = By.xpath("//div[@role='tablist']//button[1]");
    private final By acceptedOrdersTab = By.xpath("//div[@role='tablist']//button[2]");
    private final By assignedWaitersTab = By.xpath("//div[@role='tablist']//button[3]");
    private final By waitersTab = By.xpath("//div[@role='tablist']//button[4]");

    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");
    private final By acceptOrder = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button/span[contains(.,'Accept')])[1]");
    private final By pickWaiter = By.xpath("(//input[contains(@name,'waiters')])[1]");
    private final By assignWaiter = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//span[contains(.,'Assign')])[1]");
    private final By expandOrdersThatBelongWaiter = By.xpath("(//div[contains(@class,'AdministratorPanel')]/div//div[@role='button'])[1]");

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public AdministratorPage clickOnUserMenu() {
        driver.findElement(userMenu).click();
        return this;
    }

    public AdministratorPage clickOnAdministratorPanel() {
        driver.findElement(administratorPanel).click();
        return this;
    }

    private SignInPage clickOnLogOut() {
        driver.findElement(logOut).click();
        return new SignInPage(driver);
    }

    public AdministratorPage clickOnWaitingForConfirmOrders() {
        driver.findElement(waitingForConfirmOrdersTab).click();
        return this;
    }

    public AdministratorPage clickOnAcceptedOrders() {
        driver.findElement(acceptedOrdersTab).click();
        return this;
    }

    public AdministratorPage clickOnAssignedWaiters() {
        driver.findElement(assignedWaitersTab).click();
        return this;
    }

    public AdministratorPage clickOnWaiters() {
        driver.findElement(waitersTab).click();
        return this;
    }

    public AdministratorPage clickOnAcceptOrder() {
        driver.findElement(acceptOrder).click();
        return this;
    }

    public AdministratorPage clickOnAssignWaiter() {
        driver.findElement(assignWaiter).click();
        return this;
    }

    public AdministratorPage clickOnPickWaiter() {
        driver.findElement(pickWaiter).click();
        return this;
    }

    public AdministratorPage clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

    public AdministratorPage clickOnExpandWaiterOrders() {
        driver.findElement(expandOrdersThatBelongWaiter).click();
        return this;
    }

}
