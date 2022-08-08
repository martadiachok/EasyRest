package com.easyrest.pages.moderatorPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.moderator.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Owners extends BasePage {

   private LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
   private ActionOnUser actionOnOwner = new ActionOnUser(driver);

    public Owners(WebDriver driver) {
        super(driver);
    }

    public Owners clickActiveOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickActiveButton();
        return this;
    }

    public Owners clickBannedOwners() {
        leftSideMenu.clickOnMenuButtonOwners();
        actionOnOwner.clickBannedButton();
        return this;
    }

    public Owners banOwners() {
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToBanFirstClient();
        actionOnOwner.checkIfClientMovedToBannedList(userName);
        return this;
    }

    public Owners makeOwnersActive() {
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToMakeFirstClientActive();
        actionOnOwner.checkIfClientMovedToActiveList(userName);
        return this;
    }
}
