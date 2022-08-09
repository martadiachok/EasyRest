package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class ActionOnUserFacade {
    private WebDriver driver;

    private LeftSideMenu leftSideMenu;
    private ActionOnUser actionOnUser;

    public ActionOnUserFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnUser = new ActionOnUser(driver);

        this.driver = driver;
    }

    private void clickActiveUsers() {
        leftSideMenu.clickUsers();
        actionOnUser.clickActiveButton();
    }

    private void clickBannedUsers() {
        leftSideMenu.clickUsers();
        actionOnUser.clickBannedButton();
    }

    public boolean banUser() {
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToBanFirstClient();
        boolean isBanned = actionOnUser.checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeUserActive() {
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToMakeFirstClientActive();
        boolean isActive = actionOnUser.checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
