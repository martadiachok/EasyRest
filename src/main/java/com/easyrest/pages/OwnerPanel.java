package com.easyrest.pages;

import org.openqa.selenium.By;

public class OwnerPanel {
    By personalInfo = By.xpath("//span[text()='Personal Info']");
    By currentOrderLocator = By.xpath("//span[text()='Current Orders']");
    By orderHistoryLocator = By.xpath("//span[text()='Order History']");
    By myrestaurantsLocator = By.xpath("//span[text()='My Restaurants']");

    By addRestaurant = By.xpath("//button [@title ='Add restaurant']");
    By functionOfRestaurant = By.xpath("//* [@class = 'MuiSvgIcon-root-237']/../../../div");
    By archiveRest = By.xpath("//span [text() = 'Archive']");
    By unarchiveRest = By.xpath("//span [text() = 'Unarchive']");
    By manageRest = By.xpath("//span [text() = 'Manage']");
    By editInfoRest = By.xpath("//button [@title = 'Edit Information']");
    By updateInfoRest = By.xpath("//span [text() = 'Update']");

    By menuesOwnerPanel = By.xpath("//span [text() = 'Menues']");
    By createMenu = By.xpath("//span [text() = 'Create menu']");
    By menuName = By.xpath("//input [@name = 'menuName']");
    //Find first element 'Next' (Create Metod)
    By next = By.xpath("//span [text() = 'Next']");
    By typeMenu = By.xpath("//input [@value = 'list']");
    By addPhotoDish = By.xpath("//label [@for='add-item']");
    By nameDish = By.xpath("//textarea[@name ='name']");
    By descriptionDish = By.xpath("//textarea[@name ='description']");
    By ingredientsDish = By.xpath("//textarea[@name ='ingredients']");
    By valueDish = By.xpath("//input[@name ='amount']");
    By praceDish = By.xpath("//input[@name ='price']");
    By categoryDish = By.xpath("//select [@name ='category']");
    By soupCategory = By.xpath("//option [@value ='1']");
    By coctailsCategory = By.xpath("//option [@value ='2']");
    By salatsCategory = By.xpath("//option [@value ='3']");
    By withBeerCategory = By.xpath("//option [@value ='4']");
    By hotCategory = By.xpath("//option [@value ='5']");
    By pizzaCategory = By.xpath("//option [@value ='6']");
    By meatCategory = By.xpath("//option [@value ='7']");
    By pastaCategory = By.xpath("//option [@value ='8']");
    By bakeryCategory = By.xpath("//option [@value ='9']");
    By hardLiquerCategory = By.xpath("//option [@value ='10']");
    By finishCreateMenu = By.xpath("//span[text()='Finish']");

    By waitersOwnerPanel = By.xpath("//span[text()='Waiters']");
    By addWaiter = By.xpath("//button[@title='Add Waiter']");

    By nameField = By.xpath("//input[@name='name']");
    By mailField = By.xpath("//input[@name='email']");
    By passwordField = By.xpath("//input[@name='password']");
    By phoneField = By.xpath("//input[@name='phone_number']");
    By restaurantAddress = By.xpath("//input[@name='address']");
    By restaurantPhoneField = By.xpath("//input[@name='phone']");
    By restaurantPreviewTextField = By.xpath("//textarea[@name='description']");
    By restaurantTags = By.xpath("//label [@for='tags']");
    By beerTagRest = By.xpath("//li [@data-value = 'beer']");
    By kebabTagRest =By.xpath("//li [@data-value = 'kebab']");
    By pizzaTagRest =By.xpath("//li [@data-value = 'pizza']");
    By cuisineTRTagRest =By.xpath("//li [@data-value = 'turkish cuisine']");
    By vegetarianTagRest =By.xpath("//li [@data-value = 'vegetarian']");
    By sushiTagRest =By.xpath("//li [@data-value = 'sushi']");
    By fastFoodTagRest =By.xpath("//li [@data-value = 'fast food']");
    By pubTagRest =By.xpath("//li [@data-value = 'pub']");
    By cuisineUATagRest =By.xpath("//li [@data-value = 'ukrainian cuisine']");
    By burgersTagRest =By.xpath("//li [@data-value = 'burgers']");
    By cuisineJPTagRest =By.xpath("//li [@data-value = 'japanese cuisine']");
    By greelTagRest =By.xpath("//li [@data-value = 'greel']");
    By coffeTeaTagRest =By.xpath("//li [@data-value = 'coffe/tea']");
    By restaurantDescriptionField = By.xpath("//label [text()='Restaurant Description']");


    By add = By.xpath("//span[text()='Add']");
    //delete waiter посмотреть как можно сделать по другому или же писать метод на выбор одного из вариантов
    By deleteWaiter = By.xpath("//*[@viewBox='0 0 24 24' and @class = 'MuiSvgIcon-root-148 MuiSvgIcon-fontSizeSmall-155']");
    By administratorsOwnerPanel = By.xpath("//span[text() = 'Administrators']");
    By addAdministrator = By.xpath("//button[@title = 'Add Administrator']");
    By deleteAdministrator = By.xpath("//*[@viewBox='0 0 24 24' and @class = 'MuiSvgIcon-root-148 MuiSvgIcon-fontSizeSmall-155']");




}
