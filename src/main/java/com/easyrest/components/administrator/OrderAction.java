package com.easyrest.components.administrator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OrderAction {
    private final WebDriver driver;
    private final By acceptOrder = By.xpath("//div[contains(@aria-expanded,'true')]/parent::div//span[contains(.,'Accept')]");
    private final By pickWaiter = By.xpath("//div[contains(@aria-expanded,'true')]/parent::div//input[contains(@name,'waiters')]");
    private final By assignWaiter = By.xpath("//div[contains(@aria-expanded,'true')]/parent::div//span[contains(.,'Assign')]");

    public OrderAction(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnAcceptOrder() {
        driver.findElement(acceptOrder).click();
    }

    public OrderAction clickOnPickWaiter() {
        driver.findElement(pickWaiter).click();
        return this;
    }

    public void clickOnAssignWaiter() {
        driver.findElement(assignWaiter).click();
    }

}
