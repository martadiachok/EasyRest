package com.easyrest.facade.admin;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.LeftSideMenu;
import org.openqa.selenium.WebDriver;

public class ActionOnOwnerFacade {
    private WebDriver driver;

    private LeftSideMenu leftSideMenu;
    private ActionOnUser actionOnOwner;

    public ActionOnOwnerFacade(WebDriver driver) {
        leftSideMenu = new LeftSideMenu(driver);
        actionOnOwner = new ActionOnUser(driver);

        this.driver = driver;
    }

    private void clickActiveOwners() {
        leftSideMenu.clickOwners();
        actionOnOwner.clickActiveButton();
    }

    private void clickBannedOwners() {
        leftSideMenu.clickOwners();
        actionOnOwner.clickBannedButton();
    }

    public boolean banOwners() {
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToBanFirstClient();
        boolean isBanned = actionOnOwner.checkIfClientMovedToBannedList(userName);
        return isBanned;
    }

    public boolean makeOwnersActive() {
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToMakeFirstClientActive();
        boolean isActive = actionOnOwner.checkIfClientMovedToActiveList(userName);
        return isActive;
    }

}
