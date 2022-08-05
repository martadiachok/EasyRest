package com.easyrest.pages;

import com.easyrest.components.AddRestaurant;
import com.easyrest.components.customer.Right_sideMenu;
import com.easyrest.pages.customerPanel.CurrentOrders;
import com.easyrest.pages.customerPanel.MyRestaurants;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class CustomerPage extends BasePage {

    private Right_sideMenu right_sideMenu;
    private MyRestaurants myRestaurants;
    private CurrentOrders currentOrders;
    private AddRestaurant addRestaurant;



    private final By accountButton = By.xpath("//button[@aria-haspopup='true']//child::div");
    //button from drop-down list in the account sign
    private final By myRestaurantsAccount = By.xpath("//ul[@role='menu']//child::a");
    private final By logOut = By.xpath("//ul[@role='menu']//child::li");

    public CustomerPage(WebDriver driver) {
        super(driver);
        addRestaurant = new AddRestaurant(driver);
        right_sideMenu = new Right_sideMenu(driver);
        myRestaurants = new MyRestaurants(driver);
        currentOrders = new CurrentOrders(driver);

    }

    public CustomerPage clickAccountButton() {
        driver.findElement(accountButton).click();
        return new CustomerPage(driver);
    }

    public CustomerPage clickMyRestaurantsDropdown() {
        driver.findElement(myRestaurantsAccount).click();
        return new CustomerPage(driver);
    }


    public SignInPage logOut() {
        driver.findElement(logOut).click();
        return new SignInPage(driver);
    }

}

