package com.easyrest.components;

import com.easyrest.pages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Header {
    private final By logo = By.xpath("//a[text()='Easy-rest']");
    private final By homeButton = By.xpath("//a[@aria-current='page']");
    private final By restaurantListButton = By.xpath("//header[contains(@class,'MuiAppBar-root')]/div/nav/a[2]");
    private final By userProfileIcon = By.xpath("//button[@aria-haspopup='true']//child::div");

    protected WebDriver driver;
    public Header(WebDriver driver) { this.driver = driver; }

    public UserRoleMenuPanel clickOnUserProfileIcon(){
        driver.findElement(userProfileIcon).click();
        return new UserRoleMenuPanel(driver);
    }

    public void clickOnRestaurantList(){
        driver.findElement(restaurantListButton).click();
    }

    public void clickOnHome(){
        driver.findElement(homeButton).click();
    }

    public void clickOnLogo(){
        driver.findElement(logo).click();
    }

}
