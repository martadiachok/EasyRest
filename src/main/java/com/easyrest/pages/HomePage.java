package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    public WebDriver driver;

    By home = By.xpath("//*[text() = 'Home']");
    By viewAll = By.xpath("//*[text() =  'View All']");
    By pub = By.xpath("//*[@href =  '/restaurants?tag=pub']");
    By fastFood = By.xpath("//*[@href =  '/restaurants?tag=fast food']");
    By vegeterian = By.xpath("//*[@href =  '/restaurants?tag=vegetarian']");
    By pizza = By.xpath("//*[@href =  '/restaurants?tag=pizza']");
    By sushi = By.xpath("//*[@href =  '/restaurants?tag=sushi']");
    By greel = By.xpath("//*[@href =  '/restaurants?tag=greel']");
    By burgers = By.xpath("//*[@href =  '/restaurants?tag=burgers']");
    By kebab = By.xpath("//*[@href =  '/restaurants?tag=kebab']");
    By japaneseCuisine = By.xpath("//*[@href =  '/restaurants?tag=japanese cuisine']");
    By beer = By.xpath("//*[@href =  '/restaurants?tag=beer']");
    By ukrainianCuisine = By.xpath("//*[@href =  '/restaurants?tag=ukrainian cuisine']");
    By turkishCuisine = By.xpath("//*[@href =  '/restaurants?tag=turkish cuisine']");

    By restaurantsList = By.xpath("//*[@href =  '/restaurants']");

}
