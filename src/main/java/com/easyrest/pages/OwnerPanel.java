package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OwnerPanel extends BasePage {

    public OwnerPanel(WebDriver driver) {super(driver);}

    By personalInfoMenuButton = By.xpath("//div [contains (@class, 'UserMenu-avatar')]");
    By currentOrderMenuButton = By.xpath("//span[text()='Current Orders']");
    By orderHistoryMenuButton = By.xpath("//span[text()='Order History']");
    By myRestaurantsMenuButton = By.xpath("//span[text()='My Restaurants']");

    By addRestaurantButton = By.xpath("//button [@title ='Add restaurant']");
    By optionsOfRestaurantButton = By.xpath("//button [@aria-label='More']");
    By archiveRestMenuItem = By.xpath("//span [text() = 'Archive']");
    By unarchiveRestMenuItem = By.xpath("//span [text() = 'Unarchive']");
    By manageRestMenuItem = By.xpath("//span [text() = 'Manage']");
    By editInfoRestButton = By.xpath("//button [@title = 'Edit Information']");
    By updateInfoRestButton = By.xpath("//span [text() = 'Update']");

    By menuesMenuButton = By.xpath("//span [text() = 'Menues']");


    By waitersMenuButton = By.xpath("//span[text()='Waiters']");
    By addWaiterButton = By.xpath("//button[@title='Add Waiter']");

    By nameField = By.xpath("//input[@name='name']");
    By mailField = By.xpath("//input[@name='email']");
    By passwordField = By.xpath("//input[@name='password']");
    By phoneField = By.xpath("//input[@name='phone_number']");
    By restaurantAddressField = By.xpath("//input[@name='address']");
    By restaurantPhoneField = By.xpath("//input[@name='phone']");
    By restaurantPreviewTextField = By.xpath("//textarea[@name='description']");

    By restaurantTagsMenu = By.xpath("//label [@for='tags']");
    By beerRestTag = By.xpath("//li [@data-value = 'beer']");
    By kebabRestTag =By.xpath("//li [@data-value = 'kebab']");
    By pizzaRestTag =By.xpath("//li [@data-value = 'pizza']");
    By cuisineTRRestTag =By.xpath("//li [@data-value = 'turkish cuisine']");
    By vegetarianRestTag =By.xpath("//li [@data-value = 'vegetarian']");
    By sushiRestTag =By.xpath("//li [@data-value = 'sushi']");
    By fastFoodRestTag =By.xpath("//li [@data-value = 'fast food']");
    By pubRestTag =By.xpath("//li [@data-value = 'pub']");
    By cuisineUARestTag =By.xpath("//li [@data-value = 'ukrainian cuisine']");
    By burgersRestTag =By.xpath("//li [@data-value = 'burgers']");
    By cuisineJPRestTag =By.xpath("//li [@data-value = 'japanese cuisine']");
    By greelRestTag =By.xpath("//li [@data-value = 'greel']");
    By coffeTeaRestTag =By.xpath("//li [@data-value = 'coffe/tea']");

    By restaurantDescriptionField = By.xpath("//label [text()='Restaurant Description']");
    By addButton = By.xpath("//span[text()='Add']");


    By deleteWaiterButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");
    By administratorsMenuButton = By.xpath("//span[text() = 'Administrators']");
    By addAdministratorButton = By.xpath("//button[@title = 'Add Administrator']");
    By deleteAdministratorButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");


    public OwnerPanel clickOnMenuItemUser(){

        driver.findElement(personalInfoMenuButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuButtonCurrentOrder(){

        driver.findElement(currentOrderMenuButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuButtonOrderHistory(){

        driver.findElement(orderHistoryMenuButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuButtonMyRestaurants(){

        driver.findElement(myRestaurantsMenuButton).click();
        return new OwnerPanel(driver);
    }



    public OwnerPanel clickOnButtonAddRestaurant(){

        driver.findElement(addRestaurantButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonOptionOfRestaurants(){

        driver.findElement(optionsOfRestaurantButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuItemArchiveRest(){

        driver.findElement(archiveRestMenuItem).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuItemUnarchiveRest(){

        driver.findElement(unarchiveRestMenuItem).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnMenuItemManageRest(){

        driver.findElement(manageRestMenuItem).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonEditInfoRest(){

        driver.findElement(editInfoRestButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonUpdateInfoRest(){

        driver.findElement(updateInfoRestButton).click();
        return new OwnerPanel(driver);
    }



    public OwnerPanel clickOnMenuButtonMenues(){

        driver.findElement(menuesMenuButton).click();
        return new OwnerPanel(driver);
    }





    public OwnerPanel clickOnButtonWaitersMenu(){

        driver.findElement(waitersMenuButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonAddWaiter(){

        driver.findElement(addWaiterButton).click();
        return new OwnerPanel(driver);
    }



    public OwnerPanel sendToFieldName(){

        driver.findElement(nameField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldMail(){

        driver.findElement(mailField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldPassword(){

        driver.findElement(passwordField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldPhone(){

        driver.findElement(phoneField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldRestaurantAddress(){

        driver.findElement(restaurantAddressField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldRestaurantPhone(){

        driver.findElement(restaurantPhoneField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel sendToFieldRestaurantPreviewText(){

        driver.findElement(restaurantPreviewTextField).sendKeys();
        return new OwnerPanel(driver);
    }



    public OwnerPanel clickOnTagsMenuRestaurant(){

        driver.findElement(restaurantTagsMenu).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnRestTagBeer(){

        driver.findElement(beerRestTag).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnRestTagKebab(){

        driver.findElement(kebabRestTag).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnRestTagPizza(){

        driver.findElement(pizzaRestTag).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnRestTagCuisineTR(){

        driver.findElement(cuisineTRRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagVegetarian(){

        driver.findElement(vegetarianRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagSushi(){

        driver.findElement(sushiRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagFastFood(){

        driver.findElement(fastFoodRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagPub(){

        driver.findElement(pubRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagCuisineUA(){

        driver.findElement(cuisineUARestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagBurgers(){

        driver.findElement(burgersRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagCuisineJP(){

        driver.findElement(cuisineJPRestTag).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagGreel(){

        driver.findElement(greelRestTag ).click();
        return new OwnerPanel(driver);
    }public OwnerPanel clickOnRestTagCoffeTea(){

        driver.findElement(coffeTeaRestTag).click();
        return new OwnerPanel(driver);
    }



    public OwnerPanel sendToFieldRestaurantDescription(){

        driver.findElement(restaurantDescriptionField).sendKeys();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonAdd(){

        driver.findElement(addButton).click();
        return new OwnerPanel(driver);
    }


    public OwnerPanel clickOnButtonDeleteWaiter() {

        driver.findElement(deleteWaiterButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonAdministratorMenu(){

        driver.findElement(administratorsMenuButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonAddAdministrator(){

        driver.findElement(addAdministratorButton).click();
        return new OwnerPanel(driver);
    }
    public OwnerPanel clickOnButtonDeleteAdministrator(){

        driver.findElement(deleteAdministratorButton).click();
        return new OwnerPanel(driver);
    }

    }
