package com.easyrest.components.menuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

    private final By submitOrder = By.xpath("//*[text()='Submit order']");
    private final By showCartButton = By.xpath("//button [@aria-label = 'Show cart']");
    private final By deleteSecondItemButton = By.xpath("//div[contains(@class , 'MuiPaper-root')][2]//div[contains(@style ,'' )]//button [@aria-label ='Remove item']");

    protected WebDriver driver;

    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public Cart submitOrder() {
        driver.findElement(submitOrder).click();
        return this;
    }

    public Cart clickOnButtonShowCart() {
        driver.findElement(showCartButton).click();
        return this;
    }

    public Cart clickOnButtonDeleteSecondItem() {

        driver.findElement(deleteSecondItemButton).click();
        return this;
    }
}
