package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.easyrest.config.ConfigProvider;
import com.easyrest.pages.SignUpPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;


public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {

        SignUpPage page = new SignUpPage(driver);

        page.goToSignUpPage();

        page.clickOnBirthdayField().inputDate("2012", "July", "7");

        Thread.sleep(3000);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.logInPageUrl);

        String clientEmail = ConfigProvider.clientEmail;
        String clientPassword = ConfigProvider.clientPassword;

        driver.get(ConfigProvider.logInPageUrl);

        WebElement inputEmail = driver.findElement(By.xpath("//input[@name='email']"));
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        Thread.sleep(1500);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='password']"));
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.xpath("//span[text()='Sign In']"));
        buttonSignIn.click();
        Thread.sleep(5000);

        Assert.assertEquals(driver.getCurrentUrl(), ConfigProvider.signUpPageUrl);
    }
}
