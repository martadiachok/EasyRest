package com.easyrest.facade;

import com.easyrest.components.AddRestaurant;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.WebDriver;

public class AddRestaurantFacade {
    private WebDriver driver;
    private AddRestaurant addRestaurant;
    private Right_sideMenu right_sideMenu;
    private MyRestaurants myRestaurants;

    public AddRestaurantFacade(WebDriver driver) {
        this.driver = driver;
        addRestaurant = new AddRestaurant(driver);
        right_sideMenu = new Right_sideMenu(driver);
        myRestaurants = new MyRestaurants(driver);
    }

    public void addRestaurant(String name, String address){
        right_sideMenu.seeMyRestaurants()
                .clickAddRestaurantPlusButton()
                .enterRestaurantName(name).enterRestaurantAddress(address)
                .approveRestaurantAdding();
    }

}
