package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WaiterPage extends BasePage {

    private final By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");

    private final By waiterPanel = By.xpath("//a[@role='menuitem']");
    private final By logOut = By.xpath("//li[@role='menuitem']");

    public WaiterPage(WebDriver driver) {
        super(driver);
    }

    public WaiterPage clickOnUserMenu() {
        driver.findElement(userMenu).click();
        return this;
    }

    public WaiterPage clickOnWaiterPanel() {
        driver.findElement(waiterPanel).click();
        return this;
    }

    public SignInPage clickOnLogOut() {
        driver.findElement(logOut).click();
        return new SignInPage(driver);
    }

}
