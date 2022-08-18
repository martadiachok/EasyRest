package com.easyrest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {

    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName() + " : " +
                result.getMethod().getMethodName());
    }

   public void onTestSuccess(ITestResult result) {
       System.out.println("Test passed: " + result.getMethod().getMethodName());
    }

    public void onTestFailure(ITestResult result) {
       System.out.println("Test was failed: " + result.getMethod().getMethodName());
       String testMethodName = result.getMethod().getMethodName();
        try {
            BaseTest instance = (BaseTest)result.getInstance();
            driver = instance.getDriver();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            getScreenShotPath(testMethodName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
        System.out.println("Test was skipped: " + result.getMethod().getMethodName());
    }

}
