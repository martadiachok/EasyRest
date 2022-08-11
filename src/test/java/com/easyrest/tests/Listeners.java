package com.easyrest.tests;

import org.openqa.selenium.WebDriver;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.ITestContext;
import java.io.IOException;

public class Listeners extends BaseTest implements ITestListener {

   public void onTestSuccess(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Success of test cases and its details are : "+result.getName());
    }

    public void onTestFailure(ITestResult result) {
       String testMethodName = result.getMethod().getMethodName();
        try {
            BaseTest instance = (BaseTest)result.getInstance();
            driver = instance.getDriver();
        } catch (Exception e) {
            System.out.println(e);
        }

        try {
            getScreenShotPath(testMethodName, driver);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void onTestSkipped(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Skip of test cases and its details are : "+result.getName());
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
// TODO Auto-generated method stub
        System.out.println("Failure of test cases and its details are : "+result.getName());
    }

    public void onStart(ITestContext context) {
// TODO Auto-generated method stub
    }

    public void onFinish(ITestContext context) {
// TODO Auto-generated method stub
    }

}
