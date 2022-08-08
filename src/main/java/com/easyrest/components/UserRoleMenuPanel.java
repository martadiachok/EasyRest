package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.easyrest.components.Header;

public class UserRoleMenuPanel {
    protected WebDriver driver;

    private final By userPanelButton = By.xpath("//ul[@role='menu']//child::a");
    private final By logOutButton = By.xpath("//ul[@role='menu']//child::li");

    public UserRoleMenuPanel(WebDriver driver) { this.driver = driver; }

    public void clickOnTheFirstMenuItem() {
        driver.findElement(userPanelButton)
                .click();
    }

    public void clickOnLogOutMenuItem() {
        driver.findElement(logOutButton)
                .click();
    }

}
