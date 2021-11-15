package com.bridgelabz.appium.flipkart.page;

import com.bridgelabz.appium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Page extends Base {

    public void choose_English_Language()
    {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//android.widget.TextView[@text='English']")).click();
    }

    public void click_Continue_After_Language_Selection()
    {
        driver.findElement(By.id("select_btn")).click();
    }

    public void click_Gmail_Option()
    {
        driver.findElement(By.xpath("//android.widget.TextView[@text='Use Email-ID']")).click();
    }

    public void input_GmailId(String gmail)
    {
        driver.findElement(By.id("phone_input")).sendKeys(gmail);
    }


}

