package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AdministratorPage extends BasePage {

    private final By userMenu = By.xpath("//div[contains(@class,'UserMenu-root')]//button");

    private final By administratorPanel = By.xpath("//a[@role='menuitem']");
    private final By logOut = By.xpath("//li[@role='menuitem']");

    public AdministratorPage(WebDriver driver) {
        super(driver);
    }

    public AdministratorPage clickOnUserMenu() {
        driver.findElement(userMenu).click();
        return this;
    }

    public AdministratorPage clickOnAdministratorPanel() {
        driver.findElement(administratorPanel).click();
        return this;
    }

    public SignInPage clickOnLogOut() {
        driver.findElement(logOut).click();
        return new SignInPage(driver);
    }

}
