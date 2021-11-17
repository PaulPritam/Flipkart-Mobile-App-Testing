package com.bridgelabz.appium.flipkart.test;

import com.bridgelabz.appium.flipkart.base.Base;
import com.bridgelabz.appium.flipkart.page.Page;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;

public class FlipkartAppTest extends Base {
    public Page page = new Page();
    private static final Logger LOGGER = LogManager.getLogger(FlipkartAppTest.class);

    @Test(priority = 1)
    public void language_And_Login_Credentials() throws InterruptedException {
        LOGGER.info(" Test set- 1 started successfully ");
        LOGGER.info(" Log-in ");

        page.choose_English_Language();
        page.click_Continue_After_Language_Selection();
        page.click_Gmail_Option();
        page.input_GmailId();
        page.click_Continue_After_Gmail();
        page.enter_Password_For_Gmail();
    }

    @Test(dependsOnMethods = "language_And_Login_Credentials")
    public void select_And_Order_A_Product()
    {
        LOGGER.info(" Test set- 2 started successfully ");
        LOGGER.info(" Select a product and add to cart then click on order now ");

        page.select_Order();
        page.add_To_Cart();
        page.proceed_To_Cart();
        page.place_order();
    }


}
