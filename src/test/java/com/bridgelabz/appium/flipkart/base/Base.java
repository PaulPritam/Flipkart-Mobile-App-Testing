package com.bridgelabz.appium.flipkart.base;

import io.appium.java_client.android.AndroidDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Base {

    public static AndroidDriver driver;

    @BeforeTest
    public static void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "sdk_gphone_x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("app","C:\\Users\\Pritam Paul" +
                "\\Downloads\\demo1\\AmazonAutomation\\resources\\apk\\flipkart.apk");
        cap.setCapability("appPackage","com.flipkart.android");
        cap.setCapability("autoGrantPermissions",true);

        Thread.sleep(6000);
        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
        Thread.sleep(6000);
    }

    @AfterTest
    public void takeScreenshot() throws IOException {
        DateFormat dateFormat = new SimpleDateFormat("dd-mm-yyyy h-m-s");
        Date date = new Date();

        File file = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(file, new File("C:\\Users\\Pritam Paul\\" +
                "Downloads\\demo1\\AmazonAutomation\\resources\\screenshots" +
                dateFormat.format(date) + "screenshot.png"));
    }
}
