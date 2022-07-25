package com.easyrest.tests;

import com.easyrest.pages.BasePage;
import com.easyrest.pages.SignInPage;
import com.easyrest.pages.SignUpPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import static common.Config.CLEAR_COOKIES_AND_STORAGE;

abstract public class BaseTest {
    protected WebDriver driver;
    protected ExtentReports extent;
    protected ExtentTest logger;
    protected ExtentSparkReporter spark;

    // наслідники зможуть працювати з методами цих сторінок
    protected BasePage basePage = new BasePage(driver);
    protected SignInPage signInPage = new SignInPage(driver);
    protected SignUpPage signUpPage = new SignUpPage(driver);

    /**
     * Initialization of webdriver and assigning the settings for the webdriver
     */
    @BeforeTest
    public void setUp() {
        // method setup() - download webdriver and show path to it
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @AfterTest
    public void tearDown() {
        driver.close(); // закриває хром драйвер, драйвер відповідає за процес взаємодії з браузером
        driver.quit(); // закриваємо браузер (хром)
        extent.flush();
    }

    /* @AfterTest
    public void clearCookiesAndLocalStorage() {
        if(CLEAR_COOKIES_AND_STORAGE) {
            JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
            driver.manage().deleteAllCookies();
            javascriptExecutor.executeScript("window.sessionStorage.clean()");
        }
    } */

}
