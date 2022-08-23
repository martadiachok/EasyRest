package com.easyrest.tests.administrator;

import com.easyrest.components.SingInAlert;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.AdministratorPage;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static com.easyrest.config.ConfigProvider.*;

public class AdministratorSignInTest extends BaseTest {
    private final String email = ConfigProvider.administratorEmail;
    private final String password = ConfigProvider.administratorPassword;
    private SignInFacade signInFacade;


    @BeforeMethod
    public void goToSignInPage() {
        SignInPage signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        signInPage.goToSignInPage();
    }

    @Test
    public void validSignIn() {
        AdministratorPage administratorPage = new AdministratorPage(driver);
        signInFacade.signIn(email, password);
        administratorPage.waitForPagePresence();
        String currentUrl = driver.getCurrentUrl();

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
    public void fakeSignIn(String email, String password) {
        SingInAlert alert = new SingInAlert(driver);
        signInFacade.signIn(email, password);
        String actualAlertMessage = alert.showMessage();

        Assert.assertEquals(actualAlertMessage, expectedAlertMessage, "The alert message doesn't match the expected one.");
    }

}
