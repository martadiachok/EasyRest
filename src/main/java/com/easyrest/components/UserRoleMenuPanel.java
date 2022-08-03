package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.easyrest.components.Header;

public class UserRoleMenuPanel {
    protected WebDriver driver;

    private final By userPanelButton = By.xpath("//ul[@role='menu']//child::a");
    private final By logOutButton = By.xpath("//ul[@role='menu']//child::li");

    Header header = new Header(driver);

    public UserRoleMenuPanel(WebDriver driver) { this.driver = driver; }

    public void clickOnUserPanel() {
        header.clickOnUserProfileIcon();
        driver.findElement(userPanelButton)
                .click();
    }

    public void clickOnLogOut() {
        header.clickOnUserProfileIcon();
        driver.findElement(logOutButton)
                .click();
    }

}
