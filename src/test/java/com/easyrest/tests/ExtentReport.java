package com.easyrest.tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {
    protected static ExtentSparkReporter spark;
    protected static ExtentReports extent;
    public static ExtentReports setupReporter() {

        String reportPath = System.getProperty("user.dir") + "/reports/index.html";
        // Create object of ExtentSparkReporter class and set up address for report saving
        spark = new ExtentSparkReporter(reportPath);
        spark.config().setDocumentTitle("EasyRest Test Results");
        // Create object of ExtentReports class who is responsible for executing reports
        extent = new ExtentReports();
        // give knowledge about report from ExtentSparkReporter class to main class ExtentReports
        extent.attachReporter(spark);
        return extent;
    }
}
