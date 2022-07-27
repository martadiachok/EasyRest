package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserRoleMenuPanel {
    public UserRoleMenuPanel(WebDriver driver) {
        this.driver = driver;
    }

    protected WebDriver driver;

    private By userPanelButton = By.xpath("//ul[@role='menu']//child::a");
    private By logOutButton = By.xpath("//ul[@role='menu']//child::li");

    public void clickOnUserPanel() {
        driver.findElement(userPanelButton).click();
    }

    public void clickOnLogOut() {
        driver.findElement(logOutButton).click();
    }

}
