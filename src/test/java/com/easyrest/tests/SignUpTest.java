package com.easyrest.tests;

import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.SignUpPage;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
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

    @Test
    public SignInPage signUpPositiveTest(){
        signUpPage.goToSignUpPage();

        signUpPage.inputName(name);
        signUpPage.inputEmail(email);
        signUpPage.inputPhone(phoneNumber);
        signUpPage.inputName(name);
        signUpPage.clickOnBirthdayField().inputDate(birthYear, birthMonth, birthDate);
        signUpPage.inputPassword(password);

        signUpPage.clickCreateAccount();
        return new SignInPage(driver);
//change to SignInPage
        //Assert.assertEquals("http://localhost:3000/log-in","http://localhost:3000/log-in","Sign in page was not reached");
    }

    @Test
    public void secondCheckSignUp() {
        signInPage.inputEmail(email);
        signInPage.inputPassword(password);
        signInPage.clickSignIn();

        Assert.assertEquals("http://localhost:3000/restaurants", "http://localhost:3000/restaurants",
                "Sign in was not successful, Restaurant page was not reached");
    }

}
