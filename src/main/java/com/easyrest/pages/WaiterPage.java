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
    private By inProgressOrdersTab = By.xpath("//span[contains(.,'Assigned waiter')]");
    private By ordersHistoryTab = By.xpath("//span[contains(.,'History')]");

    private By expandOrder = By.xpath("//button[contains(@aria-label,'Show more')]");
    private By startOrder = By.xpath("//span[contains(.,'Start order')]");
    private By closeOrder = By.xpath("//span[contains(.,'Close order')]");
    private By ordersElements = By.xpath("//button[contains(@aria-label,'Show more')]");


    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public void getAllOrders() {
        goToWaiterPanel();
        driver.findElement(allOrdersTab).click();
    }

    public void getAssignedWaiterOrders() {
        goToWaiterPanel();
        driver.findElement(assignedWaitersTab).click();
    }

    public void getInProgressOrders() {
        goToWaiterPanel();
        driver.findElement(inProgressOrdersTab).click();
    }

    public void getOrdersHistory() {
        goToWaiterPanel();
        driver.findElement(ordersHistoryTab).click();
    }

    public WebElement getOrderElement(Integer number) {
        WebElement orderElement = null;
        getAllOrders();
        List<WebElement> orderElements = driver.findElements(ordersElements);
        for (WebElement ol : orderElements) {
            if (Objects.equals(number, Integer.getInteger(ol.getText()))) {
                orderElement = ol;
            }
        }
        return orderElement;
    }

    public void startOrder(Integer number) {
        getAssignedWaiterOrders();
        getOrderElement(number);
        driver.findElement(startOrder).click();
    }

    public void closeOrder(Integer number) {
        getInProgressOrders();
        getOrderElement(number);
        driver.findElement(startOrder).click();
    }

    public void startRandomOrder() {
        getAssignedWaiterOrders();
        driver.findElement(expandOrder).click();
        driver.findElement(startOrder).click();
    }

    public void closeRandomOrder() {
        getInProgressOrders();
        driver.findElement(expandOrder).click();
        driver.findElement(closeOrder).click();
    }

    public Boolean verifyOrderExist(Integer number) {
        goToWaiterPanel();
        return nonNull(getOrderElement(number));
    }

    public void goToWaiterPanel() {
        driver.findElement(userMenu);
        driver.findElement(waiterPanel).click();
    }

}
