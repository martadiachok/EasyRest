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

import java.lang.*;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class LoginTest {

    @Test
    public void testLogin() throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://localhost:3000/log-in");

        WebElement inputEmail = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[1]/div/div/input"));
        inputEmail.clear();
        inputEmail.sendKeys("tanyasanchez@test.com");
        Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[2]/div/div/input"));
        inputPassword.clear();
        inputPassword.sendKeys("1");
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[3]/div/button/span[1]"));
        buttonSignIn.click();

        String URL = "http://localhost:3000/restaurants";
        Assert.assertEquals(URL, "http://localhost:3000/restaurants" );

        driver.close();
        driver.quit();

    }

}
