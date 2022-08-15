package com.easyrest.facade.moderator;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.moderator.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class BanUnbanOwnersFacade {
    private LeftSideMenu leftSideMenu;
    private ActionOnUser actionOnOwner;

    public BanUnbanOwnersFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnOwner = new ActionOnUser(driver);
    }

    public void clickActiveOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickActiveButton();
    }

    public void clickBannedOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickBannedButton();
    }

    public boolean banOwners() {
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToBanFirstClient();
        return actionOnOwner.checkIfClientMovedToBannedList(userName);
    }

    public boolean makeOwnersActive() {
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToMakeFirstClientActive();
        return actionOnOwner.checkIfClientMovedToActiveList(userName);

    }
}
