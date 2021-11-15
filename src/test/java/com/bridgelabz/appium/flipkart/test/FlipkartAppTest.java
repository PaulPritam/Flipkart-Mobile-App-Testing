package com.bridgelabz.appium.flipkart.test;

import com.bridgelabz.appium.flipkart.base.Base;
import com.bridgelabz.appium.flipkart.page.Page;
import org.testng.annotations.Test;

public class FlipkartAppTest extends Base {

    public Page page = new Page();

    @Test(priority = 1)
    public void select_Language_And_Login()
    {
        page.choose_English_Language();
        page.click_Continue_After_Language_Selection();
    }

    @Test(dependsOnMethods = "select_Language_And_Login")
    public void click_And_Input_Gmail()
    {
        page.click_Gmail_Option();
        page.input_GmailId("pritampaul19971997@gmail.com");
    }
}
