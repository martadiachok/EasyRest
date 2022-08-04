package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.WebDriver;

public class Owners extends BasePage {

    LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
    ActionOnUser actionOnOwner = new ActionOnUser(driver);

    public Owners(WebDriver driver) { super(driver); }

    public Owners clickActiveOwners(){
        leftSideMenu.clickOwners();
        actionOnOwner.clickActiveButton();
        return this;
    }

    public Owners clickBannedOwners() {
        leftSideMenu.clickOwners();
        actionOnOwner.clickBannedButton();
        return this;
    }

    public Owners banOwners(){
        clickActiveOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToBanFirstClient();
        actionOnOwner.checkIfClientMovedToBannedList(userName);
        return this;
    }

    public Owners makeOwnersActive(){
        clickBannedOwners();
        String userName = actionOnOwner.getFirstNameFromClient();
        actionOnOwner.clickToMakeFirstClientActive();
        actionOnOwner.checkIfClientMovedToActiveList(userName);
        return this;
    }
}
