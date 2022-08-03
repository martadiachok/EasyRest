package com.easyrest.components.moderator;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LeftSideMenu {

    private final By restaurantsMenuButton = By.xpath("// span [contains (text(), 'Restaurants')]/parent::div");
    private final By usersMenuButton = By.xpath("//span [text() = 'Users']");
    private final By ownersMenuButton = By.xpath("//span [text() = 'Owners']");
    protected WebDriver driver;

    public LeftSideMenu(WebDriver driver) {
        this.driver = driver;
    }

    public LeftSideMenu clickOnMenuButtonRestaurants() {
        driver.findElement(restaurantsMenuButton).click();
        return new LeftSideMenu(driver);
    }

    public LeftSideMenu clickOnMenuButtonUsers() {

        driver.findElement(usersMenuButton).click();
        return new LeftSideMenu(driver);
    }

    public LeftSideMenu clickOnMenuButtonOwners() {

        driver.findElement(ownersMenuButton).click();
        return new LeftSideMenu(driver);
    }
}
