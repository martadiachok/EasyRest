package com.easyrest.tests.adminTests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.constants.Constants;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.tests.BaseTest;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class SignInTests extends BaseTest {

    private final String adminEmail = ConfigProvider.adminEmail;
    private final String adminPassword = ConfigProvider.adminPassword;
    private final String fakeEmail = ConfigProvider.fakeEmail;
    private final String fakePassword = ConfigProvider.fakePassword;

    private SignInPage signInPage;
    private SignInFacade signInFacade;
    private WebDriverWait wait;

    private void waitForPageToBePresent(){
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(Constants.TimeoutVariable.IMPLICIT_WAIT));
    }

    @BeforeMethod
    public SignInPage goToSignInPage() {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        signInPage.goToSignInPage();

        return new SignInPage(driver);
    }

    @Test
    public void signInTest_ValidData() {
        signInFacade.signIn(adminEmail, adminPassword);
        wait.until(ExpectedConditions.urlToBe(ConfigProvider.adminPageUrl));

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.adminPageUrl, "Sign in failed.");
    }

    @Test
    public void signInTest_InvalidEmail() {
        signInFacade.signIn(fakeEmail, adminPassword);
        waitForPageToBePresent();

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signInPageUrl);
    }

    @Test
    public void signInTest_InvalidPassword() {
        signInFacade.signIn(adminEmail, fakePassword);
        waitForPageToBePresent();

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signInPageUrl);
    }

    @Test
    public void signInTest_InvalidData() {
        signInFacade.signIn(fakeEmail, fakePassword);
        waitForPageToBePresent();

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signInPageUrl);
    }
    
}
