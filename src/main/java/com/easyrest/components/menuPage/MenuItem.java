package com.easyrest.components.menuPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuItem {

    private final By addProduct = By.xpath("//button[@aria-label = 'Add to cart']");


    protected WebDriver driver;

    public MenuItem(WebDriver driver) {
        this.driver = driver;
    }

    public MenuItem addProduct() {
        List<WebElement> elements = driver.findElements(addProduct);
        if (elements.size() > 0) {
            WebElement addition = elements.get(0);
            addition.click();
        }
        return new MenuItem(driver);
    }

}
