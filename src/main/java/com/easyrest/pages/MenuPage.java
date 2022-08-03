package com.easyrest.pages;

import com.sun.jna.WString;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MenuPage extends BasePage {


    private final By watchMenu = By.xpath("//*[text() = 'Watch Menu']");
    private final By addProduct = By.xpath("//button[@aria-label = 'Add to cart']");
    private final By submitOrder = By.xpath("//*[text()='Submit order']");
    private final By submitInWindowButton = By.xpath("//*[text()='Submit']");
    private final By quantityItemField = By.xpath("//div[contains (@class ,'MuiDialogContent')]//tr[contains(@class,'MuiTableRow-root')][1]//input[@type = 'number' ]");
    private final By showCartButton = By.xpath("//button [@aria-label = 'Show cart']");
    private final By soupCategoryMenuItem = By.xpath("//span [text() ='Soup']");
    private final By coctailsCategoryMenuItem = By.xpath("//span [text() ='Coctails']");
    private final By salatsCategoryMenuItem = By.xpath("//span [text() ='Salats']");
    private final By withBeerCategoryMenuItem = By.xpath("//span [text() ='With beer']");
    private final By hotCategoryMenuItem = By.xpath("//span [text() ='Hot']");
    private final By pizzaCategoryMenuItem = By.xpath("//span [text() ='Pizza']");
    private final By meatCategoryMenuItem = By.xpath("//span [text() ='Meat']");
    private final By pastaCategoryMenuItem = By.xpath("//span [text() ='Pasta']");
    private final By bakeryCategoryMenuItem = By.xpath("//span [text() ='Bakery']");
    private final By hardLiquerCategoryMenuItem = By.xpath("//span [text() ='Hard liquer']");
    private final By deleteSecondItemButton = By.xpath("//div[contains(@class , 'MuiPaper-root')][2]//div[contains(@style ,'' )]//button [@aria-label ='Remove item']");

    public MenuPage(WebDriver driver) {
        super(driver);
    }

    public MenuPage openMenu() {
        List<WebElement> elements = driver.findElements(watchMenu);
        if (elements.size() > 0) {
            WebElement menu = elements.get(0);
            menu.click();
        }
        return new MenuPage(driver);
    }

    public MenuPage addProduct() {
        List<WebElement> elements = driver.findElements(addProduct);
        if (elements.size() > 0) {
            WebElement addition = elements.get(0);
            addition.click();
        }
        return new MenuPage(driver);
    }

    public MenuPage submitOrder() {
        driver.findElement(submitOrder).click();
        return new MenuPage(driver);
    }

    public MenuPage submitOrderInWindow() {
        driver.findElement(submitInWindowButton).click();
        return new MenuPage(driver);
    }

    public MenuPage sendToFieldQuantityItem(String quantity) {
        driver.findElement(quantityItemField).sendKeys(quantity);
        return new MenuPage(driver);
    }

    public MenuPage clickOnButtonShowCart() {
        driver.findElement(showCartButton).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemSoupCategory() {

        driver.findElement(soupCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemCoctailsCategory() {

        driver.findElement(coctailsCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemSalatsCategory() {

        driver.findElement(salatsCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemWithBeerCategory() {

        driver.findElement(withBeerCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemHotCategory() {

        driver.findElement(hotCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemPizzaCategory() {

        driver.findElement(pizzaCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemMeatCategory() {

        driver.findElement(meatCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemPastaCategory() {

        driver.findElement(pastaCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemBakeryCategory() {

        driver.findElement(bakeryCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnMenuItemHardLiquerCategory() {

        driver.findElement(hardLiquerCategoryMenuItem).click();
        return new MenuPage(driver);
    }

    public MenuPage clickOnButtonDeleteSecondItem() {

        driver.findElement(deleteSecondItemButton).click();
        return new MenuPage(driver);
    }

}
    