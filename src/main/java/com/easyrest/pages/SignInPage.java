package com.easyrest.pages;

import com.easyrest.config.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import static com.easyrest.config.ConfigProvider.readConfig;


public class SignInPage extends BasePage {

    private final By emailField = By.xpath("//input[@name='email']");
    private final By passwordField = By.xpath("//input[@name='password']");
    private final By signInButton = By.xpath("//span[text()='Sign In']");
    private final By createAccountButton = By.xpath("//span[text()='Create account']");
    private final By signUpMenuButton = By.xpath("//span[text()='Sign Up']");

    public SignInPage(WebDriver driver) {
        super(driver);
    }

    /**
     * General methods
     */
    public SignInPage goToSignInPage() {
        // TODO: pass url as a parameter from test
        openPage(ConfigProvider.loginPageUrlMac);
        return this;
    }

    /**
     * Methods to find one element and fill one field
     */
    public SignInPage inputEmail (String userEmail) {
        driver.findElement(emailField).sendKeys(userEmail);
        return this;
    }

    public SignInPage inputPassword (String userPass) {
        driver.findElement(passwordField).sendKeys(userPass);
        return this;
    }

    /**
     * Methods to find all fields, fill them with data and click 'signInButton'
     */
    public SignInPage loginValidUser(String userName, String password) {
        inputEmail(userName);
        inputPassword(password);
        clickSignIn();
        return new SignInPage(driver);
    }

    /**
     * Methods to click on element
     */
    public void clickCreateAccount() {
        driver.findElement(createAccountButton).click();
    }

    public void clickSignIn() {
        driver.findElement(signInButton).click();
    }

    public void clickSignUpMenuButton() {driver.findElement(signUpMenuButton).click();}

}
