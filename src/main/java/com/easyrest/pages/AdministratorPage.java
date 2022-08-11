package com.easyrest.pages;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.administrator.AdministratorMenu;
import com.easyrest.components.administrator.Order;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdministratorPage extends BasePage {

    private final By order = By.xpath("//div[contains(@class,'ExpandItem')]/div[contains(@role,'button')]");

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public HeaderForAuthorizedUser getToolbarMenu() {
        return new HeaderForAuthorizedUser(driver);
    }

    public AdministratorMenu getAdministratorTabMenu() {
        return new AdministratorMenu(driver);
    }

    public Order getOrder() {
        return new Order(driver);
    }

    public Integer getOrdersCount() {
        List<WebElement> orders = driver.findElements(order);
        return orders.size();
    }
}
