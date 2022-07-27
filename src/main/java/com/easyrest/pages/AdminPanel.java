package com.easyrest.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class AdminPanel extends BasePage {

    public AdminPanel(WebDriver driver) {
        super(driver);
    }

    private By AdminPanelButton = By.xpath("//a[@href = '/admin']");
    private By LogOutButton = By.xpath("//*[text()='Log Out']");
    private By usersButton = By.xpath("//span[text()='Users']");
    private By ownersButton = By.xpath("//a[@href = '/admin/owners']");
    private By moderatorsButton = By.xpath("//a[@href = '/admin/moderators']");
    private By restaurantsButton = By.xpath("//a[@href = '/admin/restaurants']");
    private By allButton = By.xpath("//span[contains(text(),'All')]");
    private By activeButton = By.xpath("//span[contains(text(),'Active')]");
    private By bannedButton = By.xpath("//span[contains(text(),'Banned')]");
    private By actionButton = By.cssSelector("td:nth-child(6)");
    private By userName = By.cssSelector("th:nth-child(1)");
    private By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    // Login as an admin method ???

    /**
     * Methods to deal with users
     */
    public AdminPanel clickAllUsers(){
        driver.findElement(usersButton).click();
        driver.findElement(allButton).click();
        return this;
    }

    public AdminPanel clickActiveUsers(){
        driver.findElement(usersButton).click();
        driver.findElement(activeButton).click();
        return this;
    }

    public AdminPanel clickBannedUsers(){
        driver.findElement(usersButton).click();
        driver.findElement(bannedButton).click();
        return this;
    }

    public AdminPanel banFromActiveUser(){
        clickActiveUsers();
        List<WebElement> activeUsers = driver.findElements(actionButton);
        if(activeUsers.size() != 0) {
            activeUsers.get(0).click();
        } else {
            System.out.println("There is no one active users.");
        }
        return this;
    }

    public AdminPanel checkIfActiveUserMovedToBan() {
        clickActiveUsers();
        List<WebElement> activeUsersName = driver.findElements(userName);
        WebElement nameFromList = activeUsersName.get(0);
        String bannedUser = nameFromList.getText();
        clickBannedUsers();
        List<WebElement> BannedUsersName = driver.findElements(userName);
        for (WebElement BannedUsersNames : BannedUsersName) {
            if(BannedUsersNames.)
        }

        return this;
    }

    public AdminPanel removeBanFromBannedUser(){
        clickBannedUsers();
        List<WebElement> bannedUsers = driver.findElements(actionButton);
        if(bannedUsers.size() != 0) {
            bannedUsers.get(0).click();
        } else {
            System.out.println("There is no one banned users.");
        }
        return this;
    }

        /*
    public AdminPanel removeBan_checkActiveUserMovedToBan(){
        clickBannedUsers();
        List<WebElement> userName = driver.findElements(usersButton);
        List<WebElement> action = driver.findElements(actionButton);
        LinkedHashMap<List<WebElement>, List<WebElement>> bannedUsers = new LinkedHashMap<>();
        bannedUsers.put(userName, action);

        if(bannedUsers.isEmpty()) {
            System.out.println("There is no one banned users.");
        } else {
            action.get(0).click();
        }
        return this;
    } */

}
