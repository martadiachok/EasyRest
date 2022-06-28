package com.easyrest.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

abstract public class BaseTest { //abstract - щоб не могли створювати екземпляри класу клас потрубен, щоб наслідувати в ін класах
    public WebDriver driver;
    public ExtentReports extent;
    public ExtentTest logger;
    public ExtentSparkReporter spark;

    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        extent = new ExtentReports();
        extent.attachReporter(spark);
    }

    @AfterTest
    public void shutDown() {
        driver.close(); // закриває хром драйвер, драйвер відповідає за процес взаємодії з браузером
        driver.quit(); // закриваємо браузер (хром)
        extent.flush();
    }

}
