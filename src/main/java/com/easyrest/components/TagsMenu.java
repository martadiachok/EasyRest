package com.easyrest.components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class TagsMenu {
    private WebDriver driver;

    private final By restaurantTagsMenu = By.xpath("//label [@for='tags']");
    private final By beerTag = By.xpath("//li [@data-value = 'beer']");
    private final By kebabTag = By.xpath("//li [@data-value = 'kebab']");
    private final By pizzaTag = By.xpath("//li [@data-value = 'pizza']");
    private final By cuisineTurkishTag = By.xpath("//li [@data-value = 'turkish cuisine']");
    private final By vegetarianTag = By.xpath("//li [@data-value = 'vegetarian']");
    private final By sushiTag = By.xpath("//li [@data-value = 'sushi']");
    private final By fastFoodTag = By.xpath("//li [@data-value = 'fast food']");
    private final By pubTag = By.xpath("//li [@data-value = 'pub']");
    private final By cuisineUkrainianTag = By.xpath("//li [@data-value = 'ukrainian cuisine']");
    private final By burgersTag = By.xpath("//li [@data-value = 'burgers']");
    private final By cuisineJapaneseTag = By.xpath("//li [@data-value = 'japanese cuisine']");
    private final By greelTag = By.xpath("//li [@data-value = 'greel']");
    private final By coffeTeaTag = By.xpath("//li [@data-value = 'coffe/tea']");

    public TagsMenu(WebDriver driver) {
        this.driver = driver;
    }

    public void clickOnTagBeer() {
        driver.findElement(beerTag).click();
    }

    public void clickOnTagKebab() {
        driver.findElement(kebabTag).click();
    }

    public void clickOnTagPizza() {
        driver.findElement(pizzaTag).click();
    }

    public void clickOnTagCuisineTurkish() {
        driver.findElement(cuisineTurkishTag).click();
    }

    public void clickOnTagVegetarian() {
        driver.findElement(vegetarianTag).click();
    }

    public void clickOnTagSushi() {
        driver.findElement(sushiTag).click();
    }

    public void clickOnTagFastFood() {
        driver.findElement(fastFoodTag).click();
    }

    public void clickOnTagPub() {
        driver.findElement(pubTag).click();
    }

    public void clickOnTagCuisineUkrainian() {
        driver.findElement(cuisineUkrainianTag).click();
    }

    public void clickOnTagBurgers() {
        driver.findElement(burgersTag).click();
    }

    public void clickOnTagCuisineJapanese() {
        driver.findElement(cuisineJapaneseTag).click();
    }

    public void clickOnTagGreel() {
        driver.findElement(greelTag).click();
    }

    public void clickOnTagCoffeTea() {
        driver.findElement(coffeTeaTag).click();
    }
}
