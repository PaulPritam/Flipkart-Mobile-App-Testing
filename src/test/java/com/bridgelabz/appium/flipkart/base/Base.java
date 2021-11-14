package com.bridgelabz.appium.flipkart.base;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Base {

    public static AndroidDriver driver;

    @BeforeTest
    public static void setup() throws InterruptedException, MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();

        cap.setCapability("deviceName", "sdk_gphone_x86");
        cap.setCapability("udid", "emulator-5554");
        cap.setCapability("platformName", "Android");
        cap.setCapability("platformVersion", "8.0.0");
        cap.setCapability("app","C:\\Users\\Pritam Paul\\Downloads\\flipkart.apk");
        cap.setCapability("appPackage","com.flipkart.android");

        Thread.sleep(6000);

        driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), cap);
    }
}
