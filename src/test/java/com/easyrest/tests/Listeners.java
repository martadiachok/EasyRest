package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {

    ExtentReports extent = ExtentReport.setupReporter();
    ExtentTest test;
    private final static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();

    @Override
    public void onTestStart(ITestResult result) {
        test = extent.createTest(result.getTestClass().getName() + " : " +
                result.getMethod().getMethodName());
    }
    @Override
   public void onTestSuccess(ITestResult result) {
       test.pass(result.getMethod().getMethodName());
    }
    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getMethod().getMethodName());
        String testMethodName = result.getMethod().getMethodName();
        try {
            BaseTest instance = (BaseTest)result.getInstance();
            driver = instance.getDriver();
         } catch (Exception e) {
           test.info(e);
         }

        try {
            getScreenShotPath(testMethodName);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @Override
    public void onTestSkipped(ITestResult result) {
        test.skip(result.getMethod().getMethodName());
    }
    @Override
    public void onFinish(ITestContext context)    {
        extent.flush();
    }

}
