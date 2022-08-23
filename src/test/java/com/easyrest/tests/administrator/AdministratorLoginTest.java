package com.easyrest.tests.administrator;

import com.easyrest.components.SingInAlert;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.AuthorizedHeaderMenuPanelFacade;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;

public class AdministratorLoginTest extends BaseTest {
    private final String email = ConfigProvider.administratorEmail;
    private final String password = ConfigProvider.administratorPassword;
    private final String fakeEmail = ConfigProvider.fakeEmail;
    private final String fakePassword = ConfigProvider.fakePassword;
    private final String administratorPanelUrl = ConfigProvider.administratorPanelUrl;
    private final String expectedAlertMessage = ConfigProvider.alertMessage;
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

    @DataProvider(name = "fake")
    public Object[][] fakeData() {
        return new Object[][]{
                new Object[]{fakeEmail, password},
                new Object[]{email, fakePassword},
                new Object[]{fakeEmail, fakePassword},
        };
    }

    @Test(dataProvider = "fake")
    public void fakeLogin(String email, String password) {
        signInFacade.signIn(email, password);
        SingInAlert alert = new SingInAlert(driver);
        String actualAlertMessage = alert.showMessage();

        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "The alert message doesn't match the expected one.");
    }

}
