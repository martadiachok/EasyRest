package com.easyrest.tests.adminTests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.facade.admin.ActionOnModeratorFacade;
import com.easyrest.facade.admin.ActionOnOwnerFacade;
import com.easyrest.facade.admin.ActionOnUserFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import com.easyrest.pages.adminPanel.Owners_AdminPanel;
import com.easyrest.pages.adminPanel.Users_AdminPanel;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.time.Duration;

public class ActionOnClientTests extends BaseTest {

    private final String adminEmail = ConfigProvider.adminEmail;
    private final String adminPassword = ConfigProvider.adminPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private ActionOnUserFacade actionOnUserFacade;
    private ActionOnOwnerFacade actionOnOwnerFacade;
    private ActionOnModeratorFacade actionOnModeratorFacade;
    private Moderators_AdminPanel adminPanel_ModeratorsPage;
    private Owners_AdminPanel adminPanel_OwnersPage;
    private Users_AdminPanel adminPanel_UsersPage;
    private WebDriverWait wait;
    private boolean isActionDone = true;

    private void waitForUrlPresence(String pageUrl) {
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.urlToBe(pageUrl));
    }

    @BeforeClass
    public void preconditions() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);

        signInPage.goToSignInPage();
        signInFacade.signIn(adminEmail, adminPassword);
        waitForUrlPresence(ConfigProvider.adminPageUrl);
    }

    @Test
    public void banUser() {
        actionOnUserFacade = new ActionOnUserFacade(driver);
        adminPanel_UsersPage = new Users_AdminPanel(driver);

        adminPanel_UsersPage.goToAdminPanel_UsersPage();
        boolean actualBoolean = actionOnUserFacade.banUser();

        Assert.assertEquals(actualBoolean, isActionDone, "User is not banned.");
    }

    @Test
    public void makeUserActive() {
        actionOnUserFacade = new ActionOnUserFacade(driver);
        adminPanel_UsersPage = new Users_AdminPanel(driver);

        adminPanel_UsersPage.goToAdminPanel_UsersPage();
        boolean actualBoolean = actionOnUserFacade.makeUserActive();

        Assert.assertEquals(actualBoolean, isActionDone, "User was not moved to active.");
    }

    @Test
    public void banOwner() {
        actionOnOwnerFacade = new ActionOnOwnerFacade(driver);
        adminPanel_OwnersPage = new Owners_AdminPanel(driver);

        adminPanel_OwnersPage.goToAdminPanel_OwnerPage();
        boolean actualBoolean = actionOnOwnerFacade.banOwners();

        Assert.assertEquals(actualBoolean, isActionDone, "Owner is not banned.");
    }

    @Test
    public void makeOwnerActive() {
        actionOnOwnerFacade = new ActionOnOwnerFacade(driver);
        adminPanel_OwnersPage = new Owners_AdminPanel(driver);

        adminPanel_OwnersPage.goToAdminPanel_OwnerPage();
        boolean actualBoolean = actionOnOwnerFacade.makeOwnersActive();

        Assert.assertEquals(actualBoolean, isActionDone, "Owner was not moved to active.");
    }

    @Test
    public void banModerator() {
        actionOnModeratorFacade = new ActionOnModeratorFacade(driver);
        adminPanel_ModeratorsPage = new Moderators_AdminPanel(driver);

        adminPanel_ModeratorsPage.goToAdminPanel_ModeratorPage();
        boolean actualBoolean = actionOnModeratorFacade.banModerator();

        Assert.assertEquals(actualBoolean, isActionDone, "Moderator is not banned.");
    }

    @Test
    public void makeModeratorActive() {
        actionOnModeratorFacade = new ActionOnModeratorFacade(driver);
        adminPanel_ModeratorsPage = new Moderators_AdminPanel(driver);

        adminPanel_ModeratorsPage.goToAdminPanel_ModeratorPage();
        boolean actualBoolean = actionOnModeratorFacade.makeModeratorActive();

        Assert.assertEquals(actualBoolean, isActionDone, "Moderator was not moved to active.");
    }

}
