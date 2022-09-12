package com.easyrest.tests.customer;

import com.easyrest.components.HeaderForAuthorizedUser;
import com.easyrest.config.ConfigProvider;
import com.easyrest.constants.Constants;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import com.easyrest.config.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;


public class SignInTest extends BaseTest {
    private final String clientEmail = ConfigProvider.clientEmail;
    private final String clientPassword = ConfigProvider.clientPassword;
    private final String fakePassword =ConfigProvider.fakePassword;
    private final String fakeEmail = ConfigProvider.fakeEmail;
    private final String expectedUrl = ConfigProvider.customerPanel;
    private final String signInPageUrl = ConfigProvider.signInPageUrl;
    private WebDriverWait wait;
    private SignInFacade signInFacade;
    private SignInPage signInPage;
    private HeaderForAuthorizedUser headerForAuthorizedUser;

    @BeforeMethod
    public void goToSignInPage() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
        signInPage.goToSignInPage();
    }

    @Test
    public void logInWithValidData() {
        headerForAuthorizedUser = new HeaderForAuthorizedUser(driver);
        signInFacade.signIn(clientEmail, clientPassword);
        headerForAuthorizedUser.clickOnUserProfileIcon().clickOnTheFirstMenuItem();
        wait.until(ExpectedConditions.urlToBe(expectedUrl));
        Assert.assertEquals(driver.getCurrentUrl(), expectedUrl , "Sign in failed.");
    }

   @Test
   public void logInWithInvalidPassword() {
        signInFacade.signIn(clientEmail, fakePassword);
        Assert.assertEquals(driver.getCurrentUrl(), signInPageUrl);
    }

    @Test
    public void logInWithInvalidEmail() {
        signInFacade.signIn(fakeEmail, clientPassword);
        Assert.assertEquals(driver.getCurrentUrl(), signInPageUrl);
    }

    @Test
    public void logInWithInvalidData() {
        signInFacade.signIn(fakeEmail, fakePassword);
        Assert.assertEquals(driver.getCurrentUrl(), signInPageUrl);
    }
}
