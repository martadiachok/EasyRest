package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.easyrest.config.ConfigProvider;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        extent = new ExtentReports();
        logger = extent.createTest("LoginTest");
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/Reports/loginTest_28.06.2022");
        extent.attachReporter(spark);

        String clientEmail = ConfigProvider.clientEmail;
        String clientPassword = ConfigProvider.clientPassword;

        driver.get(ConfigProvider.urlLoginWind);

        WebElement inputEmail = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[1]/div/div/input"));
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        logger.info("Email has been entered.");
        Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[2]/div/div/input"));
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        logger.info("Password has been entered.");
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(By.xpath("/html/body/div/main/div/div[2]/form/div/div[3]/div/button/span[1]"));
        buttonSignIn.click();
        logger.info("SignIn button has been clicked.");
        Thread.sleep(5000);

       Assert.assertEquals(ConfigProvider.urlRestaurantsMac, ConfigProvider.urlRestaurantsMac);
        logger.info("Page " + ConfigProvider.urlRestaurantsMac + " has been reached");
    }
}
