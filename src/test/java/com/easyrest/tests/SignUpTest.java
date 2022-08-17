package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.easyrest.config.ConfigProvider;
import com.easyrest.facade.SignInFacade;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SignUpTest extends BaseTest {

    private final String name = ConfigProvider.testName;
    private final String email = ConfigProvider.testEmail;
    private final String phoneNumber = ConfigProvider.testPhoneNumber;
    private final String birthDate = ConfigProvider.testBirthDate;
    private final String birthMonth = ConfigProvider.testBirthMonth;
    private final String birthYear = ConfigProvider.testBirthYear;
    private final String password = ConfigProvider.testPassword;

    private SignUpPage signUpPage;
    private SignInPage signInPage;
    private SignInFacade signInFacade;

    @Test (priority = 1)
    public void signUpPositiveTest() throws InterruptedException {
        signUpPage = new SignUpPage(driver);
        extent = new ExtentReports();
        test = extent.createTest("signUpPositiveTest");

        signUpPage.goToSignUpPage();
        signUpPage.inputName(name);
        signUpPage.inputEmail(email);
        signUpPage.inputPhone(phoneNumber);
        signUpPage.clickOnBirthdayField().inputDate(birthYear, birthMonth, birthDate);
        signUpPage.inputPassword(password);
        signUpPage.clickCreateAccount();

        String currentUrl = driver.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, ConfigProvider.signInPageUrl, "Sign up failed. Sign in page was not reached.");
    }

    @Test (priority = 2)
    public void secondCheckSignUp_tryToSignIn() throws InterruptedException {
        signInPage = new SignInPage(driver);
        signInFacade = new SignInFacade(driver);
        extent = new ExtentReports();
        test = extent.createTest("secondCheckSignUp");

        signInPage.goToSignInPage();
        signInFacade.signIn(email, password);

        String currentUrl = driver.driver.getCurrentUrl();
        Assert.assertEquals(currentUrl, ConfigProvider.restaurantsPageUrl, "Sign in of new user was not successful. Restaurant page was not reached.");
    }

}
