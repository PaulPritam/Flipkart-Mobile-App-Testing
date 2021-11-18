package com.bridgelabz.appium.flipkart.test;

import com.aventstack.extentreports.ExtentTest;
import com.bridgelabz.appium.flipkart.base.Base;
import com.bridgelabz.appium.flipkart.page.FlipkartLoginPage;
import com.bridgelabz.appium.flipkart.page.FlipkartOrderPage;
import com.bridgelabz.appium.flipkart.page.LanguageSelectionPage;
import io.appium.java_client.MobileElement;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FlipkartAppTest extends Base {
    public LanguageSelectionPage page = new LanguageSelectionPage();
    public FlipkartLoginPage loginPage = new FlipkartLoginPage();
    public FlipkartOrderPage orderPage = new FlipkartOrderPage();

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
        WebElement continueBtn = driver.findElement(By.id("select_btn"));
        boolean checkContinue = continueBtn.isEnabled();
        Assert.assertEquals(checkContinue,true);
    }

    @Test(dependsOnMethods = "language_Selection")
    public void login_To_Flipkart() throws InterruptedException {
        LOGGER.info(" Test set- 2 started successfully ");
        test1 = extent.createTest("Login to app",
                "Logs in to the Flipkart application");

        loginPage.click_Gmail_Option();
        loginPage.input_GmailId();
        loginPage.click_Continue_After_Gmail();
        loginPage.enter_Password_For_Gmail();
        WebElement continueBtn = driver.findElement(By.id("select_btn"));
        boolean checkContinue = continueBtn.isEnabled();
        Assert.assertEquals(checkContinue,true);
    }

    @Test(dependsOnMethods = "login_To_Flipkart")
    public void select_And_Order_A_Product() {
        LOGGER.info(" Test set- 3 started successfully ");
        test1 = extent.createTest("Select a product and order",
                "Selects the given product and places the order");

        orderPage.select_Order();
        orderPage.add_To_Cart();
        orderPage.proceed_To_Cart();
        orderPage.place_order();
        String orderList = driver.findElement(By.xpath("//android.widget.TextView")).getText();
        Assert.assertEquals(orderList,"Order Summary");
    }


}
