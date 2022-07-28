package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRoleMenuPanel {
    protected WebDriver driver;

    private final By userPanelButton = By.xpath("//ul[@role='menu']//child::a");
    private final By logOutButton = By.xpath("//ul[@role='menu']//child::li");
    private final By userProfileIcon = By.xpath("//button[@aria-haspopup='true']//child::div");

    public UserRoleMenuPanel(WebDriver driver) { this.driver = driver; }

    private UserRoleMenuPanel clickOnUserProfileIcon(){
        driver.findElement(userProfileIcon).click();
        return new UserRoleMenuPanel(driver);
    }

    public void clickOnUserPanel() {
        clickOnUserProfileIcon();
        driver.findElement(userPanelButton).click();
    }

    public void clickOnLogOut() {
        clickOnUserProfileIcon();
        driver.findElement(logOutButton).click();
    }

}
