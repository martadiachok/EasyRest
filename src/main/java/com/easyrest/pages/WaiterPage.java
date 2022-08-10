package com.easyrest.pages;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.waiter.Order;
import com.easyrest.components.waiter.WaiterMenu;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WaiterPage extends BasePage {

    private final By order = By.xpath("//div[contains(@class,'Order-card')]");

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public HeaderForAuthorizedUser getToolbarMenu() {
        return new HeaderForAuthorizedUser(driver);
    }

    public WaiterMenu getWaiterTabMenu() {
        return new WaiterMenu(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }

    public Integer getOrdersCount() {
        List<WebElement> orders = driver.findElements(order);
        return orders.size();
    }

}
