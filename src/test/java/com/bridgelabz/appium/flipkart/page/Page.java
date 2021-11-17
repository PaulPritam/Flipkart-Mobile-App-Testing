package com.bridgelabz.appium.flipkart.page;

import com.bridgelabz.appium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Page extends Base {

    @Test(priority = 1)
    public void choose_English_Language()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
    }

    @Test(dependsOnMethods = "choose_English_Language")
    public void click_Continue_After_Language_Selection() throws InterruptedException {
        driver.findElement(By.id("select_btn")).click();
        Thread.sleep(4000);
    }

    @Test(dependsOnMethods = "click_Continue_After_Language_Selection")
    public void click_Gmail_Option() throws InterruptedException {
        Thread.sleep(4000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Use Email-ID']")).click();
    }

    @Test(dependsOnMethods = "click_Gmail_Option")
    public void input_GmailId()
    {
        String gmail = "";

        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);

        driver.findElement(By.id("phone_input")).sendKeys(gmail);
    }

    @Test(dependsOnMethods = "input_GmailId")
    public void click_Continue_After_Gmail()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("button")).click();
    }

    @Test(dependsOnMethods = "click_Continue_After_Gmail" )
    public void enter_Password_For_Gmail()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("phone_input")).sendKeys("");
        driver.findElement(By.id("button")).click();
    }

    @Test(dependsOnMethods = "enter_Password_For_Gmail")
    public void select_Order()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.id("search_icon")).click();
        driver.findElement(By.id("search_autoCompleteTextView")).sendKeys("iPhone 12");
        driver.findElement(By.xpath("//android.widget.TextView[@text='iphone 12']")).click();
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='APPLE iPhone 12 (Blue, 128 GB)']")).click();
    }

    @Test(dependsOnMethods = "select_Order")
    public void add_To_Cart()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']")).click();

    }

    @Test(dependsOnMethods = "add_To_Cart")
    public void proceed_To_Cart()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='GO TO CART']")).click();
    }

    @Test(dependsOnMethods = "proceed_To_Cart")
    public void place_order()
    {
        driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Place Order ']")).click();
    }

}

