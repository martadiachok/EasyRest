package com.easyrest.tests.administrator;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdministratorLoginTest extends BaseTest {
    private final String email = ConfigProvider.administratorEmail;
    private final String password = ConfigProvider.administratorPassword;
    private final String administratorPanelUrl = ConfigProvider.administratorPanelUrl;
    private SignInFacade signInFacade;
    private WebDriverWait wait;

    @BeforeMethod
    public void goToSignInPage() {
        SignInPage signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        signInPage.goToSignInPage();
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
    }

    @Test
    public void validLogin() {
        signInFacade.signIn(email, password);
        wait.until(ExpectedConditions.urlToBe(administratorPanelUrl));
        String currentUrl = driver.getCurrentUrl();
        AuthorizedHeaderMenuPanelFacade menu = new AuthorizedHeaderMenuPanelFacade(driver);
        menu.clickOnLogoutMenuItem();

        Assert.assertEquals(currentUrl, administratorPanelUrl, "The current url doesn't match the expected one.");
    }

    @Test
    public void invalidEmail() {
        signInFacade.signIn("", password);
        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotEquals(currentUrl, administratorPanelUrl, "The current url doesn't match the expected one.");
    }

    @Test
    public void invalidPassword() {
        signInFacade.signIn(email, "");
        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotEquals(currentUrl, administratorPanelUrl, "The current url doesn't match the expected one.");
    }

    @Test
    public void invalidLogin() {
        signInFacade.signIn("", "");
        String currentUrl = driver.getCurrentUrl();

        Assert.assertNotEquals(currentUrl, administratorPanelUrl, "The current url doesn't match the expected one.");
    }

}
