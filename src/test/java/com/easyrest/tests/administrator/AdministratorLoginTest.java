package com.easyrest.tests.administrator;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdministratorLoginTest extends BaseTest {
    private final String partOfUrl = "log-in";

    private final String email = ConfigProvider.administratorEmail;
    private final String password = ConfigProvider.administratorPassword;

    @Test
    public void validLogin() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage
                .goToSignInPage()
                .inputEmail(email)
                .inputPassword(password)
                .clickSignIn();

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.not(ExpectedConditions.urlContains(partOfUrl)));
        String currentUrl = driver.getCurrentUrl();
        AuthorizedHeaderMenuPanelFacade menu = new AuthorizedHeaderMenuPanelFacade(driver);
        menu.clickOnLogoutMenuItem();

        Assert.assertFalse(currentUrl.contains(partOfUrl), "The current url doesn't match the expected one.");
    }

    @Test
    public void invalidLogin() {
        SignInPage signInPage = new SignInPage(driver);
        signInPage
                .goToSignInPage()
                .inputEmail("")
                .inputPassword(password)
                .clickSignIn();
        String currentUrl = driver.getCurrentUrl();

        Assert.assertTrue(currentUrl.contains(partOfUrl), "The current url doesn't match the expected one.");
    }

}
