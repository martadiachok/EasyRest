package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import com.easyrest.components.Calendar;

public class AdminPanel extends BasePage {
    
    private final By usersButton = By.xpath("//span[text()='Users']");
    private final By ownersButton = By.xpath("//a[@href = '/admin/owners']");
    private final By moderatorsButton = By.xpath("//a[@href = '/admin/moderators']");
    private final By restaurantsButton = By.xpath("//a[@href = '/admin/restaurants']");
    private final By allButton = By.xpath("//span[contains(text(),'All')]");
    private final By activeButton = By.xpath("//span[contains(text(),'Active')]");
    private final By bannedButton = By.xpath("//span[contains(text(),'Banned')]");
    private final By actionButton = By.cssSelector("td:nth-child(6)");
    private final By usersName = By.cssSelector("th:nth-child(1)");
    private final By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    public AdminPanel(WebDriver driver) {
        super(driver);
    }

    /**
     * General methods to deal with all type of users.
     * Client - any type of user role (owner or administrator or admin or waiter or moderator or user).
     */
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

    public AdminPanel clickToMakeFirstClientActive(){
        clickBannedButton();
        makeActionOnFirstClient();
        return this;
    }

    public AdminPanel clickToBanFirstClient(){
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

    /**
     * Methods to deal with users
     */
    public AdminPanel clickUsers(){
        driver.findElement(usersButton).click();
        return this;
    }

    public AdminPanel clickActiveUsers(){
        clickUsers();
        clickActiveButton();
        return this;
    }

    public AdminPanel clickBannedUsers(){
        clickUsers();
        clickBannedButton();
        return this;
    }

    public AdminPanel banUser(){
        clickActiveUsers();
        String userName = getFirstNameFromClient();
        clickToBanFirstClient();
        checkIfClientMovedToBannedList(userName);
        return this;
    }

    public AdminPanel makeUserActive(){
        clickBannedUsers();
        String userName = getFirstNameFromClient();
        clickToMakeFirstClientActive();
        checkIfClientMovedToActiveList(userName);
        return this;
    }

    /**
     * Methods to deal with owners
     */
    public AdminPanel clickOwners(){
        driver.findElement(ownersButton).click();
        return this;
    }

    public AdminPanel clickActiveOwners(){
        clickOwners();
        clickActiveButton();
        return this;
    }

    public AdminPanel clickBannedOwners() {
        clickOwners();
        clickBannedButton();
        return this;
    }

    public AdminPanel banOwners(){
        clickActiveOwners();
        String userName = getFirstNameFromClient();
        clickToBanFirstClient();
        checkIfClientMovedToBannedList(userName);
        return this;
    }

    public AdminPanel makeOwnersActive(){
        clickBannedOwners();
        String userName = getFirstNameFromClient();
        clickToMakeFirstClientActive();
        checkIfClientMovedToActiveList(userName);
        return this;
    }

    /**
     * Methods to deal with moderators
     */
    public AdminPanel clickModerators(){
        driver.findElement(moderatorsButton).click();
        return this;
    }

    public AdminPanel clickActiveModerators(){
        clickModerators();
        clickActiveButton();
        return this;
    }

    public AdminPanel clickBannedModerators(){
        clickModerators();
        clickBannedButton();
        return this;
    }

    public AdminPanel banModerator(){
        clickActiveModerators();
        String userName = getFirstNameFromClient();
        clickToBanFirstClient();
        checkIfClientMovedToBannedList(userName);
        return this;
    }

    public AdminPanel makeModeratorActive(){
        clickBannedModerators();
        String userName = getFirstNameFromClient();
        clickToMakeFirstClientActive();
        checkIfClientMovedToActiveList(userName);
        return this;
    }

    public AdminPanel clickAddModeratorButton(){
        clickModerators();
        driver.findElement(addModeratorButton).click();
        return this;
    }

    /**
     * Methods to deal with restaurants
     */

    public AdminPanel clickRestaurants(){
        driver.findElement(restaurantsButton).click();
        return this;
    }

}
