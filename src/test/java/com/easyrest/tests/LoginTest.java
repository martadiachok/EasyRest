package com.easyrest.tests;
import com.easyrest.config.ConfigProvider;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import java.lang.*;
import static com.easyrest.locators.LoginPageLocators.*;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class LoginTest extends BaseTest {
    @Test
    public void testLogin() throws InterruptedException {
        extent = new ExtentReports();
        logger = extent.createTest("LoginTest");
        ExtentSparkReporter spark = new ExtentSparkReporter("src/test/Reports/loginTest_28.06.2022");
        extent.attachReporter(spark);

        String clientEmail = ConfigProvider.clientEmail;
        String clientPassword = ConfigProvider.clientPassword;

        driver.get(ConfigProvider.urlLoginMac);

        WebElement inputEmail = driver.findElement(INPUT_EMAIL_FIELD.getPath());
        inputEmail.clear();
        inputEmail.sendKeys(clientEmail);
        logger.info("Email has been entered.");
        Thread.sleep(1500);

        WebElement inputPassword = driver.findElement(INPUT_PASSWORD_FIELD.getPath());
        inputPassword.clear();
        inputPassword.sendKeys(clientPassword);
        logger.info("Password has been entered.");
        Thread.sleep(2000);

        WebElement buttonSignIn = driver.findElement(BUTTON_SING_IN.getPath());
        buttonSignIn.click();
        logger.info("SignIn button has been clicked.");
        Thread.sleep(5000);

       Assert.assertEquals(ConfigProvider.urlRestaurantsMac, ConfigProvider.urlRestaurantsMac);
        logger.info("Page " + ConfigProvider.urlRestaurantsMac + " has been reached");
    }
}
