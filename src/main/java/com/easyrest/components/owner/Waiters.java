package com.easyrest.components.owner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Waiters {
    private WebDriver driver;

    private final By deleteWaiterButton = By.xpath("//li[contains (@class, 'MuiListItem-root')][1]//*[@viewBox='0 0 24 24']");
    private final By addWaiterButton = By.xpath("//button[@title='Add Waiter']");

    public Waiters(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnButtonDeleteWaiter() {
        driver.findElement(deleteWaiterButton).click();
    }

    public CreateNewEmployee clickOnButtonAddWaiter() {
        driver.findElement(addWaiterButton).click();
        return new CreateNewEmployee(driver);
    }
}
