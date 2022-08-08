package com.easyrest.pages.waiterPanel;

import com.easyrest.components.waiter.WaiterHeader;
import com.easyrest.pages.BasePage;
import com.easyrest.pages.WaiterPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AssignedWaiter extends BasePage {

    private final By expandOrderDetails = By.xpath("(//main//button)[1]");
    private final By startOrder = By.xpath("//span[contains(.,'Start order')]");

    public AssignedWaiter(WebDriver driver) {
        super(driver);
    }

    public WaiterPage clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return new WaiterPage(driver);
    }

    public WaiterPage clickOnStartOrder() {
        driver.findElement(startOrder).click();
        return new WaiterPage(driver);
    }

    public WaiterHeader getTabMenu() {
        return new WaiterHeader(driver);
    }

}
