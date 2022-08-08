package com.easyrest.pages.administratorPanel;

import com.easyrest.components.administrator.AdministratorHeader;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaitingForConfirmOrders extends BasePage {

    private final By expandOrderDetails = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button)[1]");
    private final By acceptOrder = By.xpath("(//div[contains(@class,'AdministratorPanel-root')]/div//button/span[contains(.,'Accept')])[1]");

    public WaitingForConfirmOrders(WebDriver driver) {
        super(driver);
    }

    public WaitingForConfirmOrders clickOnExpandOrderDetails() {
        driver.findElement(expandOrderDetails).click();
        return this;
    }

    public WaitingForConfirmOrders clickOnAcceptOrder() {
        driver.findElement(acceptOrder).click();
        return this;
    }

    public AdministratorHeader getAdministratorTabMenu() {
        return new AdministratorHeader(driver);
    }
}
