package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class FacebookTest extends BaseClass {
    @Test
    public  void fbWebsite_RedirectOnToValidScreen(){
       String fbLoginTitle =  driver.getTitle();
        Assert.assertEquals("Facebook – log in or sign up", fbLoginTitle);
    }

    @Test
    public void fbWebsite_CreateNewAccountTest() throws InterruptedException {
        WebElement createPopup = driver.findElement(By.linkText("Create new account"));
        boolean flag = createPopup.isDisplayed();
        Assert.assertEquals(true, flag);
        createPopup.click();
        Thread.sleep(2000);

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(8));
        WebElement ele = wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("firstname")));
        ele.sendKeys("abc");

        driver.findElement(By.name("firstname")).sendKeys("Zain");
        driver.findElement(By.name("lastname")).sendKeys("Khan");
        driver.findElement(By.name("reg_email__")).sendKeys("z@mail.com");
        driver.findElement(By.name("reg_passwd__")).sendKeys("z123123");

        WebElement day = driver.findElement(By.id("day"));
        Select select = new Select(day);
        select.selectByValue("1");
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.id("month"));
        Select selectt = new Select(month);
        selectt.selectByIndex(2);
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.id("year"));
        Select selecct = new Select(year);
        selecct.selectByVisibleText("2022");
        Thread.sleep(2000);
    }


}
