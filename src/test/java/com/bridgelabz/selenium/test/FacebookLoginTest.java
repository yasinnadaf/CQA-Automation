package com.bridgelabz.selenium.test;

import com.bridgelabz.selenium.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.IOException;

public class FacebookLoginTest extends BaseClass {

    @Test
    public void facebookLogin_Success() throws InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("8208139338");
        driver.findElement(By.id("pass")).sendKeys("Yasin@786");
        WebElement loginBtn = driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click", loginBtn);
        Thread.sleep(1500);

//        String homeTitle = driver.getTitle();
//        Assert.assertEquals("(4) Facebook", homeTitle);
//        Thread.sleep(2000);

        js.executeScript("window.scrollBy(0, 400)"); // down vertically scroll
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, -400)"); // up vertically scroll
        Thread.sleep(2000);

        js.executeScript("alert('Logged in successfully');");
        driver.switchTo().alert().accept();
        Thread.sleep(2000);
        js.executeScript("window.scrollBy(0, document.body.scrollHeight)");
        Thread.sleep(2000);
    }

    @Test
    public void picUploadFacebook_AutoIt() throws IOException, InterruptedException {
        JavascriptExecutor js = (JavascriptExecutor) driver;

        driver.findElement(By.id("email")).sendKeys("8208139338");
        driver.findElement(By.id("pass")).sendKeys("Yasin@786");
        WebElement loginBtn = driver.findElement(By.name("login"));
        js.executeScript("arguments[0].click", loginBtn);
        Thread.sleep(2000);

        WebElement choosePic = driver.findElement(By.xpath("//span[contains(text(),'Photo/video')]"));
        choosePic.click();
        Thread.sleep(2000);

        WebElement choosePicc = driver.findElement(By.xpath("//span[contains(text(),'Add photos/videos')]"));
        choosePicc.click();
        Runtime.getRuntime().exec("C:\\Users\\Yasin Nadaf\\Documents\\FbPicUpload.exe");
        Thread.sleep(2000);
        System.out.println("File uploaded success");
    }

}
