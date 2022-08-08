package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.WaiterHeader;
import com.easyrest.pages.BasePage;
import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class InProgress extends BasePage {

    private WaiterHeader waiterHeader;
    private final By expandOrderDetails = By.xpath("(//main//button)[1]");
    private final By closeOrder = By.xpath("//span[contains(.,'Close order')]");

    public InProgress(WebDriver driver) {
        super(driver);
    }

    public WaiterPage clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return new WaiterPage(driver);
    }

    public WaiterPage clickOnCloseOrder() {
        driver.findElement(closeOrder).click();
        return new WaiterPage(driver);
    }

    public WaiterHeader getTabMenu() {
        return waiterHeader;
    }
}
