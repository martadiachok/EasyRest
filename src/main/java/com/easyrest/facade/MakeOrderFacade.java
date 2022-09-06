package com.easyrest.facade;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.components.menuPage.Cart;
import com.easyrest.components.menuPage.MenuItem;
import com.easyrest.components.menuPage.OrderConfirmation;
import com.easyrest.pages.RestaurantsList;
import org.openqa.selenium.WebDriver;

public class MakeOrderFacade {
    private Cart cart;
    private MenuItem menuItem;
    private OrderConfirmation orderConfirmation;
    private HeaderForAuthorizedUser header;
    private RestaurantsList restaurantsList;

    public MakeOrderFacade(WebDriver driver){
        cart = new Cart(driver);
        menuItem = new MenuItem(driver);
        orderConfirmation = new OrderConfirmation(driver);
        header = new HeaderForAuthorizedUser(driver);
        restaurantsList = new RestaurantsList(driver);
    }

    public void makeOrder(){
        header.clickOnRestaurantList();
        restaurantsList.clickOnButtonWatchMenu();
        menuItem.addProduct();
        cart.submitOrder();
        orderConfirmation.submitOrderInWindow();

    }

}
