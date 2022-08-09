package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import org.openqa.selenium.WebDriver;

public class ActionOnModeratorFacade {
    private WebDriver driver;

    private LeftSideMenu leftSideMenu;
    private ActionOnUser actionOnModerator;
    private Moderators_AdminPanel moderatorsPage_adminPanel;

    public ActionOnModeratorFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnModerator = new ActionOnUser(driver);

        this.driver = driver;
    }

    private void clickActiveModerators() {
        leftSideMenu.clickModerators();
        actionOnModerator.clickActiveButton();
    }

    private void clickBannedModerators() {
        leftSideMenu.clickModerators();
        actionOnModerator.clickBannedButton();
    }

    public boolean banModerator() {
        clickActiveModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        actionOnModerator.clickToBanFirstClient();
        boolean isBanned = actionOnModerator.checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeModeratorActive() {
        clickBannedModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        actionOnModerator.clickToMakeFirstClientActive();
        boolean isActive = actionOnModerator.checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
