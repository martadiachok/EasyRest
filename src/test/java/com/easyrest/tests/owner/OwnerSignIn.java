package com.easyrest.tests.owner;

import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class OwnerSignIn extends BaseTest {

    private final String ownerEmail = ConfigProvider.ownerEmail;
    private final String ownerPassword = ConfigProvider.ownerPassword;
    private SignInPage signInPage;
    private SignInFacade signInFacade;

    @Test
    public void signInTestsOwner() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        signInPage.goToSignInPage();
        signInFacade.signIn(ownerEmail, ownerPassword);
        Boolean element = (new WebDriverWait(driver, Duration.ofSeconds(4)).until(ExpectedConditions.urlToBe("http://localhost:3000/profile/restaurants")));
        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.ownerPageUrl, "Failed to login");
    }
}
