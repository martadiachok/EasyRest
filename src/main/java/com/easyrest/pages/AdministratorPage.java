package com.easyrest.pages;

import org.openqa.selenium.By;

public class AdministratorPage {

    private By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");
    private By administratorPanel = By.xpath("//ul/a");

    private By waitingForConfirmOrders = By.xpath("//span[contains(.,'Waiting for confirm')]");
    private By acceptedOrders = By.xpath("//span[contains(.,'Accepted')]");
    private By assignedWaiters = By.xpath("//span[contains(.,'Assigned waiter')]");
    private By waiters = By.xpath("//span[contains(.,'Waiters')]");

    private By expandOrder = By.xpath("//div[contains(@role,'button')][contains(@tabindex,'-1')]");
    private By acceptOrder = By.xpath("//span[contains(.,'Accept')]");
    private By pickWaiter = By.xpath("//input[contains(@name,'waiters')]");
    private By assignWaiter = By.xpath("//span[contains(.,'Assign')]");
    private By expandWaiter = By.xpath("//div[contains(@role,'button')][contains(@tabindex,'-1')]");

}
