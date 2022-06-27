package com.easyrest.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.lang.*;

import readProperties.ConfigProvider;

import static com.easyrest.locators.Locators.*;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {

        String clientEmail = ConfigProvider.clientEmail;
        String clientPassword = ConfigProvider.clientPassword;

        driver.get(ConfigProvider.urlLoginMac);

        WebElement inputEmail = driver.findElement(INPUT_EMAIL_FIELD.getPath());
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(INPUT_PASSWORD_FIELD.getPath());
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(BUTTON_SING_IN.getPath());
        buttonSignIn.click();
        Thread.sleep(5000);

        Assert.assertEquals(ConfigProvider.urlRestaurantsMac, ConfigProvider.urlRestaurantsMac);

    }

}
