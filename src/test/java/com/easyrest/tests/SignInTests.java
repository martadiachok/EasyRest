package com.easyrest.tests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInTests extends BaseTest {

    private final String adminEmail = ConfigProvider.adminEmail;
    private final String adminPassword = ConfigProvider.adminPassword;
    private final String fakeEmail = ConfigProvider.fakeEmail;
    private final String fakePassword = ConfigProvider.fakePassword;

    private SignInFacade signInFacade = new SignInFacade(driver);
    private SignInPage signInPage;

    @BeforeMethod
    public SignInPage goToSignInPage() {
        signInPage = new SignInPage(driver);
        signInPage.goToSignInPage();
        return new SignInPage(driver);
    }

    @Test
    public void signInTest_ValidData() {
        signInFacade.signIn(adminEmail, adminPassword);
       // Assert.assertEquals(ConfigProvider.adminPageUrl);
    }

    @Test
    public void signInTest_InvalidEmail() {
        signInFacade.signIn(fakeEmail, adminPassword);
        // Assert.assertEquals(ConfigProvider.adminPageUrl);
    }

    @Test
    public void signInTest_InvalidPassword() {
        signInFacade.signIn(adminEmail, fakePassword);
        // Assert.assertEquals(ConfigProvider.adminPageUrl);
    }

    @Test
    public void signInTest_InvalidData() {
        signInFacade.signIn(fakeEmail, fakePassword);
        // Assert.assertEquals(ConfigProvider.adminPageUrl);
    }

}
