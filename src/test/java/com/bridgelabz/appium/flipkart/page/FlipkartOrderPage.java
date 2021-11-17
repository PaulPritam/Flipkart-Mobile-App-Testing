package com.bridgelabz.appium.flipkart.page;

import com.bridgelabz.appium.flipkart.base.Base;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class FlipkartOrderPage extends Base {

    public void select_Order() {
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
        WebElement searchIcon = driver.findElement(By.id("search_icon"));
        searchIcon.click();

        WebElement searchBar = driver.findElement(By.id("search_autoCompleteTextView"));
        searchBar.sendKeys("iPhone 12");
    }

    public void clickOrder() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement product = driver.findElement(By.xpath("//android.widget.TextView[@text='iphone 12']"));
        product.click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement requiredProduct = driver.findElement(By.xpath("//android.widget.TextView[@text='APPLE iPhone 12 (Blue, 128 GB)']"));
        requiredProduct.click();
    }

    public void add_To_Cart() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement addToCart = driver.findElement(By.xpath("//android.widget.TextView[@text='ADD TO CART']"));
        addToCart.click();
    }

    public void proceed_To_Cart() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement proceedToCartButton = driver.findElement(By.xpath("//android.widget.TextView[@text='GO TO CART']"));
        proceedToCartButton.click();
    }

    public void place_order() {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        WebElement orderNowButton = driver.findElement(By.xpath("//android.widget.TextView[@text='Place Order ']"));
        orderNowButton.click();
    }

}
