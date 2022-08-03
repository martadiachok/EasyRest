package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Users extends BasePage {

    ActionOnUser actionOnUser = new ActionOnUser(driver);
    LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
    public Users(WebDriver driver) {
        super(driver);
    }

    public Users clickActiveUsers(){
        leftSideMenu.clickUsers();
        actionOnUser.clickActiveButton();
        return this;
    }

    public Users clickBannedUsers(){
        leftSideMenu.clickUsers();
        actionOnUser.clickBannedButton();
        return this;
    }

    public Users banUser(){
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToBanFirstClient();
        actionOnUser.checkIfClientMovedToBannedList(userName);
        return this;
    }

    public Users makeUserActive(){
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToMakeFirstClientActive();
        actionOnUser.checkIfClientMovedToActiveList(userName);
        return this;
    }
}
