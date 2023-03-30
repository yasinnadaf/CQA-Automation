package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class DatePicker extends BaseClass {

    @BeforeTest
    public void setup() throws InterruptedException {
        initializationTest();
        driver.get("https://demo.guru99.com/test/");
        Thread.sleep(2000);
    }

    @Test
    public void enterDateAndTime() throws InterruptedException {
        WebElement dateCalender = driver.findElement(By.name("bdaytime"));
        dateCalender.click();
        dateCalender.sendKeys("3272023");
        Thread.sleep(1000);

        dateCalender.sendKeys(Keys.TAB);
        dateCalender.sendKeys("0150pm");
        Thread.sleep(1000);
    }

    @AfterTest
    public void closeBrowser(){
        browserClose();
    }

}