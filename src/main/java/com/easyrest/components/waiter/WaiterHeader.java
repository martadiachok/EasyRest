package com.easyrest.components.waiter;

import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterHeader {

    private final WebDriver driver;
    private final By assignedWaitersTab = By.xpath("//a[contains(@href,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//a[contains(@href,'In progress')]");

    public WaiterHeader(WebDriver driver) {
        this.driver = driver;
    }

    public WaiterPage clickOnAssignedWaiterOrders() {
        driver.findElement(assignedWaitersTab).click();
        return new WaiterPage(driver);
    }

    public WaiterPage clickOnInProgressOrders() {
        driver.findElement(inProgressOrdersTab).click();
        return new WaiterPage(driver);
    }

}
