package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Restaurants extends BasePage {

    LeftSideMenu leftSideMenu  = new LeftSideMenu(driver);

    public Restaurants(WebDriver driver) { super(driver); }

    public Restaurants seeAllRestaurants(){
        leftSideMenu.clickRestaurants();
        return this;
    }
}
