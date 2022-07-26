package com.easyrest.pages;

import org.openqa.selenium.By;

public class RestaurantsList {
    By restaurantsListLocator = By.xpath("//span [text()='Restaurants List']");
    By signInLocator = By.xpath("//span [text() = 'Sign In']");
    By signUpLocator = By.xpath("//span [text() = 'Sign Up']");
    By homeLocator = By.xpath("//span [text() = 'Home']");
    By erLocator = By.xpath("//a [text() = 'Easy-rest']");


    By viewAllRL = By.xpath("//span [text()='View all']");
    By beerRl = By.xpath ("//span [text()='beer']");
    By kebabRl = By.xpath ("//span [text()='kebab']");
    By vegetarianRl = By.xpath ("//span [text()='vegetarian']");
    By sushiRl = By.xpath ("//span [text()='sushi']");
    By fastFoodRl = By.xpath ("//span [text()='fast food']");
    By pubRl = By.xpath ("//span [text()='pub']");
    By cuisineUARl = By.xpath ("//span [text()='ukrainian cuisine']");
    By burgersRl = By.xpath ("//span [text()='burgers']");
    By cuisineJPRl = By.xpath ("//span [text()='japanese cuisine']");
    By greelRl = By.xpath ("//span [text()='greel']");
    By pizzaRl = By.xpath ("//span [text()='pizza']");
    By rlArrowRl =  By.xpath ("//*[@class ='MuiSvgIcon-root-583']");
    By watchMenuLocator = By.xpath("//span [text() = 'Watch Menu']");
    By watchDetails = By.xpath("//span [text() = 'details']");


    // By WatchMenuJohnson = By.xpath("//span [text() = 'Watch Menu']/parent::a[@href = '/restaurant/2/menu/3']");
   // By WatchMenuBallLogan = By.xpath("//span [text() = 'Watch Menu']/parent::a[@href = '/restaurant/5/menu/9']");
   // By WatchMenuPreston = By.xpath("//span [text() = 'Watch Menu']/parent::a[@href = '/restaurant/8/menu/15']");

   // By WatchDetailsJohnson = By.xpath("//span [text() = 'details']/parent::a[@href= '/restaurants/2']");
   // By WatchDetailsBallLogan = By.xpath("//span [text() = 'details']/parent::a[@href= '/restaurants/5']");
  //  By WatchDetailsPreston = By.xpath("//span [text() = 'details']/parent::a[@href= '/restaurants/8']");



}
