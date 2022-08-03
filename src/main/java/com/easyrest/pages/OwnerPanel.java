package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

public class OwnerPanel extends BasePage {


    private final By personalInfoMenuButton = By.xpath("//div [contains (@class, 'UserMenu-avatar')]");
    private final By currentOrderMenuButton = By.xpath("//span[text()='Current Orders']");
    private final By orderHistoryMenuButton = By.xpath("//span[text()='Order History']");
    private final By myRestaurantsMenuButton = By.xpath("//span[text()='My Restaurants']");

    private final By addRestaurantButton = By.xpath("//button [@title ='Add restaurant']");
    private final By optionsOfRestaurantButton = By.xpath("//button [@aria-label='More']");
    private final By archiveRestMenuItem = By.xpath("//span [text() = 'Archive']");
    private final By unarchiveRestMenuItem = By.xpath("//span [text() = 'Unarchive']");
    private final By manageRestMenuItem = By.xpath("//span [text() = 'Manage']");
    private final By editInfoRestButton = By.xpath("//button [@title = 'Edit Information']");
    private final By updateInfoRestButton = By.xpath("//span [text() = 'Update']");

    private final By menuesMenuButton = By.xpath("//span [text() = 'Menues']");

    private final By waitersMenuButton = By.xpath("//span[text()='Waiters']");
    private final By addWaiterButton = By.xpath("//button[@title='Add Waiter']");

    private final By nameField = By.xpath("//input[@name='name']");
    private final By mailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By phoneField = By.xpath("//input[@name='phone_number']");
    private final By restaurantAddressField = By.xpath("//input[@name='address']");
    private final By restaurantPhoneField = By.xpath("//input[@name='phone']");
    private final By restaurantPreviewTextField = By.xpath("//textarea[@name='description']");

    private final By restaurantTagsMenu = By.xpath("//label [@for='tags']");
    private final By beerRestTag = By.xpath("//li [@data-value = 'beer']");
    private final By kebabRestTag = By.xpath("//li [@data-value = 'kebab']");
    private final By pizzaRestTag = By.xpath("//li [@data-value = 'pizza']");
    private final By cuisineTRRestTag = By.xpath("//li [@data-value = 'turkish cuisine']");
    private final By vegetarianRestTag = By.xpath("//li [@data-value = 'vegetarian']");
    private final By sushiRestTag = By.xpath("//li [@data-value = 'sushi']");
    private final By fastFoodRestTag = By.xpath("//li [@data-value = 'fast food']");
    private final By pubRestTag = By.xpath("//li [@data-value = 'pub']");
    private final By cuisineUARestTag = By.xpath("//li [@data-value = 'ukrainian cuisine']");
    private final By burgersRestTag = By.xpath("//li [@data-value = 'burgers']");
    private final By cuisineJPRestTag = By.xpath("//li [@data-value = 'japanese cuisine']");
    private final By greelRestTag = By.xpath("//li [@data-value = 'greel']");
    private final By coffeTeaRestTag = By.xpath("//li [@data-value = 'coffe/tea']");

    private final By restaurantDescriptionField = By.xpath("//label [text()='Restaurant Description']");
    private final By addButton = By.xpath("//span[text()='Add']");

    private final By deleteWaiterButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");
    private final By administratorsMenuButton = By.xpath("//span[text() = 'Administrators']");
    private final By addAdministratorButton = By.xpath("//button[@title = 'Add Administrator']");
    private final By deleteAdministratorButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");

    public OwnerPanel(WebDriver driver) {
        super(driver);
    }

    private OwnerPanel clearAndFillInput(By element, String text) {
        driver.findElement(element).clear();
        driver.findElement(element).sendKeys(text);
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuItemUser() {

        driver.findElement(personalInfoMenuButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuButtonCurrentOrder() {

        driver.findElement(currentOrderMenuButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuButtonOrderHistory() {

        driver.findElement(orderHistoryMenuButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuButtonMyRestaurants() {

        driver.findElement(myRestaurantsMenuButton).click();
        return new OwnerPanel(driver);
    }


    public OwnerPanel clickOnButtonAddRestaurant() {

        driver.findElement(addRestaurantButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonOptionOfRestaurants() {

        driver.findElement(optionsOfRestaurantButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuItemArchiveRest() {

        driver.findElement(archiveRestMenuItem).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuItemUnarchiveRest() {

        driver.findElement(unarchiveRestMenuItem).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnMenuItemManageRest() {

        driver.findElement(manageRestMenuItem).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonEditInfoRest() {

        driver.findElement(editInfoRestButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonUpdateInfoRest() {

        driver.findElement(updateInfoRestButton).click();
        return new OwnerPanel(driver);
    }


    public OwnerPanel clickOnMenuButtonMenues() {

        driver.findElement(menuesMenuButton).click();
        return new OwnerPanel(driver);
    }


    public OwnerPanel clickOnButtonWaitersMenu() {

        driver.findElement(waitersMenuButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonAddWaiter() {

        driver.findElement(addWaiterButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldName(String name) {
        clearAndFillInput(mailField, name);
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldMail(String email) {
        clearAndFillInput(mailField, email);
        return new OwnerPanel(driver);
    }


    public OwnerPanel sendToFieldPassword(String password) {
        clearAndFillInput(passwordField, password);
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldPhone(String phone) {
        clearAndFillInput(phoneField, phone);
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldRestaurantAddress(String addressRest) {
        clearAndFillInput(restaurantAddressField, addressRest);
        return new OwnerPanel(driver);
    }


    public OwnerPanel sendToFieldRestaurantPhone(String phoneRest) {
        clearAndFillInput(restaurantPhoneField, phoneRest);
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldRestaurantPreviewText(String previewText) {
        clearAndFillInput(restaurantPreviewTextField, previewText);
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnTagsMenuRestaurant() {

        driver.findElement(restaurantTagsMenu).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagBeer() {

        driver.findElement(beerRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagKebab() {

        driver.findElement(kebabRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagPizza() {

        driver.findElement(pizzaRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagCuisineTR() {

        driver.findElement(cuisineTRRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagVegetarian() {

        driver.findElement(vegetarianRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagSushi() {

        driver.findElement(sushiRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagFastFood() {

        driver.findElement(fastFoodRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagPub() {

        driver.findElement(pubRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagCuisineUA() {

        driver.findElement(cuisineUARestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagBurgers() {

        driver.findElement(burgersRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagCuisineJP() {

        driver.findElement(cuisineJPRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagGreel() {

        driver.findElement(greelRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnRestTagCoffeTea() {

        driver.findElement(coffeTeaRestTag).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel sendToFieldRestaurantDescription(String descriptionRest) {
        clearAndFillInput(restaurantDescriptionField, descriptionRest);
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonAdd() {

        driver.findElement(addButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonDeleteWaiter() {

        driver.findElement(deleteWaiterButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonAdministratorMenu() {

        driver.findElement(administratorsMenuButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonAddAdministrator() {

        driver.findElement(addAdministratorButton).click();
        return new OwnerPanel(driver);
    }

    public OwnerPanel clickOnButtonDeleteAdministrator() {

        driver.findElement(deleteAdministratorButton).click();
        return new OwnerPanel(driver);
    }
}
