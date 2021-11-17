package com.bridgelabz.appium.flipkart.test;

import com.aventstack.extentreports.ExtentReporter;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class ExtentReportsImplementation {
    ExtentReporter htmlReporter;
    public ExtentReports extent;

    @BeforeSuite
    public void reportSetup() {
        htmlReporter = new ExtentHtmlReporter("C:\\Users\\" +
                "Pritam Paul\\Downloads\\demo1\\AmazonAutomation\\" +
                "resources\\extentReports.html");
        extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
    }

    @AfterSuite
    public void reportTearDown()
    {
        extent.flush();
    }
}
