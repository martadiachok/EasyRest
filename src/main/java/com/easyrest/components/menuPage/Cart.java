package com.easyrest.components.menuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Cart {

    private WebDriver driver;

    private final By submitOrder = By.xpath("//*[text()='Submit order']");
    private final By showCartButton = By.xpath("//button [@aria-label = 'Show cart']");


    public Cart(WebDriver driver) {
        this.driver = driver;
    }

    public OrderConfirmation submitOrder() {
        driver.findElement(submitOrder).click();
        return new OrderConfirmation(driver);
    }

    public Cart clickOnButtonShowCart() {
        driver.findElement(showCartButton).click();
        return this;
    }
}
