package com.easyrest.pages.moderatorPanel;

import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.components.ActionOnRestaurants;
import com.easyrest.pages.BasePage;
import com.easyrest.pages.OwnerPanel;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Restaurants extends BasePage {


    ActionOnRestaurants actionOnRestaurants = new ActionOnRestaurants(driver);
    LeftSideMenu leftSideMenu = new LeftSideMenu(driver);

    public Restaurants(WebDriver driver) {super(driver);}

    public Restaurants seeAllRestaurants(){
        leftSideMenu.clickOnMenuButtonRestaurants();
        return this;
    }

    public Restaurants clickUnapprovedRest(){
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonUnapproved();
        return this;
    }
    public Restaurants clickApprovedRest(){
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonApproved();
        return this;
    }
 public Restaurants clickArchivedRest(){
        leftSideMenu.clickOnMenuButtonRestaurants();
        actionOnRestaurants.clickOnButtonArchived();
        return this;
 }

 public Restaurants approveRest(){
        clickUnapprovedRest();
String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
actionOnRestaurants.approveRest();
actionOnRestaurants.checkIfRestMovedToApprovedList(restaurantName);
return this;
 }

 public Restaurants disapproveRest(){
        clickUnapprovedRest();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.disapproveRest();
        actionOnRestaurants.checkIfRestMovedToArchiveddList(restaurantName);
        return this;
 }
 public Restaurants archiveRest(){
        clickApprovedRest();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.archiveRest();
        actionOnRestaurants.checkIfRestMovedToArchiveddList(restaurantName);
        return this;
 }
 public Restaurants restoreRest(){
        clickArchivedRest();
        String restaurantName = actionOnRestaurants.getFirstNameFromRestaurant();
        actionOnRestaurants.restoreRest();
        actionOnRestaurants.checkIfRestMovedToApprovedList(restaurantName);
        return this;
 }
}
