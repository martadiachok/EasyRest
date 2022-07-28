package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.Objects;

import static java.util.Objects.nonNull;

public class WaiterPage extends BasePage {

    private By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");
    private By waiterPanel = By.xpath("//ul/a");

    private By allOrdersTab = By.xpath("//span[contains(.,'All')]");
    private By assignedWaitersTab = By.xpath("//span[contains(.,'Assigned waiter')]");
    private By inProgressOrdersTab = By.xpath("//span[contains(.,'In progress')]");
    private By ordersHistoryTab = By.xpath("//span[contains(.,'History')]");

    private By expandOrder = By.xpath("//button[contains(@aria-label,'Show more')]/child::node()");
    private By startOrder = By.xpath("//span[contains(.,'Start order')]");
    private By closeOrder = By.xpath("//span[contains(.,'Close order')]");
    private By ordersElements = By.xpath("//button[contains(@aria-label,'Show more')]");
    private By orderNumber = By.xpath("//span[contains(.,'№')]");

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public void goToAllOrders() {
        goToWaiterPanel();
        driver.findElement(allOrdersTab).click();
    }

    public void goToAssignedWaiterOrders() {
        goToWaiterPanel();
        driver.findElement(assignedWaitersTab).click();
    }

    public void goToInProgressOrders() {
        goToWaiterPanel();
        driver.findElement(inProgressOrdersTab).click();
    }

    public void goToOrdersHistory() {
        goToWaiterPanel();
        driver.findElement(ordersHistoryTab).click();
    }

    public Integer startOrder(Integer number) {
        goToAssignedWaiterOrders();
        getOrderElement(number);
        expandOrder(number);
        driver.findElement(startOrder).click();
        return number;
    }

    public Integer closeOrder(Integer number) {
        goToInProgressOrders();
        getOrderElement(number);
        expandOrder(number);
        driver.findElement(startOrder).click();
        return number;
    }

    public Boolean verifyOrderMovedToInProgress(Integer number) {
        goToInProgressOrders();
        return verifyOrderExist(number);
    }

    public Boolean verifyOrderMovedToHistory(Integer number) {
        goToOrdersHistory();
        return verifyOrderExist(number);
    }

    public void expandOrder() {
        driver.findElement(expandOrder).click();
    }

    public void expandOrder(Integer number) {
        WebElement orderElement = null;
        List<WebElement> orderElements = driver.findElements(ordersElements);
        for (WebElement ol : orderElements) {
            if (Objects.equals(number, Integer.getInteger(ol.getText()))) {
                orderElement.click();
            }
        }
    }

    public Integer getOrderNumber() {
        return Integer.getInteger(driver.findElement(orderNumber).getText());
    }

    public WebElement getOrderElement(Integer number) {
        WebElement orderElement = null;
        goToAllOrders();
        List<WebElement> orderElements = driver.findElements(ordersElements);
        for (WebElement ol : orderElements) {
            if (Objects.equals(number, Integer.getInteger(ol.getText()))) {
                orderElement = ol;
            }
        }
        return orderElement;
    }

    public Integer startRandomOrder() {
        goToAssignedWaiterOrders();
        expandOrder();
        driver.findElement(startOrder).click();
        return getOrderNumber();
    }

    public void closeRandomOrder() {
        goToInProgressOrders();
        expandOrder();
        driver.findElement(closeOrder).click();
    }

    public Boolean verifyOrderExist(Integer number) {
        return nonNull(getOrderElement(number));
    }

    public void goToWaiterPanel() {
        driver.findElement(userMenu);
        driver.findElement(waiterPanel).click();
    }
}
