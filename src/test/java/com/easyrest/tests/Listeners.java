package com.easyrest.tests;

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
        //System.out.println("Test failed: " + result.getName();
        String testMethodName = result.getMethod().getMethodName();
       // result.getTestClass().getRealClass().getDeclaredField("driver").get(result.getInstance());
        try {
            getScreenShotPath(testMethodName);
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
