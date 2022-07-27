package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;
import com.easyrest.components.Calendar;

public class AdminPanel extends BasePage {

    public AdminPanel(WebDriver driver) {
        super(driver);
    }
    
    private By usersButton = By.xpath("//span[text()='Users']");
    private By ownersButton = By.xpath("//a[@href = '/admin/owners']");
    private By moderatorsButton = By.xpath("//a[@href = '/admin/moderators']");
    private By restaurantsButton = By.xpath("//a[@href = '/admin/restaurants']");
    private By allButton = By.xpath("//span[contains(text(),'All')]");
    private By activeButton = By.xpath("//span[contains(text(),'Active')]");
    private By bannedButton = By.xpath("//span[contains(text(),'Banned')]");
    private By actionButton = By.cssSelector("td:nth-child(6)");
    private By usersName = By.cssSelector("th:nth-child(1)");
    private By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    /**
     *  "CREATE MODERATOR ACCOUNT" FORM LOCATORS
     */
    private By nameField = By.xpath("//input[@name='name']");
    private By emailField = By.xpath("//input[@name='email']");
    private By phoneNumberField = By.xpath("//input[@name='phoneNumber']");
    private By birthDateField = By.xpath("//input[@name='birthDate']");
    private By passwordField = By.xpath("//input[@name='password']");
    private By confirmPasswordField = By.xpath("//input[@name='repeated_password']");
    private By createAccountButton = By.xpath("//span[text()='Create account']");
    private By cancelButton = By.xpath("//span[text()='Cancel']");

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

    public void clickBannedButton(){
        driver.findElement(bannedButton).click();
    }

    public String getFirstNameFromClient() {
        List<WebElement> clientList = driver.findElements(usersName);
        WebElement firstNameFromList = clientList.get(0);
        return firstNameFromList.getText();
    }

    public AdminPanel clickToMakeFirstClientActive(){
        clickBannedButton();
        List<WebElement> userList = driver.findElements(actionButton);
        if(userList.size() != 0) {
            userList.get(0).click();
        } else {
            System.out.println("There is no one banned users.");
        }
        return this;
    }

    public AdminPanel clickToBanFirstClient(){
        clickActiveButton();
        List<WebElement> userList = driver.findElements(actionButton);
        if(userList.size() != 0) {
            userList.get(0).click();
        } else {
            System.out.println("There is no one active users.");
        }
        return this;
    }

    public boolean checkIfClientMovedToBannedList(String name) {
        clickBannedButton();
        List<WebElement> bannedUsersName = driver.findElements(usersName);
        for (WebElement item : bannedUsersName) {
            if(item.getText() == name){
                return true;
            }
        }
        return false;
    }

    public boolean checkIfClientMovedToActiveList(String name) {
        clickActiveButton();
        List<WebElement> activeUsersName = driver.findElements(usersName);
        for (WebElement item : activeUsersName) {
            if(item.getText() == name){
                return true;
            }
        }
        return false;
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
     *  Methods to fill form "CREATE MODERATOR ACCOUNT"
     */
    public AdminPanel inputName (String name) {
        driver.findElement(nameField).sendKeys(name);
        return this;
    }

    public AdminPanel inputEmail (String email) {
        driver.findElement(emailField).sendKeys(email);
        return this;
    }

    public AdminPanel inputPhone(String phoneNumber) {
        driver.findElement(phoneNumberField).sendKeys(phoneNumber);
        return this;
    }

    public AdminPanel inputPassword (String password) {
        driver.findElement(passwordField).sendKeys(password);
        driver.findElement(confirmPasswordField).sendKeys(password);
        return this;
    }

    public Calendar clickOnBirthdayField() {
        driver.findElement(birthDateField).click();
        return new Calendar(driver);
    }

    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void clickCancelButton() {
        driver.findElement(cancelButton).click();
    }

    /**
     * Methods to deal with restaurants
     */

    public AdminPanel clickRestaurants(){
        driver.findElement(restaurantsButton).click();
        return this;
    }

}
