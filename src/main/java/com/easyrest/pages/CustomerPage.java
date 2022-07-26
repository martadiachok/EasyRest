package com.easyrest.pages;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class CustomerPage {
    WebDriver driver;

        By accountButton = By.xpath("//button[@aria-haspopup='true']//child::div");
        //button from drop-down list in the account sign
        By myRestaurantsAccount = By.xpath("//ul[@role='menu']//child::a");
        By logOut = By.xpath("//ul[@role='menu']//child::li");

        //elements of the menu in the account
        By personalInfo = By.xpath("//span[text() = 'Personal Info']");
        By currentOrders = By.xpath("//span[text() = 'Current Orders']");
        By orderHistory = By.xpath("//span[text() = 'Order History']");
        By myRestaurants = By.xpath("//span[text() = 'My Restaurants']");


        By addRestaurant = By.xpath("//*[@title = 'Add restaurant']");
        By restaurantNameField = By.xpath("//input[@name='name']");
        By restaurantAddressField = By.xpath("//input[@name='address']");
        By add = By.xpath("//*[text() = 'Add']");
        By cancel = By.xpath("//*[text() = 'Cancel']");

        By waitingForConfirm = By.xpath("//a[@href = '/profile/current_orders/Waiting for confirm']");
        By accepted = By.xpath("//a[@href = '/profile/current_orders/Accepted']");
        By inProgress = By.xpath("//*[@href = '/profile/current_orders/In progress']");

        By orderDetails = By.xpath("//div[@role = 'button']");
        By decline = By.xpath("//*[text() =  'Decline']");


}
