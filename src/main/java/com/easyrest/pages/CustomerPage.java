package com.easyrest.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;


public class CustomerPage extends BasePage {

    private final By accountButton = By.xpath("//button[@aria-haspopup='true']//child::div");
    //button from drop-down list in the account sign
    private final By myRestaurantsAccount = By.xpath("//ul[@role='menu']//child::a");
    private final By logOut = By.xpath("//ul[@role='menu']//child::li");

    //elements of the menu in the account
    private final By personalInfo = By.xpath("//span[text() = 'Personal Info']");
    private final By currentOrders = By.xpath("//span[text() = 'Current Orders']");
    private final By orderHistory = By.xpath("//span[text() = 'Order History']");
    private final By myRestaurants = By.xpath("//span[text() = 'My Restaurants']");


    private final By addRestaurantPlusButton = By.xpath("//*[@title = 'Add restaurant']");
    private final By restaurantNameField = By.xpath("//input[@name='name']");
    private final By restaurantAddressField = By.xpath("//input[@name='address']");
    private final By addButton = By.xpath("//*[text() = 'Add']");
    private final By cancel = By.xpath("//*[text() = 'Cancel']");

    private final By watchMenu = By.xpath("//*[text() = 'Watch Menu']");
    private final By addProduct = By.xpath("//button[@aria-label = 'Add to cart']");
    private final By submitOrder = By.xpath("//*[text()='Submit order']");
    private final By submitInWindowButton = By.xpath("//*[text()='Submit']");

    private final By waitingForConfirm = By.xpath("//a[@href = '/profile/current_orders/Waiting for confirm']");
    private final By accepted = By.xpath("//a[@href = '/profile/current_orders/Accepted']");
    private final By inProgress = By.xpath("//*[@href = '/profile/current_orders/In progress']");

    private final By orderDetailsForConfirm = By.xpath("//div[@role = 'button']");
    private final By decline = By.xpath("//*[text() =  'Decline']");


    public CustomerPage(WebDriver driver) {
        super(driver);
    }

    public CustomerPage seePersonalInfo(){
        driver.findElement(personalInfo).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeCurrentOrdersTab(){
        driver.findElement(currentOrders).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeOrderHistory(){
        driver.findElement(orderHistory).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeMyRestaurants(){
        driver.findElement(myRestaurants).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeWaitingForConfirmOrders(){
        driver.findElement(waitingForConfirm).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeAcceptedOrders(){
        driver.findElement(accepted).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeInProgressOrders(){
        driver.findElement(inProgress).click();
        return new CustomerPage(driver);
    }

    public CustomerPage seeOrderDetails(){
        List<WebElement> elements = driver.findElements(orderDetailsForConfirm);
        if(elements.size()>0){
            WebElement order = elements.get(1);
            order.click();
        }
        return new CustomerPage(driver);
    }

    public CustomerPage declineOrder(){
        driver.findElement(decline).click();
        return new CustomerPage(driver);
    }

    public CustomerPage clickAccountButton(){
        driver.findElement(accountButton).click();
        return new CustomerPage(driver);
    }

    public CustomerPage clickMyRestaurantsDropdown(){
        driver.findElement(myRestaurantsAccount).click();
        return new CustomerPage(driver);
    }

    public CustomerPage logOut(){
        driver.findElement(logOut).click();
        return new CustomerPage(driver);
    }

    public CustomerPage clickAddRestaurantPlusButton(){
        driver.findElement(addRestaurantPlusButton).click();
        return new CustomerPage(driver);
    }

    public CustomerPage enterRestaurantName(String name){
        driver.findElement(restaurantNameField).clear();
        driver.findElement(restaurantNameField).sendKeys(name);
        return this;
    }

    public CustomerPage enterRestaurantAddress(String address){
        driver.findElement(restaurantAddressField).clear();
        driver.findElement(restaurantAddressField).sendKeys(address);
        return this;
    }

    public CustomerPage approveRestaurantAdding(){
        driver.findElement(addButton).click();
        return new CustomerPage(driver);
    }

    public CustomerPage cancelRestaurantAdding(){
        driver.findElement(cancel).click();
        return new CustomerPage(driver);
    }


}
