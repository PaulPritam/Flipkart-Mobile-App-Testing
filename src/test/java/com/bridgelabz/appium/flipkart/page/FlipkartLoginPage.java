package com.bridgelabz.appium.flipkart.page;

import com.bridgelabz.appium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FlipkartLoginPage extends Base {
    public void click_Gmail_Option() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement gmail_Option = driver.findElement(By.xpath("//android.widget.TextView[@text='Use Email-ID']"));
        gmail_Option.click();
    }

    public void input_GmailId() {
        String gmail = "";
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement gmail_InputBox = driver.findElement(By.id("phone_input"));
        gmail_InputBox.sendKeys(gmail);
    }

    public void click_Continue_After_Gmail() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement continueButton = driver.findElement(By.id("button"));
        continueButton.click();
    }

    public void enter_Password_For_Gmail() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement passwordField = driver.findElement(By.id("phone_input"));
        passwordField.sendKeys("");

        WebElement continueButton = driver.findElement(By.id("button"));
        continueButton.click();
    }


}
