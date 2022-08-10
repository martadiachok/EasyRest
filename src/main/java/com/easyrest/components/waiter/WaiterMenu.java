package com.easyrest.components.waiter;

import com.easyrest.pages.waiterPanel.AssignedWaiterOrders;
import com.easyrest.pages.waiterPanel.InProgressOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterMenu {

    private final WebDriver driver;
    private final By assignedWaitersTab = By.xpath("//a[contains(@href,'Assigned waiter')]");
    private final By inProgressOrdersTab = By.xpath("//a[contains(@href,'In progress')]");

    public WaiterMenu(WebDriver driver) {
        this.driver = driver;
    }

    public AssignedWaiterOrders clickOnAssignedWaiterOrders() {
        driver.findElement(assignedWaitersTab).click();
        return new AssignedWaiterOrders(driver);
    }

    public InProgressOrders clickOnInProgressOrders() {
        driver.findElement(inProgressOrdersTab).click();
        return new InProgressOrders(driver);
    }

}
