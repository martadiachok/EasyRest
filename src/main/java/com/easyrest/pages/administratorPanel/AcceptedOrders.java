package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AdministratorHeader;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AcceptedOrders extends BasePage {

    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");
    private final By pickWaiter = By.xpath("(//input[contains(@name,'waiters')])[1]");
    private final By assignWaiter = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//span[contains(.,'Assign')])[1]");

    public AcceptedOrders(WebDriver driver) {
        super(driver);
    }

    public AcceptedOrders clickOnAssignWaiter() {
        driver.findElement(assignWaiter).click();
        return this;
    }

    public AcceptedOrders clickOnPickWaiter() {
        driver.findElement(pickWaiter).click();
        return this;
    }

    public AcceptedOrders clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

    public AdministratorHeader getAdministratorTabMenu() {
        return new AdministratorHeader(driver);
    }
}
