package com.easyrest.components.admin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

/**
 * This class is page component of Admin Panel that contains table with information about client and contains method
 * to make action on client - ban client or make him active.
 * Client - any type of user role (owner or administrator or admin or waiter or moderator or user).
 */

public class ActionOnUser {
    private WebDriver driver;

    private final By allButton = By.xpath("//span[contains(text(),'All')]");
    private final By activeButton = By.xpath("//span[contains(text(),'Active')]");
    private final By bannedButton = By.xpath("//span[contains(text(),'Banned')]");
    private final By actionButton = By.cssSelector("td:nth-child(6)");
    private final By usersName = By.cssSelector("th:nth-child(1)");

    public ActionOnUser(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAllButton(){
        driver.findElement(allButton).click();
    }

    public void clickActiveButton(){
        driver.findElement(activeButton).click();
    }

    public void clickBannedButton(){ driver.findElement(bannedButton).click(); }

    public String getFirstNameFromClient() {
        List<WebElement> clientList = driver.findElements(usersName);
        WebElement firstNameFromList = clientList.get(0);
        return firstNameFromList.getText();
    }

    private void makeActionOnFirstClient() {
        List<WebElement> userList = driver.findElements(actionButton);
        if(userList.size() != 0) {
            userList.get(0).click();
        } else {
            throw new IndexOutOfBoundsException("There is no one user in list.");
        }
    }

    public ActionOnUser clickToMakeFirstClientActive(){
        clickBannedButton();
        makeActionOnFirstClient();
        return this;
    }

    public ActionOnUser clickToBanFirstClient(){
        clickActiveButton();
        makeActionOnFirstClient();
        return this;
    }

    private boolean findUserInListAfterAction(String name){
        List<WebElement> usersNames = driver.findElements(usersName);
        for (WebElement item : usersNames) {
            if(item.getText() == name){
                return true;
            }
        }
        return false;
    }

    public boolean checkIfClientMovedToBannedList(String name) {
        clickBannedButton();
        return findUserInListAfterAction(name);
    }

    public boolean checkIfClientMovedToActiveList(String name) {
        clickActiveButton();
        return findUserInListAfterAction(name);
    }

}
