package com.bridgelabz.appium.flipkart.test;

import com.aventstack.extentreports.ExtentTest;
import com.bridgelabz.appium.flipkart.base.Base;
import com.bridgelabz.appium.flipkart.page.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FlipkartAppTest extends Base {
    public Page page = new Page();
    private static final Logger LOGGER = LogManager.getLogger(FlipkartAppTest.class);
    ExtentTest test1;

    @Test(priority = 1)
    public void language_Selection() throws InterruptedException {
        LOGGER.info(" Test set- 1 started successfully ");
        LOGGER.info(" Select preferred language ");

        test1 = extent.createTest("Language selection",
                "Selects english language from the given options");
        page.choose_English_Language();
        page.click_Continue_After_Language_Selection();
    }

    @Test(dependsOnMethods = "language_Selection")
    public void login_To_Flipkart() throws InterruptedException {
        LOGGER.info(" Test set- 2 started successfully ");
        test1 = extent.createTest("Login to app",
                "Logs in to the Flipkart application");

        page.click_Gmail_Option();
        page.input_GmailId();
        page.click_Continue_After_Gmail();
        page.enter_Password_For_Gmail();
    }

    @Test(dependsOnMethods = "login_To_Flipkart")
    public void select_And_Order_A_Product() {
        LOGGER.info(" Test set- 3 started successfully ");
        test1 = extent.createTest("Select a product and order",
                "Selects the given product and places the order");

        page.select_Order();
        page.add_To_Cart();
        page.proceed_To_Cart();
        page.place_order();
    }


}
