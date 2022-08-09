package com.easyrest.components.administrator;

import com.easyrest.pages.administratorPanel.AcceptedOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceptedOrderItem {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");
    private final By pickWaiter = By.xpath("(//input[contains(@name,'waiters')])[1]");
    private final By assignWaiter = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//span[contains(.,'Assign')])[1]");

    public AcceptedOrderItem(WebDriver driver) {
        this.driver = driver;
    }

    public AcceptedOrderItem clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

    public AcceptedOrderItem clickOnPickWaiter() {
        driver.findElement(pickWaiter).click();
        return this;
    }

    public AcceptedOrders clickOnAssignWaiter() {
        driver.findElement(assignWaiter).click();
        return new AcceptedOrders(driver);
    }

}
