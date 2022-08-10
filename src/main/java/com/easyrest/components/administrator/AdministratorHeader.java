package com.easyrest.components.administrator;

import com.easyrest.pages.administratorPanel.AcceptedOrders;
import com.easyrest.pages.administratorPanel.WaitingForConfirmOrders;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorHeader {
    private final WebDriver driver;
    private final By waitingForConfirmOrdersTab = By.xpath("//div[@role='tablist']//button[1]");
    private final By acceptedOrdersTab = By.xpath("//div[@role='tablist']//button[2]");

    public AdministratorHeader(WebDriver driver) {
        this.driver = driver;
    }

    public WaitingForConfirmOrders clickOnWaitingForConfirmOrders() {
        driver.findElement(waitingForConfirmOrdersTab).click();
        return new WaitingForConfirmOrders(driver);
    }

    public AcceptedOrders clickOnAcceptedOrders() {
        driver.findElement(acceptedOrdersTab).click();
        return new AcceptedOrders(driver);
    }

}
