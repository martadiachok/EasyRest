package com.easyrest.pages;

import com.easyrest.components.menuPage.Cart;
import com.easyrest.components.menuPage.MenuItem;
import com.easyrest.components.menuPage.OrderConfirmation;
import org.openqa.selenium.WebDriver;

public class MenuPage extends BasePage {
    private Cart cart;
    private MenuItem menuItem;
    private OrderConfirmation orderConfirmation;

    public MenuPage(WebDriver driver) {
        super(driver);
        cart = new Cart(driver);
        menuItem = new MenuItem(driver);
        orderConfirmation = new OrderConfirmation(driver);

    }
}