package com.easyrest.pages.moderatorPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Users extends BasePage {

    private ActionOnUser actionOnUser = new ActionOnUser(driver);
    private LeftSideMenu leftSideMenu = new LeftSideMenu(driver);

    public Users(WebDriver driver) {
        super(driver);
    }

    public Users clickActiveUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickActiveButton();
        return this;
    }

    public Users clickBannedUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickBannedButton();
        return this;
    }

    public Users banUser() {
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToBanFirstClient();
        actionOnUser.checkIfClientMovedToBannedList(userName);
        return this;
    }

    public Users makeUserActive() {
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToMakeFirstClientActive();
        actionOnUser.checkIfClientMovedToActiveList(userName);
        return this;
    }
}