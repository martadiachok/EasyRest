package com.easyrest.pages.adminPanel;

import com.easyrest.components.admin.ActionOnUser;
import com.easyrest.components.admin.CreateModeratorAccountForm;
import com.easyrest.components.admin.LeftSideMenu;
import com.easyrest.pages.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Moderators extends BasePage {

    private final By addModeratorButton = By.xpath("//span[text()='Add moderator']");

    LeftSideMenu leftSideMenu = new LeftSideMenu(driver);
    ActionOnUser actionOnModerator = new ActionOnUser(driver);

    public Moderators(WebDriver driver) { super(driver); }

    public Moderators clickActiveModerators(){
        leftSideMenu.clickModerators();
        actionOnModerator.clickActiveButton();
        return this;
    }

    public Moderators clickBannedModerators(){
        leftSideMenu.clickModerators();
        actionOnModerator.clickBannedButton();
        return this;
    }

    public Moderators banModerator(){
        clickActiveModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        actionOnModerator.clickToBanFirstClient();
        actionOnModerator.checkIfClientMovedToBannedList(userName);
        return this;
    }

    public Moderators makeModeratorActive(){
        clickBannedModerators();
        String userName = actionOnModerator.getFirstNameFromClient();
        actionOnModerator.clickToMakeFirstClientActive();
        actionOnModerator.checkIfClientMovedToActiveList(userName);
        return this;
    }

    public CreateModeratorAccountForm clickAddModerator(){
        leftSideMenu.clickModerators();
        driver.findElement(addModeratorButton).click();
        return new CreateModeratorAccountForm(driver);
    }
}
