package com.easyrest.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import readProperties.ConfigProvider;

import java.lang.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest extends BaseTest {

    @Test
    public void testLogin() throws InterruptedException {

        String clientEmail = "martad4756170@gmail.com"; //ConfigProvider.clientEmail;
        String clientPassword = "12345678"; //ConfigProvider.clientPassword;

        driver.get("http://localhost:8880/log-in");

        WebElement inputEmail = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[1]/div/div/input"));
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[2]/div/div/input"));
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[3]/div/button/span[1]"));
        buttonSignIn.click();
        Thread.sleep(5000);

        // Assert.assertEquals(ConfigProvider.urlRestaurantsMac, ConfigProvider.urlRestaurantsMac );

        String URL = "http://localhost:8880/restaurants";
        Assert.assertEquals(URL, "http://localhost:8880/restaurants" );

    }

}
