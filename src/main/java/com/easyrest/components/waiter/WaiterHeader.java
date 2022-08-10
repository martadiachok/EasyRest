package com.easyrest.components.waiter;

import com.easyrest.pages.waiterPanel.AssignedWaiter;
import com.easyrest.pages.waiterPanel.InProgress;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterHeader {

    private final WebDriver driver;
    private final By assignedWaitersTab = By.xpath("//a[contains(@href,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//a[contains(@href,'In progress')]");

    public WaiterHeader(WebDriver driver) {
        this.driver = driver;
    }

    public AssignedWaiter clickOnAssignedWaiterOrders() {
        driver.findElement(assignedWaitersTab).click();
        return new AssignedWaiter(driver);
    }

    public InProgress clickOnInProgressOrders() {
        driver.findElement(inProgressOrdersTab).click();
        return new InProgress(driver);
    }

}
