package com.easyrest.pages;

import org.openqa.selenium.By;

public class WaiterPage {

    private By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");
    private By waiterPanel = By.xpath("//ul/a");

    private By allClientsTab = By.xpath("//span[contains(.,'All')]");
    private By assignedWaitersTab = By.xpath("//span[contains(.,'Assigned waiter')]");
    private By historyTab = By.xpath("//span[contains(.,'History')]");

    private By expandClient = By.xpath("//button[contains(@aria-label,'Show more')]");
    private By startOrder = By.xpath("//span[contains(.,'Start order')]");
    private By closeOrder = By.xpath("//span[contains(.,'Close order')]");
    private By expandHistory = By.xpath("//button[contains(@aria-label,'Show more')]");

}
