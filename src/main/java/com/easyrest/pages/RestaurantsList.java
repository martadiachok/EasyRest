package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RestaurantsList extends BasePage {

    public RestaurantsList(WebDriver driver) {super(driver);}

    By restaurantsListMenuItem = By.xpath("//span [text()='Restaurants List']");
    By homeMenuItem = By.xpath("//span [text() = 'Home']");
    By easyRestMenuItem = By.xpath("//a [text() = 'Easy-rest']");
    By signInMenuItem = By.xpath("//span [text() = 'Sign In']");
    By signUpMenuItem = By.xpath("//span [text() = 'Sign Up']");


    By viewAllRlMenuItem = By.xpath("//span [text()='View all']");
    By beerRlMenuItem = By.xpath ("//span [text()='beer']");
    By kebabRlMenuItem = By.xpath ("//span [text()='kebab']");
    By vegetarianRlMenuItem = By.xpath ("//span [text()='vegetarian']");
    By sushiRlMenuItem = By.xpath ("//span [text()='sushi']");
    By fastFoodRlMenuItem = By.xpath ("//span [text()='fast food']");
    By pubRlMenuItem = By.xpath ("//span [text()='pub']");
    By cuisineUARlMenuItem = By.xpath ("//span [text()='ukrainian cuisine']");
    By burgersRlMenuItem = By.xpath ("//span [text()='burgers']");
    By cuisineJPRlMenuItem = By.xpath ("//span [text()='japanese cuisine']");
    By greelRlMenuItem = By.xpath ("//span [text()='greel']");
    By pizzaRlMenuItem = By.xpath ("//span [text()='pizza']");
    By rlArrowRlMenuItem =  By.xpath ("//*[@class ='MuiSvgIcon-root-583']");
    By watchMenuButton = By.xpath("//div [contains(@class ,'TagsTab-item' )][1]//span [text() = 'Watch Menu']");
    By DetailsButton = By.xpath("//div [contains(@class ,'TagsTab-item' )][1]//span [text() = 'details']");



    public RestaurantsList clickOnMenuItemRestaurantList(){

        driver.findElement(restaurantsListMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemHome(){

        driver.findElement(easyRestMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemEasyRest(){

        driver.findElement(homeMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemSignIn(){

        driver.findElement(signInMenuItem).click();
        return new SignInPage(driver);
    }
    public RestaurantsList clickOnMenuItemSignUp(){

        driver.findElement(signUpMenuItem).click();
        return new SignUpPage(driver);
    }

    public RestaurantsList clickOnMenuItemViewAll(){

        driver.findElement(viewAllRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemBeer(){

        driver.findElement(beerRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemKebab(){

        driver.findElement(kebabRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemVegetarian(){

        driver.findElement(vegetarianRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemSushi(){

        driver.findElement(sushiRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemFastFood(){

        driver.findElement(fastFoodRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemPub(){

        driver.findElement(pubRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemCuisineUA(){

        driver.findElement(cuisineUARlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemBurgers(){

        driver.findElement(burgersRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemCuisineJP(){

        driver.findElement(cuisineJPRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemGreel(){

        driver.findElement(greelRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemPizza(){

        driver.findElement(pizzaRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnMenuItemRLArrow(){

        driver.findElement(rlArrowRlMenuItem).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnButtonWatchMenu(){

        driver.findElement(watchMenuButton).click();
        return new RestaurantsList(driver);
    }
    public RestaurantsList clickOnButtonDetails(){

        driver.findElement(DetailsButton).click();
        return new RestaurantsList(driver);
    }
}
