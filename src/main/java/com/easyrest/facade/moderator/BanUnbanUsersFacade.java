package com.easyrest.facade.moderator;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.moderator.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class BanUnbanUsersFacade {
    private LeftSideMenu leftSideMenu;
    private ActionOnUser actionOnUser;

    public BanUnbanUsersFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnUser = new ActionOnUser(driver);
    }

    public void clickActiveUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickActiveButton();
    }

    public void clickBannedUsers() {
        leftSideMenu.clickOnMenuButtonUsers();
        actionOnUser.clickBannedButton();
    }

    public boolean banUser() {
        clickActiveUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToBanFirstClient();
        return actionOnUser.checkIfClientMovedToBannedList(userName);

    }

    public boolean makeUserActive() {
        clickBannedUsers();
        String userName = actionOnUser.getFirstNameFromClient();
        actionOnUser.clickToMakeFirstClientActive();
        return actionOnUser.checkIfClientMovedToActiveList(userName);
    }
}
