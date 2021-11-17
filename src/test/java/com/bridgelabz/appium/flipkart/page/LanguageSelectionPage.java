package com.bridgelabz.appium.flipkart.page;

import com.bridgelabz.appium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import java.util.concurrent.TimeUnit;

public class LanguageSelectionPage extends Base {

    public void choose_English_Language() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement language = driver.findElement(By.xpath("//android.widget.TextView[@text='English']"));
        language.click();
    }

    public void click_Continue_After_Language_Selection() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement tap_continue = driver.findElement(By.id("select_btn"));
        tap_continue.click();
    }


}

