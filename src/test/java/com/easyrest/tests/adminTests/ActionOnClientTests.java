package com.easyrest.tests.adminTests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.adminPanel.Moderators_AdminPanel;
import com.easyrest.pages.adminPanel.Owners_AdminPanel;
import com.easyrest.pages.adminPanel.Users_AdminPanel;
import com.easyrest.tests.BaseTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ActionOnClientTests extends BaseTest {

    private final String adminEmail = ConfigProvider.adminEmail;
    private final String adminPassword = ConfigProvider.adminPassword;
    private SignInPage signInPage;
    private Moderators_AdminPanel adminPanel_ModeratorsPage = new Moderators_AdminPanel(driver);
    private Owners_AdminPanel adminPanel_OwnersPage = new Owners_AdminPanel(driver);
    private Users_AdminPanel adminPanel_UsersPage = new Users_AdminPanel(driver);

    @BeforeClass
    public void preconditions() {
        signInPage = new SignInPage(driver);

        signInPage.inputEmail(adminEmail);
        signInPage.inputPassword(adminPassword);
    }

    @Test
    public void banUser() {
        adminPanel_UsersPage.goToAdminPanel_UsersPage();

    }

}
