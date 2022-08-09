package com.easyrest.components.administrator;

import com.easyrest.pages.administratorPanel.WaitingForConfirmOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitingForConfirmOrderItem {
    private final WebDriver driver;
    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");
    private final By acceptOrder = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button/span[contains(.,'Accept')])[1]");

    public WaitingForConfirmOrderItem(WebDriver driver) {
        this.driver = driver;
    }

    public WaitingForConfirmOrderItem clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

    public WaitingForConfirmOrders clickOnAcceptOrder() {
        driver.findElement(acceptOrder).click();
        return new WaitingForConfirmOrders(driver);
    }
}
